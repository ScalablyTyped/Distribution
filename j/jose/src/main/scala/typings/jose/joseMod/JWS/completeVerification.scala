package typings.jose.joseMod.JWS

import typings.jose.joseMod.JWK.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait completeVerification[T] extends js.Object {
  var header: js.UndefOr[js.Object] = js.undefined
  var key: Key
  var payload: T
  var `protected`: js.UndefOr[js.Object] = js.undefined
}

object completeVerification {
  @scala.inline
  def apply[T](key: Key, payload: T, header: js.Object = null, `protected`: js.Object = null): completeVerification[T] = {
    val __obj = js.Dynamic.literal(key = key, payload = payload.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (`protected` != null) __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[completeVerification[T]]
  }
}

