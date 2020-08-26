package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Include to use an existing data crypto key wrapped by KMS. The wrapped key
  * must be a 128/192/256 bit key. Authorization requires the following IAM
  * permissions when sending a request to perform a crypto transformation using
  * a kms-wrapped crypto key: dlp.kms.encrypt
  */
@js.native
trait SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey extends js.Object {
  /**
    * The resource name of the KMS CryptoKey to use for unwrapping. [required]
    */
  var cryptoKeyName: js.UndefOr[String] = js.native
  /**
    * The wrapped data crypto key. [required]
    */
  var wrappedKey: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KmsWrappedCryptoKeyOps[Self <: SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCryptoKeyName(value: String): Self = this.set("cryptoKeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCryptoKeyName: Self = this.set("cryptoKeyName", js.undefined)
    @scala.inline
    def setWrappedKey(value: String): Self = this.set("wrappedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrappedKey: Self = this.set("wrappedKey", js.undefined)
  }
  
}

