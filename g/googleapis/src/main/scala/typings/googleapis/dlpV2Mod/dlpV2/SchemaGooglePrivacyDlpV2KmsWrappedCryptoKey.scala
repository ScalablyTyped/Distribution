package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Include to use an existing data crypto key wrapped by KMS. The wrapped key
  * must be a 128/192/256 bit key. Authorization requires the following IAM
  * permissions when sending a request to perform a crypto transformation using
  * a kms-wrapped crypto key: dlp.kms.encrypt
  */
trait SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey extends StObject {
  
  /**
    * The resource name of the KMS CryptoKey to use for unwrapping. [required]
    */
  var cryptoKeyName: js.UndefOr[String] = js.undefined
  
  /**
    * The wrapped data crypto key. [required]
    */
  var wrappedKey: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KmsWrappedCryptoKeyMutableBuilder[Self <: SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCryptoKeyName(value: String): Self = StObject.set(x, "cryptoKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoKeyNameUndefined: Self = StObject.set(x, "cryptoKeyName", js.undefined)
    
    @scala.inline
    def setWrappedKey(value: String): Self = StObject.set(x, "wrappedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrappedKeyUndefined: Self = StObject.set(x, "wrappedKey", js.undefined)
  }
}
