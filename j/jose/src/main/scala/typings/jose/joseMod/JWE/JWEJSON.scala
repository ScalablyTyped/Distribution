package typings.jose.joseMod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWEJSON extends js.Object {
  var aad: js.UndefOr[String] = js.undefined
  var ciphertext: String
  var iv: String
  var `protected`: js.UndefOr[String] = js.undefined
  var tag: String
  var unprotected: js.UndefOr[js.Object] = js.undefined
}

object JWEJSON {
  @scala.inline
  def apply(
    ciphertext: String,
    iv: String,
    tag: String,
    aad: String = null,
    `protected`: String = null,
    unprotected: js.Object = null
  ): JWEJSON = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    if (aad != null) __obj.updateDynamic("aad")(aad.asInstanceOf[js.Any])
    if (`protected` != null) __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    if (unprotected != null) __obj.updateDynamic("unprotected")(unprotected.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWEJSON]
  }
}

