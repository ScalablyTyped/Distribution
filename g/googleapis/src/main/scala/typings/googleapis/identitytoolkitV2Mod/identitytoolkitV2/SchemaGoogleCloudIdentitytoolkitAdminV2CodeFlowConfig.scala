package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2CodeFlowConfig extends StObject {
  
  /**
    * Key ID for the private key.
    */
  var keyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Private key used for signing the client secret JWT.
    */
  var privateKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Apple Developer Team ID.
    */
  var teamId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2CodeFlowConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2CodeFlowConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2CodeFlowConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2CodeFlowConfig](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdNull: Self = StObject.set(x, "keyId", null)
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyNull: Self = StObject.set(x, "privateKey", null)
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTeamIdNull: Self = StObject.set(x, "teamId", null)
    
    inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
  }
}
