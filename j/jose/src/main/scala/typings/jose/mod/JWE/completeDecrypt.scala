package typings.jose.mod.JWE

import typings.jose.mod.JWK.Key
import typings.jose.mod.JWK.OctKey
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait completeDecrypt extends js.Object {
  var aad: js.UndefOr[String] = js.undefined
  var cek: OctKey
  var cleartext: Buffer
  var header: js.UndefOr[js.Object] = js.undefined
  var key: Key
  var `protected`: js.UndefOr[js.Object] = js.undefined
  var unprotected: js.UndefOr[js.Object] = js.undefined
}

object completeDecrypt {
  @scala.inline
  def apply(
    cek: OctKey,
    cleartext: Buffer,
    key: Key,
    aad: String = null,
    header: js.Object = null,
    `protected`: js.Object = null,
    unprotected: js.Object = null
  ): completeDecrypt = {
    val __obj = js.Dynamic.literal(cek = cek.asInstanceOf[js.Any], cleartext = cleartext.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (aad != null) __obj.updateDynamic("aad")(aad.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (`protected` != null) __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    if (unprotected != null) __obj.updateDynamic("unprotected")(unprotected.asInstanceOf[js.Any])
    __obj.asInstanceOf[completeDecrypt]
  }
}

