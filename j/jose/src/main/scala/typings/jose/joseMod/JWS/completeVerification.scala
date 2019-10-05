package typings.jose.joseMod.JWS

import typings.jose.joseMod.JWK.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait completeVerification extends js.Object {
  var header: js.UndefOr[js.Object] = js.undefined
  var key: Key
  var payload: String | js.Object
  var `protected`: js.UndefOr[js.Object] = js.undefined
}

object completeVerification {
  @scala.inline
  def apply(key: Key, payload: String | js.Object, header: js.Object = null, `protected`: js.Object = null): completeVerification = {
    val __obj = js.Dynamic.literal(key = key, payload = payload.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (`protected` != null) __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[completeVerification]
  }
}

