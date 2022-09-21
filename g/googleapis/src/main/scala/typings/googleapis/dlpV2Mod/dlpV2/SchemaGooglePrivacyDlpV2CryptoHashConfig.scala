package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2CryptoHashConfig extends StObject {
  
  /**
    * The key used by the hash function.
    */
  var cryptoKey: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoKey] = js.undefined
}
object SchemaGooglePrivacyDlpV2CryptoHashConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2CryptoHashConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CryptoHashConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2CryptoHashConfig](x: Self) {
    
    inline def setCryptoKey(value: SchemaGooglePrivacyDlpV2CryptoKey): Self = StObject.set(x, "cryptoKey", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyUndefined: Self = StObject.set(x, "cryptoKey", js.undefined)
  }
}
