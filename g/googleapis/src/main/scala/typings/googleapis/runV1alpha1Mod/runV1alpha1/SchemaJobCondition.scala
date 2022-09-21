package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobCondition extends StObject {
  
  /**
    * Optional. Last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Human readable message indicating details about the current status.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. One-word CamelCase reason for the condition's last transition.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. How to interpret failures of this condition, one of Error, Warning, Info
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Status of the condition, one of True, False, Unknown.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types include: * "Completed": True when the Job has successfully completed. * "Started": True when the Job has successfully started running. * "ResourcesAvailable": True when underlying resources have been provisioned.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaJobCondition {
  
  inline def apply(): SchemaJobCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobCondition]
  }
  
  extension [Self <: SchemaJobCondition](x: Self) {
    
    inline def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    inline def setLastTransitionTimeNull: Self = StObject.set(x, "lastTransitionTime", null)
    
    inline def setLastTransitionTimeUndefined: Self = StObject.set(x, "lastTransitionTime", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
