package typings.jose.mod.JWE

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
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], encrypted_key = encrypted_key.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    if (aad != null) __obj.updateDynamic("aad")(aad.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (`protected` != null) __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    if (unprotected != null) __obj.updateDynamic("unprotected")(unprotected.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenedJWE]
  }
}

