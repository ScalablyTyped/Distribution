package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDateShiftConfig extends StObject {
  
  /**
    * An AES 128/192/256 bit key. Causes the shift to be computed based on this key and the patient ID. A default key is generated for each de-identification operation and is used when neither `crypto_key` nor `kms_wrapped` is specified. Must not be set if `kms_wrapped` is set.
    */
  var cryptoKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * KMS wrapped key. Must not be set if `crypto_key` is set.
    */
  var kmsWrapped: js.UndefOr[SchemaKmsWrappedCryptoKey] = js.undefined
}
object SchemaDateShiftConfig {
  
  inline def apply(): SchemaDateShiftConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateShiftConfig]
  }
  
  extension [Self <: SchemaDateShiftConfig](x: Self) {
    
    inline def setCryptoKey(value: String): Self = StObject.set(x, "cryptoKey", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyNull: Self = StObject.set(x, "cryptoKey", null)
    
    inline def setCryptoKeyUndefined: Self = StObject.set(x, "cryptoKey", js.undefined)
    
    inline def setKmsWrapped(value: SchemaKmsWrappedCryptoKey): Self = StObject.set(x, "kmsWrapped", value.asInstanceOf[js.Any])
    
    inline def setKmsWrappedUndefined: Self = StObject.set(x, "kmsWrapped", js.undefined)
  }
}
