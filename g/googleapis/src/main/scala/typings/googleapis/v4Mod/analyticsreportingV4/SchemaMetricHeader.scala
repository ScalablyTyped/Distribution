package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The headers for the metrics.
  */
@js.native
trait SchemaMetricHeader extends js.Object {
  /**
    * Headers for the metrics in the response.
    */
  var metricHeaderEntries: js.UndefOr[js.Array[SchemaMetricHeaderEntry]] = js.native
  /**
    * Headers for the pivots in the response.
    */
  var pivotHeaders: js.UndefOr[js.Array[SchemaPivotHeader]] = js.native
}

object SchemaMetricHeader {
  @scala.inline
  def apply(
    metricHeaderEntries: js.Array[SchemaMetricHeaderEntry] = null,
    pivotHeaders: js.Array[SchemaPivotHeader] = null
  ): SchemaMetricHeader = {
    val __obj = js.Dynamic.literal()
    if (metricHeaderEntries != null) __obj.updateDynamic("metricHeaderEntries")(metricHeaderEntries.asInstanceOf[js.Any])
    if (pivotHeaders != null) __obj.updateDynamic("pivotHeaders")(pivotHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetricHeader]
  }
}

