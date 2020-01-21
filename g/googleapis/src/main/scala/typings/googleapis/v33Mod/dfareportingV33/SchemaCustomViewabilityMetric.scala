package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom Viewability Metric
  */
@js.native
trait SchemaCustomViewabilityMetric extends js.Object {
  /**
    * Configuration of the custom viewability metric.
    */
  var configuration: js.UndefOr[SchemaCustomViewabilityMetricConfiguration] = js.native
  /**
    * ID of the custom viewability metric.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of the custom viewability metric.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaCustomViewabilityMetric {
  @scala.inline
  def apply(
    configuration: SchemaCustomViewabilityMetricConfiguration = null,
    id: String = null,
    name: String = null
  ): SchemaCustomViewabilityMetric = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomViewabilityMetric]
  }
}

