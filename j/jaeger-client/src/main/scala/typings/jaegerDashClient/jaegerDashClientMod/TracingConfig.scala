package typings.jaegerDashClient.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracingConfig extends js.Object {
  var disable: js.UndefOr[Boolean] = js.undefined
  var reporter: js.UndefOr[ReporterConfig] = js.undefined
  var sampler: js.UndefOr[SamplerConfig] = js.undefined
  var serviceName: js.UndefOr[String] = js.undefined
  var shareRpcSpan: js.UndefOr[Boolean] = js.undefined
  var traceId128bit: js.UndefOr[Boolean] = js.undefined
}

object TracingConfig {
  @scala.inline
  def apply(
    disable: js.UndefOr[Boolean] = js.undefined,
    reporter: ReporterConfig = null,
    sampler: SamplerConfig = null,
    serviceName: String = null,
    shareRpcSpan: js.UndefOr[Boolean] = js.undefined,
    traceId128bit: js.UndefOr[Boolean] = js.undefined
  ): TracingConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter)
    if (sampler != null) __obj.updateDynamic("sampler")(sampler)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    if (!js.isUndefined(shareRpcSpan)) __obj.updateDynamic("shareRpcSpan")(shareRpcSpan)
    if (!js.isUndefined(traceId128bit)) __obj.updateDynamic("traceId128bit")(traceId128bit)
    __obj.asInstanceOf[TracingConfig]
  }
}

