package typings.jaegerDashClient.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReporterConfig extends js.Object {
  var agentHost: js.UndefOr[String] = js.undefined
  var agentPort: js.UndefOr[Double] = js.undefined
  var collectorEndpoint: js.UndefOr[String] = js.undefined
  var flushIntervalMs: js.UndefOr[Double] = js.undefined
  var logSpans: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object ReporterConfig {
  @scala.inline
  def apply(
    agentHost: String = null,
    agentPort: Int | Double = null,
    collectorEndpoint: String = null,
    flushIntervalMs: Int | Double = null,
    logSpans: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    username: String = null
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

