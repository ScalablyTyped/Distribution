package typings.googleapis.iamV2betaMod.iamV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePoliciesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the policy to retrieve. Format: `policies/{attachment_point\}/denypolicies/{policy_id\}` Use the URL-encoded full resource name, which means that the forward-slash character, `/`, must be written as `%2F`. For example, `policies/cloudresourcemanager.googleapis.com%2Fprojects%2Fmy-project/denypolicies/my-policy`. For organizations and folders, use the numeric ID in the full resource name. For projects, you can use the alphanumeric or the numeric ID.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePoliciesGet {
  
  inline def apply(): ParamsResourcePoliciesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePoliciesGet]
  }
  
  extension [Self <: ParamsResourcePoliciesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
