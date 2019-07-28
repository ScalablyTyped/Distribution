package typings.iotaDotLibDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Provider extends js.Object {
  var provider: String
  var sandbox: js.UndefOr[Boolean] = js.undefined
  var token: js.UndefOr[Boolean] = js.undefined
}

object Anon_Provider {
  @scala.inline
  def apply(
    provider: String,
    sandbox: js.UndefOr[Boolean] = js.undefined,
    token: js.UndefOr[Boolean] = js.undefined
  ): Anon_Provider = {
    val __obj = js.Dynamic.literal(provider = provider)
    if (!js.isUndefined(sandbox)) __obj.updateDynamic("sandbox")(sandbox)
    if (!js.isUndefined(token)) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Anon_Provider]
  }
}

