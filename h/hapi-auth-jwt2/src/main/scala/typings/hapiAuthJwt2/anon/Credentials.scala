package typings.hapiAuthJwt2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var credentials: js.UndefOr[js.Any] = js.undefined
  var isValid: Boolean
}

object Credentials {
  @scala.inline
  def apply(isValid: Boolean, credentials: js.Any = null): Credentials = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

