package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceResponsepolicyrulesUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    */
  var clientOperationId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the project addressed by this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaResponsePolicyRule] = js.undefined
  
  /**
    * User assigned name of the Response Policy containing the Response Policy Rule.
    */
  var responsePolicy: js.UndefOr[String] = js.undefined
  
  /**
    * User assigned name of the Response Policy Rule addressed by this request.
    */
  var responsePolicyRule: js.UndefOr[String] = js.undefined
}
object ParamsResourceResponsepolicyrulesUpdate {
  
  inline def apply(): ParamsResourceResponsepolicyrulesUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResponsepolicyrulesUpdate]
  }
  
  extension [Self <: ParamsResourceResponsepolicyrulesUpdate](x: Self) {
    
    inline def setClientOperationId(value: String): Self = StObject.set(x, "clientOperationId", value.asInstanceOf[js.Any])
    
    inline def setClientOperationIdUndefined: Self = StObject.set(x, "clientOperationId", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRequestBody(value: SchemaResponsePolicyRule): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponsePolicy(value: String): Self = StObject.set(x, "responsePolicy", value.asInstanceOf[js.Any])
    
    inline def setResponsePolicyRule(value: String): Self = StObject.set(x, "responsePolicyRule", value.asInstanceOf[js.Any])
    
    inline def setResponsePolicyRuleUndefined: Self = StObject.set(x, "responsePolicyRule", js.undefined)
    
    inline def setResponsePolicyUndefined: Self = StObject.set(x, "responsePolicy", js.undefined)
  }
}
