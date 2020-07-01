package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Audience Segment.
  */
@js.native
trait SchemaAudienceSegment extends js.Object {
  /**
    * Weight allocated to this segment. The weight assigned will be understood
    * in proportion to the weights assigned to other segments in the same
    * segment group. Acceptable values are 1 to 1000, inclusive.
    */
  var allocation: js.UndefOr[Double] = js.native
  /**
    * ID of this audience segment. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of this audience segment. This is a required field and must be less
    * than 65 characters long.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaAudienceSegment {
  @scala.inline
  def apply(allocation: js.UndefOr[Double] = js.undefined, id: String = null, name: String = null): SchemaAudienceSegment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allocation)) __obj.updateDynamic("allocation")(allocation.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAudienceSegment]
  }
}

