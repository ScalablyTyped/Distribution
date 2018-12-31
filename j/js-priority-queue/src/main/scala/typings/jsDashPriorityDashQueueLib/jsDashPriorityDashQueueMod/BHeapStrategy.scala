package typings
package jsDashPriorityDashQueueLib.jsDashPriorityDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-priority-queue", "BHeapStrategy")
@js.native
class BHeapStrategy[T] ()
  extends jsDashPriorityDashQueueLib.jsDashPriorityDashQueueMod.PriorityQueueNs.BHeapStrategy[T] {
  /**
    * Returns the number of elements in the queue
    */
  /* CompleteClass */
  override var length: scala.Double = js.native
  /**
    * Removes all values from the queue
    */
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /**
    * Returns the smallest item in the queue and removes it from the queue
    */
  /* CompleteClass */
  override def dequeue(): T = js.native
  /**
    * Returns the smallest item in the queue and leaves the queue unchanged
    */
  /* CompleteClass */
  override def peek(): T = js.native
  /**
    * Inserts a new value in the queue
    */
  /* CompleteClass */
  override def queue(value: T): scala.Unit = js.native
}

