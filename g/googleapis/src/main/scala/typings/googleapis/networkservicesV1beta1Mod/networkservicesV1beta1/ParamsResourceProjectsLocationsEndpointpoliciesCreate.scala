package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEndpointpoliciesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Short name of the EndpointPolicy resource to be created. E.g. "CustomECS".
    */
  var endpointPolicyId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource of the EndpointPolicy. Must be in the format `projects/x/locations/global`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEndpointPolicy] = js.undefined
}
object ParamsResourceProjectsLocationsEndpointpoliciesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsEndpointpoliciesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEndpointpoliciesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEndpointpoliciesCreate](x: Self) {
    
    inline def setEndpointPolicyId(value: String): Self = StObject.set(x, "endpointPolicyId", value.asInstanceOf[js.Any])
    
    inline def setEndpointPolicyIdUndefined: Self = StObject.set(x, "endpointPolicyId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaEndpointPolicy): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
