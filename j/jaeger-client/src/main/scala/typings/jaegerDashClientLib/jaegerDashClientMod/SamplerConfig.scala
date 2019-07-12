package typings
package jaegerDashClientLib.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplerConfig extends js.Object {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var hostPort: js.UndefOr[java.lang.String] = js.undefined
  var param: scala.Double
  var port: js.UndefOr[scala.Double] = js.undefined
  var refreshIntervalMs: js.UndefOr[scala.Double] = js.undefined
  var `type`: java.lang.String
}

object SamplerConfig {
  @scala.inline
  def apply(
    param: scala.Double,
    `type`: java.lang.String,
    host: java.lang.String = null,
    hostPort: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    refreshIntervalMs: scala.Int | scala.Double = null
  ): SamplerConfig = {
    val __obj = js.Dynamic.literal(param = param)
    __obj.updateDynamic("type")(`type`)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostPort != null) __obj.updateDynamic("hostPort")(hostPort)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (refreshIntervalMs != null) __obj.updateDynamic("refreshIntervalMs")(refreshIntervalMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplerConfig]
  }
}

