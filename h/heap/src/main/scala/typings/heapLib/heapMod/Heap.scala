package typings
package heapLib.heapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heap[T] extends js.Object {
  def copy(): Heap[T]
  // Determine whether the heap is empty.
  def empty(): scala.Boolean
  def front(): T
  // Rebuild the heap. This method may come handy when the priority of the internal data is being modified.
  def heapify(): scala.Unit
  def insert(item: T): scala.Unit
  // Return the smallest item of the heap.
  def peek(): T
  // Pop the smallest item off the heap and return it.
  def pop(): T
  // Instance Methods
  // Push item onto heap.
  def push(item: T): scala.Unit
  // Fast version of a push followed by a pop.
  def pushpop(item: T): T
  // Pop and return the current smallest value, and add the new item.
  // This is more efficient than pop() followed by push(), and can be more appropriate when using a fixed size heap.
  // Note that the value returned may be larger than item!
  def replace(item: T): T
  // Get the number of elements stored in the heap.
  def size(): scala.Double
  // Return the array representation of the heap. (note: the array is a shallow copy of the heap's internal nodes)
  def toArray(): js.Array[T]
  def top(): T
  // Update the position of the given item in the heap. This function should be called every time the item is being modified.
  def updateItem(item: T): scala.Unit
}

object Heap {
  @scala.inline
  def apply[T](
    clone: () => Heap[T],
    copy: () => Heap[T],
    empty: () => scala.Boolean,
    front: () => T,
    heapify: () => scala.Unit,
    insert: T => scala.Unit,
    peek: () => T,
    pop: () => T,
    push: T => scala.Unit,
    pushpop: T => T,
    replace: T => T,
    size: () => scala.Double,
    toArray: () => js.Array[T],
    top: () => T,
    updateItem: T => scala.Unit
  ): Heap[T] = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), copy = js.Any.fromFunction0(copy), empty = js.Any.fromFunction0(empty), front = js.Any.fromFunction0(front), heapify = js.Any.fromFunction0(heapify), insert = js.Any.fromFunction1(insert), peek = js.Any.fromFunction0(peek), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), pushpop = js.Any.fromFunction1(pushpop), replace = js.Any.fromFunction1(replace), size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray), top = js.Any.fromFunction0(top), updateItem = js.Any.fromFunction1(updateItem))
  
    __obj.asInstanceOf[Heap[T]]
  }
}

