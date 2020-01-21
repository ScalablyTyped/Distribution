package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A row in the report.
  */
@js.native
trait SchemaReportRow extends js.Object {
  /**
    * List of requested dimensions.
    */
  var dimensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of metrics for each requested DateRange.
    */
  var metrics: js.UndefOr[js.Array[SchemaDateRangeValues]] = js.native
}

object SchemaReportRow {
  @scala.inline
  def apply(dimensions: js.Array[String] = null, metrics: js.Array[SchemaDateRangeValues] = null): SchemaReportRow = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportRow]
  }
}

