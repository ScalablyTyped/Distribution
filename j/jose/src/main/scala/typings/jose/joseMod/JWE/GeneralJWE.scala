package typings.jose.joseMod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralJWE extends JWEJSON {
  var recipients: js.Array[JWERecipient]
}

object GeneralJWE {
  @scala.inline
  def apply(
    ciphertext: String,
    iv: String,
    recipients: js.Array[JWERecipient],
    tag: String,
    aad: String = null,
    `protected`: String = null,
    unprotected: js.Object = null
  ): GeneralJWE = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext, iv = iv, recipients = recipients, tag = tag)
    if (aad != null) __obj.updateDynamic("aad")(aad)
    if (`protected` != null) __obj.updateDynamic("protected")(`protected`)
    if (unprotected != null) __obj.updateDynamic("unprotected")(unprotected)
    __obj.asInstanceOf[GeneralJWE]
  }
}

