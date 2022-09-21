package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSslCertsCreateEphemeralRequest extends StObject {
  
  /**
    * Access token to include in the signed certificate.
    */
  var access_token: js.UndefOr[String | Null] = js.undefined
  
  /**
    * PEM encoded public key to include in the signed certificate.
    */
  var public_key: js.UndefOr[String | Null] = js.undefined
}
object SchemaSslCertsCreateEphemeralRequest {
  
  inline def apply(): SchemaSslCertsCreateEphemeralRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertsCreateEphemeralRequest]
  }
  
  extension [Self <: SchemaSslCertsCreateEphemeralRequest](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenNull: Self = StObject.set(x, "access_token", null)
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    inline def setPublic_keyNull: Self = StObject.set(x, "public_key", null)
    
    inline def setPublic_keyUndefined: Self = StObject.set(x, "public_key", js.undefined)
  }
}
