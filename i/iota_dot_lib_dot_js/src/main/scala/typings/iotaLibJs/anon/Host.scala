package typings.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var host: String
  var port: Double
  var sandbox: js.UndefOr[Boolean] = js.undefined
  var token: js.UndefOr[Boolean] = js.undefined
}

object Host {
  @scala.inline
  def apply(
    host: String,
    port: Double,
    sandbox: js.UndefOr[Boolean] = js.undefined,
    token: js.UndefOr[Boolean] = js.undefined
  ): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (!js.isUndefined(sandbox)) __obj.updateDynamic("sandbox")(sandbox.get.asInstanceOf[js.Any])
    if (!js.isUndefined(token)) __obj.updateDynamic("token")(token.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}

