package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update an embedded object&#39;s position (such as a moving or resizing a
  * chart or image).
  */
@js.native
trait SchemaUpdateEmbeddedObjectPositionRequest extends js.Object {
  /**
    * The fields of OverlayPosition that should be updated when setting a new
    * position. Used only if newPosition.overlayPosition is set, in which case
    * at least one field must be specified.  The root
    * `newPosition.overlayPosition` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * An explicit position to move the embedded object to. If
    * newPosition.sheetId is set, a new sheet with that ID will be created. If
    * newPosition.newSheet is set to true, a new sheet will be created with an
    * ID that will be chosen for you.
    */
  var newPosition: js.UndefOr[SchemaEmbeddedObjectPosition] = js.native
  /**
    * The ID of the object to moved.
    */
  var objectId: js.UndefOr[Double] = js.native
}

object SchemaUpdateEmbeddedObjectPositionRequest {
  @scala.inline
  def apply(
    fields: String = null,
    newPosition: SchemaEmbeddedObjectPosition = null,
    objectId: js.UndefOr[Double] = js.undefined
  ): SchemaUpdateEmbeddedObjectPositionRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (newPosition != null) __obj.updateDynamic("newPosition")(newPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(objectId)) __obj.updateDynamic("objectId")(objectId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateEmbeddedObjectPositionRequest]
  }
}

