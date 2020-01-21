package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Filter Clause to be used in a segment definition, can be wither a metric or
  * a dimension filter.
  */
@js.native
trait SchemaSegmentFilterClause extends js.Object {
  /**
    * Dimension Filter for the segment definition.
    */
  var dimensionFilter: js.UndefOr[SchemaSegmentDimensionFilter] = js.native
  /**
    * Metric Filter for the segment definition.
    */
  var metricFilter: js.UndefOr[SchemaSegmentMetricFilter] = js.native
  /**
    * Matches the complement (`!`) of the filter.
    */
  var not: js.UndefOr[Boolean] = js.native
}

object SchemaSegmentFilterClause {
  @scala.inline
  def apply(
    dimensionFilter: SchemaSegmentDimensionFilter = null,
    metricFilter: SchemaSegmentMetricFilter = null,
    not: js.UndefOr[Boolean] = js.undefined
  ): SchemaSegmentFilterClause = {
    val __obj = js.Dynamic.literal()
    if (dimensionFilter != null) __obj.updateDynamic("dimensionFilter")(dimensionFilter.asInstanceOf[js.Any])
    if (metricFilter != null) __obj.updateDynamic("metricFilter")(metricFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(not)) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSegmentFilterClause]
  }
}

