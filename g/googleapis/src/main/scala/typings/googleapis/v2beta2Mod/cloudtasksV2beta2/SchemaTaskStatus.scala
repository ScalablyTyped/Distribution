package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Status of the task.
  */
@js.native
trait SchemaTaskStatus extends StObject {
  
  /**
    * Output only. The number of attempts dispatched.  This count includes
    * attempts which have been dispatched but haven&#39;t received a response.
    */
  var attemptDispatchCount: js.UndefOr[Double] = js.native
  
  /**
    * Output only. The number of attempts which have received a response.  This
    * field is not calculated for pull tasks.
    */
  var attemptResponseCount: js.UndefOr[Double] = js.native
  
  /**
    * Output only. The status of the task&#39;s first attempt.  Only
    * dispatch_time will be set. The other AttemptStatus information is not
    * retained by Cloud Tasks.  This field is not calculated for pull tasks.
    */
  var firstAttemptStatus: js.UndefOr[SchemaAttemptStatus] = js.native
  
  /**
    * Output only. The status of the task&#39;s last attempt.  This field is
    * not calculated for pull tasks.
    */
  var lastAttemptStatus: js.UndefOr[SchemaAttemptStatus] = js.native
}
object SchemaTaskStatus {
  
  @scala.inline
  def apply(): SchemaTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTaskStatus]
  }
  
  @scala.inline
  implicit class SchemaTaskStatusMutableBuilder[Self <: SchemaTaskStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttemptDispatchCount(value: Double): Self = StObject.set(x, "attemptDispatchCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttemptDispatchCountUndefined: Self = StObject.set(x, "attemptDispatchCount", js.undefined)
    
    @scala.inline
    def setAttemptResponseCount(value: Double): Self = StObject.set(x, "attemptResponseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttemptResponseCountUndefined: Self = StObject.set(x, "attemptResponseCount", js.undefined)
    
    @scala.inline
    def setFirstAttemptStatus(value: SchemaAttemptStatus): Self = StObject.set(x, "firstAttemptStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstAttemptStatusUndefined: Self = StObject.set(x, "firstAttemptStatus", js.undefined)
    
    @scala.inline
    def setLastAttemptStatus(value: SchemaAttemptStatus): Self = StObject.set(x, "lastAttemptStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAttemptStatusUndefined: Self = StObject.set(x, "lastAttemptStatus", js.undefined)
  }
}
