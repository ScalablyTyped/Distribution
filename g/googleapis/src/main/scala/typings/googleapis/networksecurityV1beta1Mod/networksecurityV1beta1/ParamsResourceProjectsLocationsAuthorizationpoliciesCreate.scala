package typings.googleapis.networksecurityV1beta1Mod.networksecurityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAuthorizationpoliciesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Short name of the AuthorizationPolicy resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. "authz_policy".
    */
  var authorizationPolicyId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource of the AuthorizationPolicy. Must be in the format `projects/{project\}/locations/{location\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAuthorizationPolicy] = js.undefined
}
object ParamsResourceProjectsLocationsAuthorizationpoliciesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsAuthorizationpoliciesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAuthorizationpoliciesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAuthorizationpoliciesCreate](x: Self) {
    
    inline def setAuthorizationPolicyId(value: String): Self = StObject.set(x, "authorizationPolicyId", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationPolicyIdUndefined: Self = StObject.set(x, "authorizationPolicyId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaAuthorizationPolicy): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
