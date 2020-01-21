package typings.jose.mod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pemEncodingOptions extends js.Object {
  var cipher: js.UndefOr[String] = js.undefined
  var passphrase: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object pemEncodingOptions {
  @scala.inline
  def apply(cipher: String = null, passphrase: String = null, `type`: String = null): pemEncodingOptions = {
    val __obj = js.Dynamic.literal()
    if (cipher != null) __obj.updateDynamic("cipher")(cipher.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[pemEncodingOptions]
  }
}

