package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the properties of the table borders in a Table.
  */
@js.native
trait SchemaUpdateTableBorderPropertiesRequest extends js.Object {
  /**
    * The border position in the table range the updates should apply to. If a
    * border position is not specified, the updates will apply to all borders
    * in the table range.
    */
  var borderPosition: js.UndefOr[String] = js.native
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `tableBorderProperties` is implied and should not be specified.
    * A single `&quot;*&quot;` can be used as short-hand for listing every
    * field.  For example to update the table border solid fill color, set
    * `fields` to `&quot;tableBorderFill.solidFill.color&quot;`.  To reset a
    * property to its default value, include its field name in the field mask
    * but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The table border properties to update.
    */
  var tableBorderProperties: js.UndefOr[SchemaTableBorderProperties] = js.native
  /**
    * The table range representing the subset of the table to which the updates
    * are applied. If a table range is not specified, the updates will apply to
    * the entire table.
    */
  var tableRange: js.UndefOr[SchemaTableRange] = js.native
}

object SchemaUpdateTableBorderPropertiesRequest {
  @scala.inline
  def apply(
    borderPosition: String = null,
    fields: String = null,
    objectId: String = null,
    tableBorderProperties: SchemaTableBorderProperties = null,
    tableRange: SchemaTableRange = null
  ): SchemaUpdateTableBorderPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (borderPosition != null) __obj.updateDynamic("borderPosition")(borderPosition.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (tableBorderProperties != null) __obj.updateDynamic("tableBorderProperties")(tableBorderProperties.asInstanceOf[js.Any])
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateTableBorderPropertiesRequest]
  }
}

