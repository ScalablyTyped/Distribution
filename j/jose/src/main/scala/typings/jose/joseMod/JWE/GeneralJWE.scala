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
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    if (aad != null) __obj.updateDynamic("aad")(aad.asInstanceOf[js.Any])
    if (`protected` != null) __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    if (unprotected != null) __obj.updateDynamic("unprotected")(unprotected.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralJWE]
  }
}

