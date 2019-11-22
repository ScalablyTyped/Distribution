package typings.jaegerDashClient.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextMapCodecOptions extends js.Object {
  var baggagePrefix: js.UndefOr[String] = js.undefined
  var contextKey: js.UndefOr[String] = js.undefined
  var metrics: js.UndefOr[MetricsFactory] = js.undefined
  var urlEncoding: js.UndefOr[Boolean] = js.undefined
}

object TextMapCodecOptions {
  @scala.inline
  def apply(
    baggagePrefix: String = null,
    contextKey: String = null,
    metrics: MetricsFactory = null,
    urlEncoding: js.UndefOr[Boolean] = js.undefined
  ): TextMapCodecOptions = {
    val __obj = js.Dynamic.literal()
    if (baggagePrefix != null) __obj.updateDynamic("baggagePrefix")(baggagePrefix)
    if (contextKey != null) __obj.updateDynamic("contextKey")(contextKey)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (!js.isUndefined(urlEncoding)) __obj.updateDynamic("urlEncoding")(urlEncoding)
    __obj.asInstanceOf[TextMapCodecOptions]
  }
}

