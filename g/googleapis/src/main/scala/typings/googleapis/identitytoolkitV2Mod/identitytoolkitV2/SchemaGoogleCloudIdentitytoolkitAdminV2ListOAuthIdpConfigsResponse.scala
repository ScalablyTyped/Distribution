package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2ListOAuthIdpConfigsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The set of configs.
    */
  var oauthIdpConfigs: js.UndefOr[js.Array[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig]] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2ListOAuthIdpConfigsResponse {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2ListOAuthIdpConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2ListOAuthIdpConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2ListOAuthIdpConfigsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOauthIdpConfigs(value: js.Array[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig]): Self = StObject.set(x, "oauthIdpConfigs", value.asInstanceOf[js.Any])
    
    inline def setOauthIdpConfigsUndefined: Self = StObject.set(x, "oauthIdpConfigs", js.undefined)
    
    inline def setOauthIdpConfigsVarargs(value: SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig*): Self = StObject.set(x, "oauthIdpConfigs", js.Array(value*))
  }
}
