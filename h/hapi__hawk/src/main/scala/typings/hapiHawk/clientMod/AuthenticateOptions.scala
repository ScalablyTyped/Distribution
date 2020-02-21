package typings.hapiHawk.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateOptions extends js.Object {
  /** optional payload received */
  var payload: js.UndefOr[String] = js.undefined
  /** specifies if a Server-Authorization header is required. Defaults to 'false' */
  var required: js.UndefOr[Boolean] = js.undefined
}

object AuthenticateOptions {
  @scala.inline
  def apply(payload: String = null, required: js.UndefOr[Boolean] = js.undefined): AuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateOptions]
  }
}

