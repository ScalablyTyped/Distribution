package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Column headers.
  */
@js.native
trait SchemaColumnHeader extends js.Object {
  /**
    * The dimension names in the response.
    */
  var dimensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Metric headers for the metrics in the response.
    */
  var metricHeader: js.UndefOr[SchemaMetricHeader] = js.native
}

object SchemaColumnHeader {
  @scala.inline
  def apply(dimensions: js.Array[String] = null, metricHeader: SchemaMetricHeader = null): SchemaColumnHeader = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (metricHeader != null) __obj.updateDynamic("metricHeader")(metricHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaColumnHeader]
  }
}

