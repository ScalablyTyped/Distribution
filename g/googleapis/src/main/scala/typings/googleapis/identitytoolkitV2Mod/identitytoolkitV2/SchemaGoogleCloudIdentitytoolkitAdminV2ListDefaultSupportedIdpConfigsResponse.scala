package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpConfigsResponse extends StObject {
  
  /**
    * The set of configs.
    */
  var defaultSupportedIdpConfigs: js.UndefOr[js.Array[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpConfigsResponse {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpConfigsResponse](x: Self) {
    
    inline def setDefaultSupportedIdpConfigs(value: js.Array[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig]): Self = StObject.set(x, "defaultSupportedIdpConfigs", value.asInstanceOf[js.Any])
    
    inline def setDefaultSupportedIdpConfigsUndefined: Self = StObject.set(x, "defaultSupportedIdpConfigs", js.undefined)
    
    inline def setDefaultSupportedIdpConfigsVarargs(value: SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig*): Self = StObject.set(x, "defaultSupportedIdpConfigs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
