package typings.iotaDotLibDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: String
  var port: Double
  var sandbox: js.UndefOr[Boolean] = js.undefined
  var token: js.UndefOr[Boolean] = js.undefined
}

object Anon_Host {
  @scala.inline
  def apply(
    host: String,
    port: Double,
    sandbox: js.UndefOr[Boolean] = js.undefined,
    token: js.UndefOr[Boolean] = js.undefined
  ): Anon_Host = {
    val __obj = js.Dynamic.literal(host = host, port = port)
    if (!js.isUndefined(sandbox)) __obj.updateDynamic("sandbox")(sandbox)
    if (!js.isUndefined(token)) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Anon_Host]
  }
}

