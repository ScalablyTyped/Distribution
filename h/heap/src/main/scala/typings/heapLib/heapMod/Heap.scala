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
    clone: js.Function0[Heap[T]],
    copy: js.Function0[Heap[T]],
    empty: js.Function0[scala.Boolean],
    front: js.Function0[T],
    heapify: js.Function0[scala.Unit],
    insert: js.Function1[T, scala.Unit],
    peek: js.Function0[T],
    pop: js.Function0[T],
    push: js.Function1[T, scala.Unit],
    pushpop: js.Function1[T, T],
    replace: js.Function1[T, T],
    size: js.Function0[scala.Double],
    toArray: js.Function0[js.Array[T]],
    top: js.Function0[T],
    updateItem: js.Function1[T, scala.Unit]
  ): Heap[T] = {
    val __obj = js.Dynamic.literal(clone = clone, copy = copy, empty = empty, front = front, heapify = heapify, insert = insert, peek = peek, pop = pop, push = push, pushpop = pushpop, replace = replace, size = size, toArray = toArray, top = top, updateItem = updateItem)
  
    __obj.asInstanceOf[Heap[T]]
  }
}

