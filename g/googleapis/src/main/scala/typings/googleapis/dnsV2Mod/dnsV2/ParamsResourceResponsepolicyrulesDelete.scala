package typings.googleapis.dnsV2Mod.dnsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceResponsepolicyrulesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    */
  var clientOperationId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the project addressed by this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * User assigned name of the Response Policy containing the Response Policy Rule.
    */
  var responsePolicy: js.UndefOr[String] = js.undefined
  
  /**
    * User assigned name of the Response Policy Rule addressed by this request.
    */
  var responsePolicyRule: js.UndefOr[String] = js.undefined
}
object ParamsResourceResponsepolicyrulesDelete {
  
  inline def apply(): ParamsResourceResponsepolicyrulesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResponsepolicyrulesDelete]
  }
  
  extension [Self <: ParamsResourceResponsepolicyrulesDelete](x: Self) {
    
    inline def setClientOperationId(value: String): Self = StObject.set(x, "clientOperationId", value.asInstanceOf[js.Any])
    
    inline def setClientOperationIdUndefined: Self = StObject.set(x, "clientOperationId", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setResponsePolicy(value: String): Self = StObject.set(x, "responsePolicy", value.asInstanceOf[js.Any])
    
    inline def setResponsePolicyRule(value: String): Self = StObject.set(x, "responsePolicyRule", value.asInstanceOf[js.Any])
    
    inline def setResponsePolicyRuleUndefined: Self = StObject.set(x, "responsePolicyRule", js.undefined)
    
    inline def setResponsePolicyUndefined: Self = StObject.set(x, "responsePolicy", js.undefined)
  }
}
