package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateEphemeralCertRequest extends StObject {
  
  /**
    * Optional. Access token to include in the signed certificate.
    */
  var access_token: js.UndefOr[String | Null] = js.undefined
  
  /**
    * PEM encoded public key to include in the signed certificate.
    */
  var public_key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Optional snapshot read timestamp to trade freshness for performance.
    */
  var readTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. If set, it will contain the cert valid duration.
    */
  var validDuration: js.UndefOr[String | Null] = js.undefined
}
object SchemaGenerateEphemeralCertRequest {
  
  inline def apply(): SchemaGenerateEphemeralCertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateEphemeralCertRequest]
  }
  
  extension [Self <: SchemaGenerateEphemeralCertRequest](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenNull: Self = StObject.set(x, "access_token", null)
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    inline def setPublic_keyNull: Self = StObject.set(x, "public_key", null)
    
    inline def setPublic_keyUndefined: Self = StObject.set(x, "public_key", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setValidDuration(value: String): Self = StObject.set(x, "validDuration", value.asInstanceOf[js.Any])
    
    inline def setValidDurationNull: Self = StObject.set(x, "validDuration", null)
    
    inline def setValidDurationUndefined: Self = StObject.set(x, "validDuration", js.undefined)
  }
}
