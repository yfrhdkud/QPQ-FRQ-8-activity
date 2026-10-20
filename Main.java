import java.util.Scanner;

public class Main {

    public int[] getSubArray(int[] arr, int startIndex, int endIndex){
        int length = endIndex - startIndex + 1;
        int[] result = new int[length];

        for (int i = startIndex; i <= endIndex; i++) {
            result[i - startIndex] = arr[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            Main obj = new Main();

            System.out.print("Enter the number of elements: ");
            int n = scan.nextInt();

            int[] arr = new int[n];

            System.out.print("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            System.out.print("Enter the starting index of the sub-array: ");
            int startIndex = scan.nextInt();
            System.out.print("Enter the ending index of the sub-array: ");
            int endIndex = scan.nextInt();

            int[] subArray = obj.getSubArray(arr, startIndex, endIndex);

            System.out.print("Sub-array: ");
            for (int num : subArray) {
               System.out.print(num + " "); 
            }

        }
    }
}