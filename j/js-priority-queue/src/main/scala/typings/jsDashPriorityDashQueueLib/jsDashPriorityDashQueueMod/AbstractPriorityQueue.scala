package typings
package jsDashPriorityDashQueueLib.jsDashPriorityDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractPriorityQueue[T] extends js.Object {
  /**
    * Returns the number of elements in the queue
    */
  var length: scala.Double
  /**
    * Removes all values from the queue
    */
  def clear(): scala.Unit
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
  def queue(value: T): scala.Unit
}

object AbstractPriorityQueue {
  @scala.inline
  def apply[T](
    clear: js.Function0[scala.Unit],
    dequeue: js.Function0[T],
    length: scala.Double,
    peek: js.Function0[T],
    queue: js.Function1[T, scala.Unit]
  ): AbstractPriorityQueue[T] = {
    val __obj = js.Dynamic.literal(clear = clear, dequeue = dequeue, length = length, peek = peek, queue = queue)
  
    __obj.asInstanceOf[AbstractPriorityQueue[T]]
  }
}

