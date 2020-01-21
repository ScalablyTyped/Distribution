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
  def apply(
    kmsWrapped: SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey = null,
    transient: SchemaGooglePrivacyDlpV2TransientCryptoKey = null,
    unwrapped: SchemaGooglePrivacyDlpV2UnwrappedCryptoKey = null
  ): SchemaGooglePrivacyDlpV2CryptoKey = {
    val __obj = js.Dynamic.literal()
    if (kmsWrapped != null) __obj.updateDynamic("kmsWrapped")(kmsWrapped.asInstanceOf[js.Any])
    if (transient != null) __obj.updateDynamic("transient")(transient.asInstanceOf[js.Any])
    if (unwrapped != null) __obj.updateDynamic("unwrapped")(unwrapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CryptoKey]
  }
}

