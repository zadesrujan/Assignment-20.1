package generic;
//here we cretaed test as generic which that organizes a set of related classes and interfaces.
import java.util.HashMap;
import java.util.Iterator;

public class Hashmap {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
      	//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
		HashMap<Integer,String> employeeNames=new HashMap<Integer,String>();
		//put(K key, V value) method is used to associate the specified 
		//value with the specified key in this map.
		employeeNames.put(1,"Vidu");
		 employeeNames.put(2,"Chintu");
		 employeeNames.put(3,"Srujan");
		 employeeNames.put(4,"Vidisha");
		
		//system : is a class in java language pacakge.
	  		//out : static member of the system class.
	  		//println : to print what is output.ln means nextline
	    
		System.out.println("Employees are:");
		
	//creating the values and iterating
		Iterator valueIterator= employeeNames.values().iterator();
//hasNext() method Returns true if this scanner has another token in its input. 
		while(valueIterator.hasNext())
		{
			System.out.println(valueIterator.next());	
			//system : is a class in java language pacakge.
	  		//out : static member of the system class.
	  		//println : to print what is output.ln means nextline
		    
		
		}
		  
	}


	}

