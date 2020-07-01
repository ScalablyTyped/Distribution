package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes the embedded object with the given ID.
  */
@js.native
trait SchemaDeleteEmbeddedObjectRequest extends js.Object {
  /**
    * The ID of the embedded object to delete.
    */
  var objectId: js.UndefOr[Double] = js.native
}

object SchemaDeleteEmbeddedObjectRequest {
  @scala.inline
  def apply(objectId: js.UndefOr[Double] = js.undefined): SchemaDeleteEmbeddedObjectRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(objectId)) __obj.updateDynamic("objectId")(objectId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteEmbeddedObjectRequest]
  }
}

