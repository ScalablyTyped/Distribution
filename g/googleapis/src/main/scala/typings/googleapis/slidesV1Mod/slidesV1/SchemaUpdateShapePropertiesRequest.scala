package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update the properties of a Shape.
  */
@js.native
trait SchemaUpdateShapePropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `shapeProperties` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    * For example to update the shape background solid fill color, set `fields`
    * to `&quot;shapeBackgroundFill.solidFill.color&quot;`.  To reset a
    * property to its default value, include its field name in the field mask
    * but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The object ID of the shape the updates are applied to.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The shape properties to update.
    */
  var shapeProperties: js.UndefOr[SchemaShapeProperties] = js.native
}

object SchemaUpdateShapePropertiesRequest {
  @scala.inline
  def apply(fields: String = null, objectId: String = null, shapeProperties: SchemaShapeProperties = null): SchemaUpdateShapePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (shapeProperties != null) __obj.updateDynamic("shapeProperties")(shapeProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateShapePropertiesRequest]
  }
}

