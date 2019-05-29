package typings
package jaegerDashClientLib.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracingConfig extends js.Object {
  var disable: js.UndefOr[scala.Boolean] = js.undefined
  var reporter: js.UndefOr[ReporterConfig] = js.undefined
  var sampler: js.UndefOr[SamplerConfig] = js.undefined
  var serviceName: js.UndefOr[java.lang.String] = js.undefined
}

object TracingConfig {
  @scala.inline
  def apply(
    disable: js.UndefOr[scala.Boolean] = js.undefined,
    reporter: ReporterConfig = null,
    sampler: SamplerConfig = null,
    serviceName: java.lang.String = null
  ): TracingConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter)
    if (sampler != null) __obj.updateDynamic("sampler")(sampler)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    __obj.asInstanceOf[TracingConfig]
  }
}

