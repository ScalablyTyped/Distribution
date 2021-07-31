package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of a task attempt.
  */
trait SchemaAttemptStatus extends StObject {
  
  /**
    * Output only. The time that this attempt was dispatched.  `dispatch_time`
    * will be truncated to the nearest microsecond.
    */
  var dispatchTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The response from the target for this attempt.  If the task
    * has not been attempted or the task is currently running then the response
    * status is unset.
    */
  var responseStatus: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Output only. The time that this attempt response was received.
    * `response_time` will be truncated to the nearest microsecond.
    */
  var responseTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The time that this attempt was scheduled.  `schedule_time`
    * will be truncated to the nearest microsecond.
    */
  var scheduleTime: js.UndefOr[String] = js.undefined
}
object SchemaAttemptStatus {
  
  @scala.inline
  def apply(): SchemaAttemptStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttemptStatus]
  }
  
  @scala.inline
  implicit class SchemaAttemptStatusMutableBuilder[Self <: SchemaAttemptStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispatchTime(value: String): Self = StObject.set(x, "dispatchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispatchTimeUndefined: Self = StObject.set(x, "dispatchTime", js.undefined)
    
    @scala.inline
    def setResponseStatus(value: SchemaStatus): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatusUndefined: Self = StObject.set(x, "responseStatus", js.undefined)
    
    @scala.inline
    def setResponseTime(value: String): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTimeUndefined: Self = StObject.set(x, "responseTime", js.undefined)
    
    @scala.inline
    def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
  }
}
