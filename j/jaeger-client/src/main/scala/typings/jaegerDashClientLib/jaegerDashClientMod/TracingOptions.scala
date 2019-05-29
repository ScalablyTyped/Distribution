package typings
package jaegerDashClientLib.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracingOptions extends js.Object {
  var logger: js.UndefOr[Logger] = js.undefined
  var metrics: js.UndefOr[PrometheusMetricsFactory] = js.undefined
  var reporter: js.UndefOr[Reporter] = js.undefined
  var tags: js.UndefOr[js.Any] = js.undefined
}

object TracingOptions {
  @scala.inline
  def apply(
    logger: Logger = null,
    metrics: PrometheusMetricsFactory = null,
    reporter: Reporter = null,
    tags: js.Any = null
  ): TracingOptions = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[TracingOptions]
  }
}

