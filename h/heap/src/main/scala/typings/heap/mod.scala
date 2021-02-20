package typings.heap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("heap", JSImport.Namespace)
  @js.native
  // Constructor
  class ^[T] () extends Heap[T] {
    def this(cmp: js.Function2[/* a */ T, /* b */ T, Double]) = this()
  }
  
  // Build the heap.
  /* static member */
  @JSImport("heap", "heapify")
  @js.native
  def heapify[T](array: js.Array[T]): Heap[T] = js.native
  @JSImport("heap", "heapify")
  @js.native
  def heapify[T](array: js.Array[T], cmp: js.Function2[/* a */ T, /* b */ T, Double]): Heap[T] = js.native
  
  // Find the n largest elements in a dataset.
  /* static member */
  @JSImport("heap", "nlargest")
  @js.native
  def nlargest[T](array: js.Array[T], n: Double): js.Array[T] = js.native
  @JSImport("heap", "nlargest")
  @js.native
  def nlargest[T](array: js.Array[T], n: Double, cmp: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
  
  // Find the n smallest elements in a dataset.
  /* static member */
  @JSImport("heap", "nsmallest")
  @js.native
  def nsmallest[T](array: js.Array[T], n: Double): js.Array[T] = js.native
  @JSImport("heap", "nsmallest")
  @js.native
  def nsmallest[T](array: js.Array[T], n: Double, cmp: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
  
  // Pop the smallest item off the array, maintaining the heap invariant.
  /* static member */
  @JSImport("heap", "pop")
  @js.native
  def pop[T](array: js.Array[T]): T = js.native
  @JSImport("heap", "pop")
  @js.native
  def pop[T](array: js.Array[T], cmp: js.Function2[/* a */ T, /* b */ T, Double]): T = js.native
  
  // Static Methods
  // Push item onto array, maintaining the heap invariant.
  /* static member */
  @JSImport("heap", "push")
  @js.native
  def push[T](array: js.Array[T], item: T): Unit = js.native
  @JSImport("heap", "push")
  @js.native
  def push[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): Unit = js.native
  
  // Fast version of a heappush followed by a heappop.
  /* static member */
  @JSImport("heap", "pushpop")
  @js.native
  def pushpop[T](array: js.Array[T], item: T): T = js.native
  @JSImport("heap", "pushpop")
  @js.native
  def pushpop[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): T = js.native
  
  // Pop and return the current smallest value, and add the new item.
  // This is more efficient than heappop() followed by heappush(), and can be more appropriate when using a fixed size heap. Note that the value returned may be larger than item!
  /* static member */
  @JSImport("heap", "replace")
  @js.native
  def replace[T](array: js.Array[T], item: T): T = js.native
  @JSImport("heap", "replace")
  @js.native
  def replace[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): T = js.native
  
  // Update the position of the given item in the heap. This function should be called every time the item is being modified.
  /* static member */
  @JSImport("heap", "updateItem")
  @js.native
  def updateItem[T](array: js.Array[T], item: T): Unit = js.native
  @JSImport("heap", "updateItem")
  @js.native
  def updateItem[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): Unit = js.native
  
  @js.native
  trait Heap[T] extends StObject {
    
    def copy(): Heap[T] = js.native
    
    // Determine whether the heap is empty.
    def empty(): Boolean = js.native
    
    def front(): T = js.native
    
    // Rebuild the heap. This method may come handy when the priority of the internal data is being modified.
    def heapify(): Unit = js.native
    
    def insert(item: T): Unit = js.native
    
    // Return the smallest item of the heap.
    def peek(): T = js.native
    
    // Pop the smallest item off the heap and return it.
    def pop(): T = js.native
    
    // Instance Methods
    // Push item onto heap.
    def push(item: T): Unit = js.native
    
    // Fast version of a push followed by a pop.
    def pushpop(item: T): T = js.native
    
    // Pop and return the current smallest value, and add the new item.
    // This is more efficient than pop() followed by push(), and can be more appropriate when using a fixed size heap.
    // Note that the value returned may be larger than item!
    def replace(item: T): T = js.native
    
    // Get the number of elements stored in the heap.
    def size(): Double = js.native
    
    // Return the array representation of the heap. (note: the array is a shallow copy of the heap's internal nodes)
    def toArray(): js.Array[T] = js.native
    
    def top(): T = js.native
    
    // Update the position of the given item in the heap. This function should be called every time the item is being modified.
    def updateItem(item: T): Unit = js.native
  }
  object Heap {
    
    @scala.inline
    def apply[T](
      copy: () => Heap[T],
      empty: () => Boolean,
      front: () => T,
      heapify: () => Unit,
      insert: T => Unit,
      peek: () => T,
      pop: () => T,
      push: T => Unit,
      pushpop: T => T,
      replace: T => T,
      size: () => Double,
      toArray: () => js.Array[T],
      top: () => T,
      updateItem: T => Unit
    ): Heap[T] = {
      val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), empty = js.Any.fromFunction0(empty), front = js.Any.fromFunction0(front), heapify = js.Any.fromFunction0(heapify), insert = js.Any.fromFunction1(insert), peek = js.Any.fromFunction0(peek), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), pushpop = js.Any.fromFunction1(pushpop), replace = js.Any.fromFunction1(replace), size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray), top = js.Any.fromFunction0(top), updateItem = js.Any.fromFunction1(updateItem))
      __obj.asInstanceOf[Heap[T]]
    }
    
    @scala.inline
    implicit class HeapMutableBuilder[Self <: Heap[_], T] (val x: Self with Heap[T]) extends AnyVal {
      
      @scala.inline
      def setCopy(value: () => Heap[T]): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmpty(value: () => Boolean): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFront(value: () => T): Self = StObject.set(x, "front", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeapify(value: () => Unit): Self = StObject.set(x, "heapify", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInsert(value: T => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPeek(value: () => T): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPop(value: () => T): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPush(value: T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPushpop(value: T => T): Self = StObject.set(x, "pushpop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReplace(value: T => T): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToArray(value: () => js.Array[T]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTop(value: () => T): Self = StObject.set(x, "top", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateItem(value: T => Unit): Self = StObject.set(x, "updateItem", js.Any.fromFunction1(value))
    }
  }
}
