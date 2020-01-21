package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a set of metric values in the same metric. Each metric value in
  * the set should have a unique combination of start time, end time, and label
  * values.
  */
@js.native
trait SchemaMetricValueSet extends js.Object {
  /**
    * The metric name defined in the service configuration.
    */
  var metricName: js.UndefOr[String] = js.native
  /**
    * The values in this metric.
    */
  var metricValues: js.UndefOr[js.Array[SchemaMetricValue]] = js.native
}

object SchemaMetricValueSet {
  @scala.inline
  def apply(metricName: String = null, metricValues: js.Array[SchemaMetricValue] = null): SchemaMetricValueSet = {
    val __obj = js.Dynamic.literal()
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (metricValues != null) __obj.updateDynamic("metricValues")(metricValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetricValueSet]
  }
}

