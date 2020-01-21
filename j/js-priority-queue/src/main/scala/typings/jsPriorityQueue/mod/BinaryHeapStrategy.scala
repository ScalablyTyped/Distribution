package typings.jsPriorityQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-priority-queue", "BinaryHeapStrategy")
@js.native
class BinaryHeapStrategy[T] () extends AbstractPriorityQueue[T] {
  /**
    * Returns the number of elements in the queue
    */
  /* CompleteClass */
  override var length: Double = js.native
  /**
    * Removes all values from the queue
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
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
  override def queue(value: T): Unit = js.native
}

