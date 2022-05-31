package typings.heap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Heap {
    
    @JSGlobal("Heap")
    @js.native
    // Constructor
    class ^[T] ()
      extends typings.heap.mod.^[T] {
      def this(cmp: js.Function2[/* a */ T, /* b */ T, Double]) = this()
    }
    
    @JSGlobal("Heap")
    @js.native
    val ^ : js.Any = js.native
    
    // Build the heap.
    /* static member */
    inline def heapify[T](array: js.Array[T]): typings.heap.mod.Heap[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("heapify")(array.asInstanceOf[js.Any]).asInstanceOf[typings.heap.mod.Heap[T]]
    inline def heapify[T](array: js.Array[T], cmp: js.Function2[/* a */ T, /* b */ T, Double]): typings.heap.mod.Heap[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("heapify")(array.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[typings.heap.mod.Heap[T]]
    
    // Find the n largest elements in a dataset.
    /* static member */
    inline def nlargest[T](array: js.Array[T], n: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nlargest")(array.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def nlargest[T](array: js.Array[T], n: Double, cmp: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nlargest")(array.asInstanceOf[js.Any], n.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    // Find the n smallest elements in a dataset.
    /* static member */
    inline def nsmallest[T](array: js.Array[T], n: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nsmallest")(array.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def nsmallest[T](array: js.Array[T], n: Double, cmp: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nsmallest")(array.asInstanceOf[js.Any], n.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    // Pop the smallest item off the array, maintaining the heap invariant.
    /* static member */
    inline def pop[T](array: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(array.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def pop[T](array: js.Array[T], cmp: js.Function2[/* a */ T, /* b */ T, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pop")(array.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[T]
    
    // Static Methods
    // Push item onto array, maintaining the heap invariant.
    /* static member */
    inline def push[T](array: js.Array[T], item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def push[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    // Fast version of a heappush followed by a heappop.
    /* static member */
    inline def pushpop[T](array: js.Array[T], item: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pushpop")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def pushpop[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pushpop")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[T]
    
    // Pop and return the current smallest value, and add the new item.
    // This is more efficient than heappop() followed by heappush(), and can be more appropriate when using a fixed size heap. Note that the value returned may be larger than item!
    /* static member */
    inline def replace[T](array: js.Array[T], item: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def replace[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[T]
    
    // Update the position of the given item in the heap. This function should be called every time the item is being modified.
    /* static member */
    inline def updateItem[T](array: js.Array[T], item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateItem")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def updateItem[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateItem")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
