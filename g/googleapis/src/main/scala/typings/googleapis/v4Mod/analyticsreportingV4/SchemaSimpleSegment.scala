package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Simple segment conditions consist of one or more dimension/metric
  * conditions that can be combined.
  */
@js.native
trait SchemaSimpleSegment extends js.Object {
  /**
    * A list of segment filters groups which are combined with logical `AND`
    * operator.
    */
  var orFiltersForSegment: js.UndefOr[js.Array[SchemaOrFiltersForSegment]] = js.native
}

object SchemaSimpleSegment {
  @scala.inline
  def apply(orFiltersForSegment: js.Array[SchemaOrFiltersForSegment] = null): SchemaSimpleSegment = {
    val __obj = js.Dynamic.literal()
    if (orFiltersForSegment != null) __obj.updateDynamic("orFiltersForSegment")(orFiltersForSegment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSimpleSegment]
  }
}

