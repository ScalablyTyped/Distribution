package typings.jose.mod.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWSRecipient extends js.Object {
  var header: js.UndefOr[js.Object] = js.undefined
  var `protected`: js.UndefOr[String] = js.undefined
  var signature: String
}

object JWSRecipient {
  @scala.inline
  def apply(signature: String, header: js.Object = null, `protected`: String = null): JWSRecipient = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (`protected` != null) __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWSRecipient]
  }
}

