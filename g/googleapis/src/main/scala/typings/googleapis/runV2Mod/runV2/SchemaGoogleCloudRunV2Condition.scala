package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2Condition extends StObject {
  
  /**
    * A reason for the execution condition.
    */
  var executionReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human readable message indicating details about the current status.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A common (service-level) reason for this condition.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A reason for the revision condition.
    */
  var revisionReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How to interpret failures of this condition, one of Error, Warning, Info
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * State of the condition.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types common to all resources include: * "Ready": True when the Resource is ready.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRunV2Condition {
  
  inline def apply(): SchemaGoogleCloudRunV2Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2Condition]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2Condition](x: Self) {
    
    inline def setExecutionReason(value: String): Self = StObject.set(x, "executionReason", value.asInstanceOf[js.Any])
    
    inline def setExecutionReasonNull: Self = StObject.set(x, "executionReason", null)
    
    inline def setExecutionReasonUndefined: Self = StObject.set(x, "executionReason", js.undefined)
    
    inline def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    inline def setLastTransitionTimeNull: Self = StObject.set(x, "lastTransitionTime", null)
    
    inline def setLastTransitionTimeUndefined: Self = StObject.set(x, "lastTransitionTime", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRevisionReason(value: String): Self = StObject.set(x, "revisionReason", value.asInstanceOf[js.Any])
    
    inline def setRevisionReasonNull: Self = StObject.set(x, "revisionReason", null)
    
    inline def setRevisionReasonUndefined: Self = StObject.set(x, "revisionReason", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
