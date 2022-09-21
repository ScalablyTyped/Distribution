package typings.googleapis.iamV2betaMod.iamV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePoliciesListpolicies
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of policies to return. IAM ignores this value and uses the value 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token received in a ListPoliciesResponse. Provide this token to retrieve the next page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource that the policy is attached to, along with the kind of policy to list. Format: `policies/{attachment_point\}/denypolicies` The attachment point is identified by its URL-encoded full resource name, which means that the forward-slash character, `/`, must be written as `%2F`. For example, `policies/cloudresourcemanager.googleapis.com%2Fprojects%2Fmy-project/denypolicies`. For organizations and folders, use the numeric ID in the full resource name. For projects, you can use the alphanumeric or the numeric ID.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourcePoliciesListpolicies {
  
  inline def apply(): ParamsResourcePoliciesListpolicies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePoliciesListpolicies]
  }
  
  extension [Self <: ParamsResourcePoliciesListpolicies](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
