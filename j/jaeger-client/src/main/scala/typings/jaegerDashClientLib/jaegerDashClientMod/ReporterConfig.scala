package typings
package jaegerDashClientLib.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReporterConfig extends js.Object {
  var agentHost: js.UndefOr[java.lang.String] = js.undefined
  var agentPort: js.UndefOr[scala.Double] = js.undefined
  var collectorEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var flushIntervalMs: js.UndefOr[scala.Double] = js.undefined
  var logSpans: js.UndefOr[scala.Boolean] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object ReporterConfig {
  @scala.inline
  def apply(
    agentHost: java.lang.String = null,
    agentPort: scala.Int | scala.Double = null,
    collectorEndpoint: java.lang.String = null,
    flushIntervalMs: scala.Int | scala.Double = null,
    logSpans: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    username: java.lang.String = null
  ): ReporterConfig = {
    val __obj = js.Dynamic.literal()
    if (agentHost != null) __obj.updateDynamic("agentHost")(agentHost)
    if (agentPort != null) __obj.updateDynamic("agentPort")(agentPort.asInstanceOf[js.Any])
    if (collectorEndpoint != null) __obj.updateDynamic("collectorEndpoint")(collectorEndpoint)
    if (flushIntervalMs != null) __obj.updateDynamic("flushIntervalMs")(flushIntervalMs.asInstanceOf[js.Any])
    if (!js.isUndefined(logSpans)) __obj.updateDynamic("logSpans")(logSpans)
    if (password != null) __obj.updateDynamic("password")(password)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ReporterConfig]
  }
}

