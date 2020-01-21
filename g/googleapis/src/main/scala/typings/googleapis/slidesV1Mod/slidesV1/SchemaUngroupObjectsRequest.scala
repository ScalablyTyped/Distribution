package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ungroups objects, such as groups.
  */
@js.native
trait SchemaUngroupObjectsRequest extends js.Object {
  /**
    * The object IDs of the objects to ungroup.  Only groups that are not
    * inside other groups can be ungrouped. All the groups should be on the
    * same page. The group itself is deleted. The visual sizes and positions of
    * all the children are preserved.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaUngroupObjectsRequest {
  @scala.inline
  def apply(objectIds: js.Array[String] = null): SchemaUngroupObjectsRequest = {
    val __obj = js.Dynamic.literal()
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUngroupObjectsRequest]
  }
}

