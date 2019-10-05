package typings.jose.joseMod.JWK

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
    if (cipher != null) __obj.updateDynamic("cipher")(cipher)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[pemEncodingOptions]
  }
}

