package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudOrgpolicyV2ListPoliciesResponse extends StObject {
  
  /**
    * Page token used to retrieve the next page. This is currently not used, but the server may at any point start supplying a valid token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * All `Policies` that exist on the resource. It will be empty if no `Policies` are set.
    */
  var policies: js.UndefOr[js.Array[SchemaGoogleCloudOrgpolicyV2Policy]] = js.undefined
}
object SchemaGoogleCloudOrgpolicyV2ListPoliciesResponse {
  
  inline def apply(): SchemaGoogleCloudOrgpolicyV2ListPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudOrgpolicyV2ListPoliciesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudOrgpolicyV2ListPoliciesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPolicies(value: js.Array[SchemaGoogleCloudOrgpolicyV2Policy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: SchemaGoogleCloudOrgpolicyV2Policy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
