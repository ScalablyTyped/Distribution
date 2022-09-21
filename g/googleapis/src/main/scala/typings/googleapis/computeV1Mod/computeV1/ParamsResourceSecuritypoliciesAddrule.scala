package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSecuritypoliciesAddrule
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSecurityPolicyRule] = js.undefined
  
  /**
    * Name of the security policy to update.
    */
  var securityPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * If true, the request will not be committed.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceSecuritypoliciesAddrule {
  
  inline def apply(): ParamsResourceSecuritypoliciesAddrule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSecuritypoliciesAddrule]
  }
  
  extension [Self <: ParamsResourceSecuritypoliciesAddrule](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRequestBody(value: SchemaSecurityPolicyRule): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSecurityPolicy(value: String): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
