package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a PositionedObject from the document.
  */
@js.native
trait SchemaDeletePositionedObjectRequest extends js.Object {
  /**
    * The ID of the positioned object to delete.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaDeletePositionedObjectRequest {
  @scala.inline
  def apply(objectId: String = null): SchemaDeletePositionedObjectRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeletePositionedObjectRequest]
  }
}

