package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for acknowledging a task using AcknowledgeTask.
  */
@js.native
trait SchemaAcknowledgeTaskRequest extends StObject {
  
  /**
    * Required.  The task&#39;s current schedule time, available in the
    * schedule_time returned by LeaseTasks response or RenewLease response.
    * This restriction is to ensure that your worker currently holds the lease.
    */
  var scheduleTime: js.UndefOr[String] = js.native
}
object SchemaAcknowledgeTaskRequest {
  
  @scala.inline
  def apply(): SchemaAcknowledgeTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcknowledgeTaskRequest]
  }
  
  @scala.inline
  implicit class SchemaAcknowledgeTaskRequestMutableBuilder[Self <: SchemaAcknowledgeTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
  }
}
