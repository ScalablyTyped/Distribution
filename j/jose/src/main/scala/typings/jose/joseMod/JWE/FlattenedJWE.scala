package typings.jose.joseMod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenedJWE
  extends JWERecipient
     with JWEJSON

object FlattenedJWE {
  @scala.inline
  def apply(
    ciphertext: String,
    encrypted_key: String,
    iv: String,
    tag: String,
    aad: String = null,
    header: js.Object = null,
    `protected`: String = null,
    unprotected: js.Object = null
  ): FlattenedJWE = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext, encrypted_key = encrypted_key, iv = iv, tag = tag)
    if (aad != null) __obj.updateDynamic("aad")(aad)
    if (header != null) __obj.updateDynamic("header")(header)
    if (`protected` != null) __obj.updateDynamic("protected")(`protected`)
    if (unprotected != null) __obj.updateDynamic("unprotected")(unprotected)
    __obj.asInstanceOf[FlattenedJWE]
  }
}

