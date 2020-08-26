package typings.heap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("heap", JSImport.Namespace)
@js.native
// Constructor
class ^[T] () extends Heap[T] {
  def this(cmp: js.Function2[/* a */ T, /* b */ T, Double]) = this()
}

@JSImport("heap", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // Build the heap.
  def heapify[T](array: js.Array[T]): Heap[T] = js.native
  def heapify[T](array: js.Array[T], cmp: js.Function2[/* a */ T, /* b */ T, Double]): Heap[T] = js.native
  // Find the n largest elements in a dataset.
  def nlargest[T](array: js.Array[T], n: Double): js.Array[T] = js.native
  def nlargest[T](array: js.Array[T], n: Double, cmp: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
  // Find the n smallest elements in a dataset.
  def nsmallest[T](array: js.Array[T], n: Double): js.Array[T] = js.native
  def nsmallest[T](array: js.Array[T], n: Double, cmp: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
  // Pop the smallest item off the array, maintaining the heap invariant.
  def pop[T](array: js.Array[T]): T = js.native
  def pop[T](array: js.Array[T], cmp: js.Function2[/* a */ T, /* b */ T, Double]): T = js.native
  // Static Methods
  // Push item onto array, maintaining the heap invariant.
  def push[T](array: js.Array[T], item: T): Unit = js.native
  def push[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): Unit = js.native
  // Fast version of a heappush followed by a heappop.
  def pushpop[T](array: js.Array[T], item: T): T = js.native
  def pushpop[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): T = js.native
  // Pop and return the current smallest value, and add the new item.
  // This is more efficient than heappop() followed by heappush(), and can be more appropriate when using a fixed size heap. Note that the value returned may be larger than item!
  def replace[T](array: js.Array[T], item: T): T = js.native
  def replace[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): T = js.native
  // Update the position of the given item in the heap. This function should be called every time the item is being modified.
  def updateItem[T](array: js.Array[T], item: T): Unit = js.native
  def updateItem[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): Unit = js.native
}

