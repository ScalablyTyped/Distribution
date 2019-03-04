package typings
package iotaDotLibDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: java.lang.String
  var port: scala.Double
  var sandbox: js.UndefOr[scala.Boolean] = js.undefined
  var token: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Host {
  @scala.inline
  def apply(
    host: java.lang.String,
    port: scala.Double,
    sandbox: js.UndefOr[scala.Boolean] = js.undefined,
    token: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Host = {
    val __obj = js.Dynamic.literal(host = host, port = port)
    if (!js.isUndefined(sandbox)) __obj.updateDynamic("sandbox")(sandbox)
    if (!js.isUndefined(token)) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Anon_Host]
  }
}

