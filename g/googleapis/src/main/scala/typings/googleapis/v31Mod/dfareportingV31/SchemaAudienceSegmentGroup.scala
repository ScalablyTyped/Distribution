package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Audience Segment Group.
  */
@js.native
trait SchemaAudienceSegmentGroup extends js.Object {
  /**
    * Audience segments assigned to this group. The number of segments must be
    * between 2 and 100.
    */
  var audienceSegments: js.UndefOr[js.Array[SchemaAudienceSegment]] = js.native
  /**
    * ID of this audience segment group. This is a read-only, auto-generated
    * field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of this audience segment group. This is a required field and must be
    * less than 65 characters long.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaAudienceSegmentGroup {
  @scala.inline
  def apply(audienceSegments: js.Array[SchemaAudienceSegment] = null, id: String = null, name: String = null): SchemaAudienceSegmentGroup = {
    val __obj = js.Dynamic.literal()
    if (audienceSegments != null) __obj.updateDynamic("audienceSegments")(audienceSegments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAudienceSegmentGroup]
  }
}

