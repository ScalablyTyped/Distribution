package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTaskStatus extends StObject {
  
  /**
    * Output only. The number of attempts dispatched. This count includes attempts which have been dispatched but haven't received a response.
    */
  var attemptDispatchCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The number of attempts which have received a response. This field is not calculated for pull tasks.
    */
  var attemptResponseCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The status of the task's first attempt. Only dispatch_time will be set. The other AttemptStatus information is not retained by Cloud Tasks. This field is not calculated for pull tasks.
    */
  var firstAttemptStatus: js.UndefOr[SchemaAttemptStatus] = js.undefined
  
  /**
    * Output only. The status of the task's last attempt. This field is not calculated for pull tasks.
    */
  var lastAttemptStatus: js.UndefOr[SchemaAttemptStatus] = js.undefined
}
object SchemaTaskStatus {
  
  inline def apply(): SchemaTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTaskStatus]
  }
  
  extension [Self <: SchemaTaskStatus](x: Self) {
    
    inline def setAttemptDispatchCount(value: Double): Self = StObject.set(x, "attemptDispatchCount", value.asInstanceOf[js.Any])
    
    inline def setAttemptDispatchCountNull: Self = StObject.set(x, "attemptDispatchCount", null)
    
    inline def setAttemptDispatchCountUndefined: Self = StObject.set(x, "attemptDispatchCount", js.undefined)
    
    inline def setAttemptResponseCount(value: Double): Self = StObject.set(x, "attemptResponseCount", value.asInstanceOf[js.Any])
    
    inline def setAttemptResponseCountNull: Self = StObject.set(x, "attemptResponseCount", null)
    
    inline def setAttemptResponseCountUndefined: Self = StObject.set(x, "attemptResponseCount", js.undefined)
    
    inline def setFirstAttemptStatus(value: SchemaAttemptStatus): Self = StObject.set(x, "firstAttemptStatus", value.asInstanceOf[js.Any])
    
    inline def setFirstAttemptStatusUndefined: Self = StObject.set(x, "firstAttemptStatus", js.undefined)
    
    inline def setLastAttemptStatus(value: SchemaAttemptStatus): Self = StObject.set(x, "lastAttemptStatus", value.asInstanceOf[js.Any])
    
    inline def setLastAttemptStatusUndefined: Self = StObject.set(x, "lastAttemptStatus", js.undefined)
  }
}
