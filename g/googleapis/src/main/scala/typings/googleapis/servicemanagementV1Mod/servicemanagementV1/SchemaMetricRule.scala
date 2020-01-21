package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bind API methods to metrics. Binding a method to a metric causes that
  * metric&#39;s configured quota behaviors to apply to the method call.
  */
@js.native
trait SchemaMetricRule extends js.Object {
  /**
    * Metrics to update when the selected methods are called, and the
    * associated cost applied to each metric.  The key of the map is the metric
    * name, and the values are the amount increased for the metric against
    * which the quota limits are defined. The value must not be negative.
    */
  var metricCosts: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Selects the methods to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object SchemaMetricRule {
  @scala.inline
  def apply(metricCosts: StringDictionary[String] = null, selector: String = null): SchemaMetricRule = {
    val __obj = js.Dynamic.literal()
    if (metricCosts != null) __obj.updateDynamic("metricCosts")(metricCosts.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetricRule]
  }
}

