package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2ListInboundSamlConfigsResponse extends StObject {
  
  /**
    * The set of configs.
    */
  var inboundSamlConfigs: js.UndefOr[js.Array[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2ListInboundSamlConfigsResponse {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2ListInboundSamlConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2ListInboundSamlConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2ListInboundSamlConfigsResponse](x: Self) {
    
    inline def setInboundSamlConfigs(value: js.Array[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig]): Self = StObject.set(x, "inboundSamlConfigs", value.asInstanceOf[js.Any])
    
    inline def setInboundSamlConfigsUndefined: Self = StObject.set(x, "inboundSamlConfigs", js.undefined)
    
    inline def setInboundSamlConfigsVarargs(value: SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig*): Self = StObject.set(x, "inboundSamlConfigs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
