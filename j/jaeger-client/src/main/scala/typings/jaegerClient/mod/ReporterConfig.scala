package typings.jaegerClient.mod

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
    agentPort: js.UndefOr[Double] = js.undefined,
    collectorEndpoint: String = null,
    flushIntervalMs: js.UndefOr[Double] = js.undefined,
    logSpans: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    username: String = null
  ): ReporterConfig = {
    val __obj = js.Dynamic.literal()
    if (agentHost != null) __obj.updateDynamic("agentHost")(agentHost.asInstanceOf[js.Any])
    if (!js.isUndefined(agentPort)) __obj.updateDynamic("agentPort")(agentPort.get.asInstanceOf[js.Any])
    if (collectorEndpoint != null) __obj.updateDynamic("collectorEndpoint")(collectorEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(flushIntervalMs)) __obj.updateDynamic("flushIntervalMs")(flushIntervalMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logSpans)) __obj.updateDynamic("logSpans")(logSpans.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReporterConfig]
  }
}

