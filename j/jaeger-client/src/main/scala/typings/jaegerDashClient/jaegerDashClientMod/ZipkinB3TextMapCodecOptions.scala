package typings.jaegerDashClient.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipkinB3TextMapCodecOptions extends js.Object {
  var baggagePrefix: js.UndefOr[String] = js.undefined
  var metrics: js.UndefOr[MetricsFactory] = js.undefined
  var urlEncoding: js.UndefOr[Boolean] = js.undefined
}

object ZipkinB3TextMapCodecOptions {
  @scala.inline
  def apply(
    baggagePrefix: String = null,
    metrics: MetricsFactory = null,
    urlEncoding: js.UndefOr[Boolean] = js.undefined
  ): ZipkinB3TextMapCodecOptions = {
    val __obj = js.Dynamic.literal()
    if (baggagePrefix != null) __obj.updateDynamic("baggagePrefix")(baggagePrefix.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (!js.isUndefined(urlEncoding)) __obj.updateDynamic("urlEncoding")(urlEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipkinB3TextMapCodecOptions]
  }
}

