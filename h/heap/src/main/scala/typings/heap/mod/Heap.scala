package typings.heap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heap[T] extends js.Object {
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
  implicit class HeapOps[Self <: Heap[_], T] (val x: Self with Heap[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCopy(value: () => Heap[T]): Self = this.set("copy", js.Any.fromFunction0(value))
    @scala.inline
    def setEmpty(value: () => Boolean): Self = this.set("empty", js.Any.fromFunction0(value))
    @scala.inline
    def setFront(value: () => T): Self = this.set("front", js.Any.fromFunction0(value))
    @scala.inline
    def setHeapify(value: () => Unit): Self = this.set("heapify", js.Any.fromFunction0(value))
    @scala.inline
    def setInsert(value: T => Unit): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setPeek(value: () => T): Self = this.set("peek", js.Any.fromFunction0(value))
    @scala.inline
    def setPop(value: () => T): Self = this.set("pop", js.Any.fromFunction0(value))
    @scala.inline
    def setPush(value: T => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def setPushpop(value: T => T): Self = this.set("pushpop", js.Any.fromFunction1(value))
    @scala.inline
    def setReplace(value: T => T): Self = this.set("replace", js.Any.fromFunction1(value))
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
    @scala.inline
    def setToArray(value: () => js.Array[T]): Self = this.set("toArray", js.Any.fromFunction0(value))
    @scala.inline
    def setTop(value: () => T): Self = this.set("top", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateItem(value: T => Unit): Self = this.set("updateItem", js.Any.fromFunction1(value))
  }
  
}

