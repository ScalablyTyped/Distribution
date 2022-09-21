package typings.googleapis.servicedirectoryV1beta1Mod.servicedirectoryV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistrationpoliciesGetiampolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGetIamPolicyRequest] = js.undefined
  
  /**
    * REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRegistrationpoliciesGetiampolicy {
  
  inline def apply(): ParamsResourceProjectsLocationsRegistrationpoliciesGetiampolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistrationpoliciesGetiampolicy]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRegistrationpoliciesGetiampolicy](x: Self) {
    
    inline def setRequestBody(value: SchemaGetIamPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
