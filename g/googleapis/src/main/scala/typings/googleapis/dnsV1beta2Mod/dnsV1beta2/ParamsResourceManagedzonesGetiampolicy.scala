package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagedzonesGetiampolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleIamV1GetIamPolicyRequest] = js.undefined
  
  /**
    * REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagedzonesGetiampolicy {
  
  inline def apply(): ParamsResourceManagedzonesGetiampolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagedzonesGetiampolicy]
  }
  
  extension [Self <: ParamsResourceManagedzonesGetiampolicy](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleIamV1GetIamPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
