package typings.jsDashPriorityDashQueue.jsDashPriorityDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractPriorityQueue[T] extends js.Object {
  /**
    * Returns the number of elements in the queue
    */
  var length: Double
  /**
    * Removes all values from the queue
    */
  def clear(): Unit
  /**
    * Returns the smallest item in the queue and removes it from the queue
    */
  def dequeue(): T
  /**
    * Returns the smallest item in the queue and leaves the queue unchanged
    */
  def peek(): T
  /**
    * Inserts a new value in the queue
    */
  def queue(value: T): Unit
}

object AbstractPriorityQueue {
  @scala.inline
  def apply[T](clear: () => Unit, dequeue: () => T, length: Double, peek: () => T, queue: T => Unit): AbstractPriorityQueue[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), dequeue = js.Any.fromFunction0(dequeue), length = length, peek = js.Any.fromFunction0(peek), queue = js.Any.fromFunction1(queue))
  
    __obj.asInstanceOf[AbstractPriorityQueue[T]]
  }
}

