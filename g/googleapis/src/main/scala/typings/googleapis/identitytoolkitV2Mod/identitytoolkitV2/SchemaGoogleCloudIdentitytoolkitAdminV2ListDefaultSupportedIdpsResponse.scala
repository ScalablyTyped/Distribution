package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpsResponse extends StObject {
  
  /**
    * The set of configs.
    */
  var defaultSupportedIdps: js.UndefOr[js.Array[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdp]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpsResponse {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpsResponse](x: Self) {
    
    inline def setDefaultSupportedIdps(value: js.Array[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdp]): Self = StObject.set(x, "defaultSupportedIdps", value.asInstanceOf[js.Any])
    
    inline def setDefaultSupportedIdpsUndefined: Self = StObject.set(x, "defaultSupportedIdps", js.undefined)
    
    inline def setDefaultSupportedIdpsVarargs(value: SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdp*): Self = StObject.set(x, "defaultSupportedIdps", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
