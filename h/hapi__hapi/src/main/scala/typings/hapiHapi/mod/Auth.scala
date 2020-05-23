package typings.hapiHapi.mod

import typings.hapiHapi.hapiHapiBooleans.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth extends js.Object {
  val data: js.UndefOr[AuthenticationData] = js.undefined
  val error: js.UndefOr[Error | Null] = js.undefined
  val isAuth: `true`
}

object Auth {
  @scala.inline
  def apply(isAuth: `true`, data: AuthenticationData = null, error: js.UndefOr[Null | Error] = js.undefined): Auth = {
    val __obj = js.Dynamic.literal(isAuth = isAuth.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth]
  }
}

