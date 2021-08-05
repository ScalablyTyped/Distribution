package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a data encryption key (DEK) (as opposed to a key encryption key
  * (KEK) stored by KMS). When using KMS to wrap/unwrap DEKs, be sure to set an
  * appropriate IAM policy on the KMS CryptoKey (KEK) to ensure an attacker
  * cannot unwrap the data crypto key.
  */
trait SchemaGooglePrivacyDlpV2CryptoKey extends StObject {
  
  var kmsWrapped: js.UndefOr[SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey] = js.undefined
  
  var transient: js.UndefOr[SchemaGooglePrivacyDlpV2TransientCryptoKey] = js.undefined
  
  var unwrapped: js.UndefOr[SchemaGooglePrivacyDlpV2UnwrappedCryptoKey] = js.undefined
}
object SchemaGooglePrivacyDlpV2CryptoKey {
  
  inline def apply(): SchemaGooglePrivacyDlpV2CryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CryptoKey]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2CryptoKey](x: Self) {
    
    inline def setKmsWrapped(value: SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey): Self = StObject.set(x, "kmsWrapped", value.asInstanceOf[js.Any])
    
    inline def setKmsWrappedUndefined: Self = StObject.set(x, "kmsWrapped", js.undefined)
    
    inline def setTransient(value: SchemaGooglePrivacyDlpV2TransientCryptoKey): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
    
    inline def setTransientUndefined: Self = StObject.set(x, "transient", js.undefined)
    
    inline def setUnwrapped(value: SchemaGooglePrivacyDlpV2UnwrappedCryptoKey): Self = StObject.set(x, "unwrapped", value.asInstanceOf[js.Any])
    
    inline def setUnwrappedUndefined: Self = StObject.set(x, "unwrapped", js.undefined)
  }
}
