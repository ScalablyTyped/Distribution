package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes an object, either pages or page elements, from the presentation.
  */
@js.native
trait SchemaDeleteObjectRequest extends js.Object {
  /**
    * The object ID of the page or page element to delete.  If after a delete
    * operation a group contains only 1 or no page elements, the group is also
    * deleted.  If a placeholder is deleted on a layout, any empty inheriting
    * shapes are also deleted.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaDeleteObjectRequest {
  @scala.inline
  def apply(objectId: String = null): SchemaDeleteObjectRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteObjectRequest]
  }
}

