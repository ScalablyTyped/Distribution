package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The segment definition, if the report needs to be segmented. A Segment is a
  * subset of the Analytics data. For example, of the entire set of users, one
  * Segment might be users from a particular country or city.
  */
@js.native
trait SchemaSegment extends js.Object {
  /**
    * A dynamic segment definition in the request.
    */
  var dynamicSegment: js.UndefOr[SchemaDynamicSegment] = js.native
  /**
    * The segment ID of a built-in or custom segment, for example `gaid::-3`.
    */
  var segmentId: js.UndefOr[String] = js.native
}

object SchemaSegment {
  @scala.inline
  def apply(dynamicSegment: SchemaDynamicSegment = null, segmentId: String = null): SchemaSegment = {
    val __obj = js.Dynamic.literal()
    if (dynamicSegment != null) __obj.updateDynamic("dynamicSegment")(dynamicSegment.asInstanceOf[js.Any])
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSegment]
  }
}

