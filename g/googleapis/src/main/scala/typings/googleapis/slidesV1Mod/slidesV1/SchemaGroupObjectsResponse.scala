package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of grouping objects.
  */
@js.native
trait SchemaGroupObjectsResponse extends js.Object {
  /**
    * The object ID of the created group.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaGroupObjectsResponse {
  @scala.inline
  def apply(objectId: String = null): SchemaGroupObjectsResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGroupObjectsResponse]
  }
}

