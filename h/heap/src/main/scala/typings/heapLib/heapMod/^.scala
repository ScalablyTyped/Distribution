package typings
package heapLib.heapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("heap", JSImport.Namespace)
@js.native
// Constructor
class ^[T] () extends Heap[T] {
  def this(cmp: js.Function2[/* a */ T, /* b */ T, scala.Double]) = this()
  /* CompleteClass */
  override def copy(): Heap[T] = js.native
  // Determine whether the heap is empty.
  /* CompleteClass */
  override def empty(): scala.Boolean = js.native
  /* CompleteClass */
  override def front(): T = js.native
  // Rebuild the heap. This method may come handy when the priority of the internal data is being modified.
  /* CompleteClass */
  override def heapify(): scala.Unit = js.native
  /* CompleteClass */
  override def insert(item: T): scala.Unit = js.native
  // Return the smallest item of the heap.
  /* CompleteClass */
  override def peek(): T = js.native
  // Pop the smallest item off the heap and return it.
  /* CompleteClass */
  override def pop(): T = js.native
  // Instance Methods
  // Push item onto heap.
  /* CompleteClass */
  override def push(item: T): scala.Unit = js.native
  // Fast version of a push followed by a pop.
  /* CompleteClass */
  override def pushpop(item: T): T = js.native
  // Pop and return the current smallest value, and add the new item.
  // This is more efficient than pop() followed by push(), and can be more appropriate when using a fixed size heap.
  // Note that the value returned may be larger than item!
  /* CompleteClass */
  override def replace(item: T): T = js.native
  // Get the number of elements stored in the heap.
  /* CompleteClass */
  override def size(): scala.Double = js.native
  // Return the array representation of the heap. (note: the array is a shallow copy of the heap's internal nodes)
  /* CompleteClass */
  override def toArray(): js.Array[T] = js.native
  /* CompleteClass */
  override def top(): T = js.native
  // Update the position of the given item in the heap. This function should be called every time the item is being modified.
  /* CompleteClass */
  override def updateItem(item: T): scala.Unit = js.native
}

@JSImport("heap", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // Build the heap.
  def heapify[T](array: js.Array[T]): Heap[T] = js.native
  def heapify[T](array: js.Array[T], cmp: js.Function2[/* a */ T, /* b */ T, scala.Double]): Heap[T] = js.native
  // Find the n largest elements in a dataset.
  def nlargest[T](array: js.Array[T], n: scala.Double): js.Array[T] = js.native
  def nlargest[T](array: js.Array[T], n: scala.Double, cmp: js.Function2[/* a */ T, /* b */ T, scala.Double]): js.Array[T] = js.native
  // Find the n smallest elements in a dataset.
  def nsmallest[T](array: js.Array[T], n: scala.Double): js.Array[T] = js.native
  def nsmallest[T](array: js.Array[T], n: scala.Double, cmp: js.Function2[/* a */ T, /* b */ T, scala.Double]): js.Array[T] = js.native
  // Pop the smallest item off the array, maintaining the heap invariant.
  def pop[T](array: js.Array[T]): T = js.native
  def pop[T](array: js.Array[T], cmp: js.Function2[/* a */ T, /* b */ T, scala.Double]): T = js.native
  // Static Methods
  // Push item onto array, maintaining the heap invariant.
  def push[T](array: js.Array[T], item: T): scala.Unit = js.native
  def push[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, scala.Double]): scala.Unit = js.native
  // Fast version of a heappush followed by a heappop.
  def pushpop[T](array: js.Array[T], item: T): T = js.native
  def pushpop[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, scala.Double]): T = js.native
  // Pop and return the current smallest value, and add the new item.
  // This is more efficient than heappop() followed by heappush(), and can be more appropriate when using a fixed size heap. Note that the value returned may be larger than item!
  def replace[T](array: js.Array[T], item: T): T = js.native
  def replace[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, scala.Double]): T = js.native
  // Update the position of the given item in the heap. This function should be called every time the item is being modified.
  def updateItem[T](array: js.Array[T], item: T): scala.Unit = js.native
  def updateItem[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, scala.Double]): scala.Unit = js.native
}

