package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKmsWrappedCryptoKey extends StObject {
  
  /**
    * Required. The resource name of the KMS CryptoKey to use for unwrapping. For example, `projects/{project_id\}/locations/{location_id\}/keyRings/{keyring\}/cryptoKeys/{key\}`.
    */
  var cryptoKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The wrapped data crypto key.
    */
  var wrappedKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaKmsWrappedCryptoKey {
  
  inline def apply(): SchemaKmsWrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKmsWrappedCryptoKey]
  }
  
  extension [Self <: SchemaKmsWrappedCryptoKey](x: Self) {
    
    inline def setCryptoKey(value: String): Self = StObject.set(x, "cryptoKey", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyNull: Self = StObject.set(x, "cryptoKey", null)
    
    inline def setCryptoKeyUndefined: Self = StObject.set(x, "cryptoKey", js.undefined)
    
    inline def setWrappedKey(value: String): Self = StObject.set(x, "wrappedKey", value.asInstanceOf[js.Any])
    
    inline def setWrappedKeyNull: Self = StObject.set(x, "wrappedKey", null)
    
    inline def setWrappedKeyUndefined: Self = StObject.set(x, "wrappedKey", js.undefined)
  }
}
