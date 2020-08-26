package typings.jsPriorityQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractPriorityQueue[T] extends js.Object {
  /**
    * Returns the number of elements in the queue
    */
  var length: Double = js.native
  /**
    * Removes all values from the queue
    */
  def clear(): Unit = js.native
  /**
    * Returns the smallest item in the queue and removes it from the queue
    */
  def dequeue(): T = js.native
  /**
    * Returns the smallest item in the queue and leaves the queue unchanged
    */
  def peek(): T = js.native
  /**
    * Inserts a new value in the queue
    */
  def queue(value: T): Unit = js.native
}

object AbstractPriorityQueue {
  @scala.inline
  def apply[T](clear: () => Unit, dequeue: () => T, length: Double, peek: () => T, queue: T => Unit): AbstractPriorityQueue[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), dequeue = js.Any.fromFunction0(dequeue), length = length.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek), queue = js.Any.fromFunction1(queue))
    __obj.asInstanceOf[AbstractPriorityQueue[T]]
  }
  @scala.inline
  implicit class AbstractPriorityQueueOps[Self <: AbstractPriorityQueue[_], T] (val x: Self with AbstractPriorityQueue[T]) extends AnyVal {
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setDequeue(value: () => T): Self = this.set("dequeue", js.Any.fromFunction0(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeek(value: () => T): Self = this.set("peek", js.Any.fromFunction0(value))
    @scala.inline
    def setQueue(value: T => Unit): Self = this.set("queue", js.Any.fromFunction1(value))
  }
  
}

