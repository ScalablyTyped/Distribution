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
  def apply(objectId: Int | Double = null): SchemaDeleteEmbeddedObjectRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteEmbeddedObjectRequest]
  }
}

