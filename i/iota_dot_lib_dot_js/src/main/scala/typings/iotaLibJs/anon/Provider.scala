package typings.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  var provider: String
  var sandbox: js.UndefOr[Boolean] = js.undefined
  var token: js.UndefOr[Boolean] = js.undefined
}

object Provider {
  @scala.inline
  def apply(
    provider: String,
    sandbox: js.UndefOr[Boolean] = js.undefined,
    token: js.UndefOr[Boolean] = js.undefined
  ): Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    if (!js.isUndefined(sandbox)) __obj.updateDynamic("sandbox")(sandbox.get.asInstanceOf[js.Any])
    if (!js.isUndefined(token)) __obj.updateDynamic("token")(token.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
}

