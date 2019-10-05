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
    val __obj = js.Dynamic.literal(ciphertext = ciphertext, iv = iv, tag = tag)
    if (aad != null) __obj.updateDynamic("aad")(aad)
    if (`protected` != null) __obj.updateDynamic("protected")(`protected`)
    if (unprotected != null) __obj.updateDynamic("unprotected")(unprotected)
    __obj.asInstanceOf[JWEJSON]
  }
}

