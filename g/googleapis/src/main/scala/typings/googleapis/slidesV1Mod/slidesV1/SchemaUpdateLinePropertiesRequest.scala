package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the properties of a Line.
  */
@js.native
trait SchemaUpdateLinePropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `lineProperties` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    * For example to update the line solid fill color, set `fields` to
    * `&quot;lineFill.solidFill.color&quot;`.  To reset a property to its
    * default value, include its field name in the field mask but leave the
    * field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The line properties to update.
    */
  var lineProperties: js.UndefOr[SchemaLineProperties] = js.native
  /**
    * The object ID of the line the update is applied to.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaUpdateLinePropertiesRequest {
  @scala.inline
  def apply(fields: String = null, lineProperties: SchemaLineProperties = null, objectId: String = null): SchemaUpdateLinePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (lineProperties != null) __obj.updateDynamic("lineProperties")(lineProperties.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateLinePropertiesRequest]
  }
}

