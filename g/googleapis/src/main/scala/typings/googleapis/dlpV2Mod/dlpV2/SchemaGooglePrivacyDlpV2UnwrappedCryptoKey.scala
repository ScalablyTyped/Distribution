package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Using raw keys is prone to security risks due to accidentally leaking the
  * key. Choose another type of key if possible.
  */
@js.native
trait SchemaGooglePrivacyDlpV2UnwrappedCryptoKey extends js.Object {
  /**
    * A 128/192/256 bit key. [required]
    */
  var key: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2UnwrappedCryptoKey {
  @scala.inline
  def apply(key: String = null): SchemaGooglePrivacyDlpV2UnwrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UnwrappedCryptoKey]
  }
}

