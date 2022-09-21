package typings.jestWorker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskQueue extends StObject {
  
  /**
    * Dequeues the next item from the queue for the specified worker
    * @param workerId the id of the worker for which the next task should be retrieved
    */
  def dequeue(workerId: Double): QueueChildMessage | Null = js.native
  
  /**
    * Enqueues the task in the queue for the specified worker or adds it to the
    * queue shared by all workers
    * @param task the task to queue
    * @param workerId the id of the worker that should process this task or undefined
    * if there's no preference.
    */
  def enqueue(task: QueueChildMessage): Unit = js.native
  def enqueue(task: QueueChildMessage, workerId: Double): Unit = js.native
}
