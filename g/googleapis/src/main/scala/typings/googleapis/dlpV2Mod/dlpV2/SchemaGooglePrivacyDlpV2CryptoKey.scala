package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a data encryption key (DEK) (as opposed to a key encryption key
  * (KEK) stored by KMS). When using KMS to wrap/unwrap DEKs, be sure to set an
  * appropriate IAM policy on the KMS CryptoKey (KEK) to ensure an attacker
  * cannot unwrap the data crypto key.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CryptoKey extends js.Object {
  var kmsWrapped: js.UndefOr[SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey] = js.native
  var transient: js.UndefOr[SchemaGooglePrivacyDlpV2TransientCryptoKey] = js.native
  var unwrapped: js.UndefOr[SchemaGooglePrivacyDlpV2UnwrappedCryptoKey] = js.native
}

object SchemaGooglePrivacyDlpV2CryptoKey {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CryptoKey]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CryptoKeyOps[Self <: SchemaGooglePrivacyDlpV2CryptoKey] (val x: Self) extends AnyVal {
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
    def setKmsWrapped(value: SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey): Self = this.set("kmsWrapped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsWrapped: Self = this.set("kmsWrapped", js.undefined)
    @scala.inline
    def setTransient(value: SchemaGooglePrivacyDlpV2TransientCryptoKey): Self = this.set("transient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransient: Self = this.set("transient", js.undefined)
    @scala.inline
    def setUnwrapped(value: SchemaGooglePrivacyDlpV2UnwrappedCryptoKey): Self = this.set("unwrapped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnwrapped: Self = this.set("unwrapped", js.undefined)
  }
  
}

