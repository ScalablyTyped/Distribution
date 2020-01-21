package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to return a list of metrics for a single DateRange / dimension
  * combination
  */
@js.native
trait SchemaDateRangeValues extends js.Object {
  /**
    * The values of each pivot region.
    */
  var pivotValueRegions: js.UndefOr[js.Array[SchemaPivotValueRegion]] = js.native
  /**
    * Each value corresponds to each Metric in the request.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaDateRangeValues {
  @scala.inline
  def apply(pivotValueRegions: js.Array[SchemaPivotValueRegion] = null, values: js.Array[String] = null): SchemaDateRangeValues = {
    val __obj = js.Dynamic.literal()
    if (pivotValueRegions != null) __obj.updateDynamic("pivotValueRegions")(pivotValueRegions.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDateRangeValues]
  }
}

