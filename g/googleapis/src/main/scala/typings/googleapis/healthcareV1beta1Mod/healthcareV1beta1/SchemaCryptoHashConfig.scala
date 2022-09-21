package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCryptoHashConfig extends StObject {
  
  /**
    * An AES 128/192/256 bit key. Causes the hash to be computed based on this key. A default key is generated for each Deidentify operation and is used when neither `crypto_key` nor `kms_wrapped` is specified. Must not be set if `kms_wrapped` is set.
    */
  var cryptoKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * KMS wrapped key. Must not be set if `crypto_key` is set.
    */
  var kmsWrapped: js.UndefOr[SchemaKmsWrappedCryptoKey] = js.undefined
}
object SchemaCryptoHashConfig {
  
  inline def apply(): SchemaCryptoHashConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCryptoHashConfig]
  }
  
  extension [Self <: SchemaCryptoHashConfig](x: Self) {
    
    inline def setCryptoKey(value: String): Self = StObject.set(x, "cryptoKey", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyNull: Self = StObject.set(x, "cryptoKey", null)
    
    inline def setCryptoKeyUndefined: Self = StObject.set(x, "cryptoKey", js.undefined)
    
    inline def setKmsWrapped(value: SchemaKmsWrappedCryptoKey): Self = StObject.set(x, "kmsWrapped", value.asInstanceOf[js.Any])
    
    inline def setKmsWrappedUndefined: Self = StObject.set(x, "kmsWrapped", js.undefined)
  }
}
