package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2ListTenantsResponse extends StObject {
  
  /**
    * The token to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of tenants under the given agent project.
    */
  var tenants: js.UndefOr[js.Array[SchemaGoogleCloudIdentitytoolkitAdminV2Tenant]] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2ListTenantsResponse {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2ListTenantsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2ListTenantsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2ListTenantsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTenants(value: js.Array[SchemaGoogleCloudIdentitytoolkitAdminV2Tenant]): Self = StObject.set(x, "tenants", value.asInstanceOf[js.Any])
    
    inline def setTenantsUndefined: Self = StObject.set(x, "tenants", js.undefined)
    
    inline def setTenantsVarargs(value: SchemaGoogleCloudIdentitytoolkitAdminV2Tenant*): Self = StObject.set(x, "tenants", js.Array(value*))
  }
}
