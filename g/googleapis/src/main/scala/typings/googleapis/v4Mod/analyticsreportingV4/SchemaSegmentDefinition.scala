package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SegmentDefinition defines the segment to be a set of SegmentFilters which
  * are combined together with a logical `AND` operation.
  */
@js.native
trait SchemaSegmentDefinition extends js.Object {
  /**
    * A segment is defined by a set of segment filters which are combined
    * together with a logical `AND` operation.
    */
  var segmentFilters: js.UndefOr[js.Array[SchemaSegmentFilter]] = js.native
}

object SchemaSegmentDefinition {
  @scala.inline
  def apply(segmentFilters: js.Array[SchemaSegmentFilter] = null): SchemaSegmentDefinition = {
    val __obj = js.Dynamic.literal()
    if (segmentFilters != null) __obj.updateDynamic("segmentFilters")(segmentFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSegmentDefinition]
  }
}

