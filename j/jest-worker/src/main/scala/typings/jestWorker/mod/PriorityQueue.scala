package typings.jestWorker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-worker", "PriorityQueue")
@js.native
open class PriorityQueue protected ()
  extends StObject
     with TaskQueue {
  def this(_computePriority: ComputeTaskPriorityCallback) = this()
  
  /* private */ var _computePriority: Any = js.native
  
  def _enqueue(task: QueueChildMessage, queue: MinHeap[QueueItem]): Unit = js.native
  
  def _getWorkerQueue(workerId: Double): MinHeap[QueueItem] = js.native
  
  /* private */ var _queue: Any = js.native
  
  /* private */ var _sharedQueue: Any = js.native
}
