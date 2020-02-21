package typings.jose.mod.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait completeVerification[T, T2] extends js.Object {
  var header: js.UndefOr[js.Object] = js.undefined
  var key: T2
  var payload: T
  var `protected`: js.UndefOr[js.Object] = js.undefined
}

object completeVerification {
  @scala.inline
  def apply[T, T2](key: T2, payload: T, header: js.Object = null, `protected`: js.Object = null): completeVerification[T, T2] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (`protected` != null) __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[completeVerification[T, T2]]
  }
}

