package typings.googleapis.policysimulatorV1beta1Mod.policysimulatorV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicysimulatorV1beta1ExplainedAccess extends StObject {
  
  /**
    * Whether the member in the access tuple has permission to access the resource in the access tuple under the given policies.
    */
  var accessState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the AccessState is `UNKNOWN`, this field contains a list of errors explaining why the result is `UNKNOWN`. If the `AccessState` is `GRANTED` or `NOT_GRANTED`, this field is omitted.
    */
  var errors: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
  
  /**
    * If the AccessState is `UNKNOWN`, this field contains the policies that led to that result. If the `AccessState` is `GRANTED` or `NOT_GRANTED`, this field is omitted.
    */
  var policies: js.UndefOr[js.Array[SchemaGoogleCloudPolicysimulatorV1beta1ExplainedPolicy]] = js.undefined
}
object SchemaGoogleCloudPolicysimulatorV1beta1ExplainedAccess {
  
  inline def apply(): SchemaGoogleCloudPolicysimulatorV1beta1ExplainedAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicysimulatorV1beta1ExplainedAccess]
  }
  
  extension [Self <: SchemaGoogleCloudPolicysimulatorV1beta1ExplainedAccess](x: Self) {
    
    inline def setAccessState(value: String): Self = StObject.set(x, "accessState", value.asInstanceOf[js.Any])
    
    inline def setAccessStateNull: Self = StObject.set(x, "accessState", null)
    
    inline def setAccessStateUndefined: Self = StObject.set(x, "accessState", js.undefined)
    
    inline def setErrors(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setPolicies(value: js.Array[SchemaGoogleCloudPolicysimulatorV1beta1ExplainedPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: SchemaGoogleCloudPolicysimulatorV1beta1ExplainedPolicy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
