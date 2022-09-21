package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueueStats extends StObject {
  
  /**
    * Output only. The number of requests that the queue has dispatched but has not received a reply for yet.
    */
  var concurrentDispatchesCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current maximum number of tasks per second executed by the queue. The maximum value of this variable is controlled by the RateLimits of the Queue. However, this value could be less to avoid overloading the endpoints tasks in the queue are targeting.
    */
  var effectiveExecutionRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The number of tasks that the queue has dispatched and received a reply for during the last minute. This variable counts both successful and non-successful executions.
    */
  var executedLastMinuteCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. An estimation of the nearest time in the future where a task in the queue is scheduled to be executed.
    */
  var oldestEstimatedArrivalTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. An estimation of the number of tasks in the queue, that is, the tasks in the queue that haven't been executed, the tasks in the queue which the queue has dispatched but has not yet received a reply for, and the failed tasks that the queue is retrying.
    */
  var tasksCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaQueueStats {
  
  inline def apply(): SchemaQueueStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueueStats]
  }
  
  extension [Self <: SchemaQueueStats](x: Self) {
    
    inline def setConcurrentDispatchesCount(value: String): Self = StObject.set(x, "concurrentDispatchesCount", value.asInstanceOf[js.Any])
    
    inline def setConcurrentDispatchesCountNull: Self = StObject.set(x, "concurrentDispatchesCount", null)
    
    inline def setConcurrentDispatchesCountUndefined: Self = StObject.set(x, "concurrentDispatchesCount", js.undefined)
    
    inline def setEffectiveExecutionRate(value: Double): Self = StObject.set(x, "effectiveExecutionRate", value.asInstanceOf[js.Any])
    
    inline def setEffectiveExecutionRateNull: Self = StObject.set(x, "effectiveExecutionRate", null)
    
    inline def setEffectiveExecutionRateUndefined: Self = StObject.set(x, "effectiveExecutionRate", js.undefined)
    
    inline def setExecutedLastMinuteCount(value: String): Self = StObject.set(x, "executedLastMinuteCount", value.asInstanceOf[js.Any])
    
    inline def setExecutedLastMinuteCountNull: Self = StObject.set(x, "executedLastMinuteCount", null)
    
    inline def setExecutedLastMinuteCountUndefined: Self = StObject.set(x, "executedLastMinuteCount", js.undefined)
    
    inline def setOldestEstimatedArrivalTime(value: String): Self = StObject.set(x, "oldestEstimatedArrivalTime", value.asInstanceOf[js.Any])
    
    inline def setOldestEstimatedArrivalTimeNull: Self = StObject.set(x, "oldestEstimatedArrivalTime", null)
    
    inline def setOldestEstimatedArrivalTimeUndefined: Self = StObject.set(x, "oldestEstimatedArrivalTime", js.undefined)
    
    inline def setTasksCount(value: String): Self = StObject.set(x, "tasksCount", value.asInstanceOf[js.Any])
    
    inline def setTasksCountNull: Self = StObject.set(x, "tasksCount", null)
    
    inline def setTasksCountUndefined: Self = StObject.set(x, "tasksCount", js.undefined)
  }
}
