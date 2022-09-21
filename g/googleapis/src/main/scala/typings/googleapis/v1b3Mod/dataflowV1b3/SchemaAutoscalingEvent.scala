package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoscalingEvent extends StObject {
  
  /**
    * The current number of workers the job has.
    */
  var currentNumWorkers: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A message describing why the system decided to adjust the current number of workers, why it failed, or why the system decided to not make any changes to the number of workers.
    */
  var description: js.UndefOr[SchemaStructuredMessage] = js.undefined
  
  /**
    * The type of autoscaling event to report.
    */
  var eventType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target number of workers the worker pool wants to resize to use.
    */
  var targetNumWorkers: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time this event was emitted to indicate a new target or current num_workers value.
    */
  var time: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A short and friendly name for the worker pool this event refers to.
    */
  var workerPool: js.UndefOr[String | Null] = js.undefined
}
object SchemaAutoscalingEvent {
  
  inline def apply(): SchemaAutoscalingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingEvent]
  }
  
  extension [Self <: SchemaAutoscalingEvent](x: Self) {
    
    inline def setCurrentNumWorkers(value: String): Self = StObject.set(x, "currentNumWorkers", value.asInstanceOf[js.Any])
    
    inline def setCurrentNumWorkersNull: Self = StObject.set(x, "currentNumWorkers", null)
    
    inline def setCurrentNumWorkersUndefined: Self = StObject.set(x, "currentNumWorkers", js.undefined)
    
    inline def setDescription(value: SchemaStructuredMessage): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setTargetNumWorkers(value: String): Self = StObject.set(x, "targetNumWorkers", value.asInstanceOf[js.Any])
    
    inline def setTargetNumWorkersNull: Self = StObject.set(x, "targetNumWorkers", null)
    
    inline def setTargetNumWorkersUndefined: Self = StObject.set(x, "targetNumWorkers", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setWorkerPool(value: String): Self = StObject.set(x, "workerPool", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolNull: Self = StObject.set(x, "workerPool", null)
    
    inline def setWorkerPoolUndefined: Self = StObject.set(x, "workerPool", js.undefined)
  }
}
