package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingEvent extends StObject {
  
  /** The current number of workers the job has. */
  var currentNumWorkers: js.UndefOr[String] = js.undefined
  
  /** A message describing why the system decided to adjust the current number of workers, why it failed, or why the system decided to not make any changes to the number of workers. */
  var description: js.UndefOr[StructuredMessage] = js.undefined
  
  /** The type of autoscaling event to report. */
  var eventType: js.UndefOr[String] = js.undefined
  
  /** The target number of workers the worker pool wants to resize to use. */
  var targetNumWorkers: js.UndefOr[String] = js.undefined
  
  /** The time this event was emitted to indicate a new target or current num_workers value. */
  var time: js.UndefOr[String] = js.undefined
  
  /** A short and friendly name for the worker pool this event refers to, populated from the value of PoolStageRelation::user_pool_name. */
  var workerPool: js.UndefOr[String] = js.undefined
}
object AutoscalingEvent {
  
  inline def apply(): AutoscalingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingEvent]
  }
  
  extension [Self <: AutoscalingEvent](x: Self) {
    
    inline def setCurrentNumWorkers(value: String): Self = StObject.set(x, "currentNumWorkers", value.asInstanceOf[js.Any])
    
    inline def setCurrentNumWorkersUndefined: Self = StObject.set(x, "currentNumWorkers", js.undefined)
    
    inline def setDescription(value: StructuredMessage): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setTargetNumWorkers(value: String): Self = StObject.set(x, "targetNumWorkers", value.asInstanceOf[js.Any])
    
    inline def setTargetNumWorkersUndefined: Self = StObject.set(x, "targetNumWorkers", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setWorkerPool(value: String): Self = StObject.set(x, "workerPool", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolUndefined: Self = StObject.set(x, "workerPool", js.undefined)
  }
}
