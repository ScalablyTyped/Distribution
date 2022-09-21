package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSigningKey extends StObject {
  
  /**
    * key_id is an identifier for the signing key.
    */
  var keyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field contains the corresponding signature scheme. Eg: "rsassa-pss-sha256".
    */
  var keyScheme: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field identifies the specific signing method. Eg: "rsa", "ed25519", and "ecdsa".
    */
  var keyType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field contains the actual public key.
    */
  var publicKeyValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaSigningKey {
  
  inline def apply(): SchemaSigningKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSigningKey]
  }
  
  extension [Self <: SchemaSigningKey](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdNull: Self = StObject.set(x, "keyId", null)
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setKeyScheme(value: String): Self = StObject.set(x, "keyScheme", value.asInstanceOf[js.Any])
    
    inline def setKeySchemeNull: Self = StObject.set(x, "keyScheme", null)
    
    inline def setKeySchemeUndefined: Self = StObject.set(x, "keyScheme", js.undefined)
    
    inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeNull: Self = StObject.set(x, "keyType", null)
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    inline def setPublicKeyValue(value: String): Self = StObject.set(x, "publicKeyValue", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyValueNull: Self = StObject.set(x, "publicKeyValue", null)
    
    inline def setPublicKeyValueUndefined: Self = StObject.set(x, "publicKeyValue", js.undefined)
  }
}
