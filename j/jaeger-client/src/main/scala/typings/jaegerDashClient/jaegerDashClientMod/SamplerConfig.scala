package typings.jaegerDashClient.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplerConfig extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var hostPort: js.UndefOr[String] = js.undefined
  var param: Double
  var port: js.UndefOr[Double] = js.undefined
  var refreshIntervalMs: js.UndefOr[Double] = js.undefined
  var `type`: String
}

object SamplerConfig {
  @scala.inline
  def apply(
    param: Double,
    `type`: String,
    host: String = null,
    hostPort: String = null,
    port: Int | Double = null,
    refreshIntervalMs: Int | Double = null
  ): SamplerConfig = {
    val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostPort != null) __obj.updateDynamic("hostPort")(hostPort.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (refreshIntervalMs != null) __obj.updateDynamic("refreshIntervalMs")(refreshIntervalMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplerConfig]
  }
}

