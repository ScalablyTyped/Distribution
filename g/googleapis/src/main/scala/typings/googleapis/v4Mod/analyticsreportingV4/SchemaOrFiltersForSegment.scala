package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of segment filters in the `OR` group are combined with the logical
  * OR operator.
  */
@js.native
trait SchemaOrFiltersForSegment extends js.Object {
  /**
    * List of segment filters to be combined with a `OR` operator.
    */
  var segmentFilterClauses: js.UndefOr[js.Array[SchemaSegmentFilterClause]] = js.native
}

object SchemaOrFiltersForSegment {
  @scala.inline
  def apply(segmentFilterClauses: js.Array[SchemaSegmentFilterClause] = null): SchemaOrFiltersForSegment = {
    val __obj = js.Dynamic.literal()
    if (segmentFilterClauses != null) __obj.updateDynamic("segmentFilterClauses")(segmentFilterClauses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrFiltersForSegment]
  }
}

