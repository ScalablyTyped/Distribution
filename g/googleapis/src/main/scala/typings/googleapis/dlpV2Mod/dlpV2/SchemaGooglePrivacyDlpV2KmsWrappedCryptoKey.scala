package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey extends StObject {
  
  /**
    * Required. The resource name of the KMS CryptoKey to use for unwrapping.
    */
  var cryptoKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The wrapped data crypto key.
    */
  var wrappedKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey {
  
  inline def apply(): SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey](x: Self) {
    
    inline def setCryptoKeyName(value: String): Self = StObject.set(x, "cryptoKeyName", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyNameNull: Self = StObject.set(x, "cryptoKeyName", null)
    
    inline def setCryptoKeyNameUndefined: Self = StObject.set(x, "cryptoKeyName", js.undefined)
    
    inline def setWrappedKey(value: String): Self = StObject.set(x, "wrappedKey", value.asInstanceOf[js.Any])
    
    inline def setWrappedKeyNull: Self = StObject.set(x, "wrappedKey", null)
    
    inline def setWrappedKeyUndefined: Self = StObject.set(x, "wrappedKey", js.undefined)
  }
}
