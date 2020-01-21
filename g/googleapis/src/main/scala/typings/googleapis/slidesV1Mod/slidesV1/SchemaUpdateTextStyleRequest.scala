package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update the styling of text in a Shape or Table.
  */
@js.native
trait SchemaUpdateTextStyleRequest extends js.Object {
  /**
    * The location of the cell in the table containing the text to style. If
    * `object_id` refers to a table, `cell_location` must have a value.
    * Otherwise, it must not.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.native
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `style` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.  For
    * example, to update the text style to bold, set `fields` to
    * `&quot;bold&quot;`.  To reset a property to its default value, include
    * its field name in the field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The object ID of the shape or table with the text to be styled.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The style(s) to set on the text.  If the value for a particular style
    * matches that of the parent, that style will be set to inherit.  Certain
    * text style changes may cause other changes meant to mirror the behavior
    * of the Slides editor. See the documentation of TextStyle for more
    * information.
    */
  var style: js.UndefOr[SchemaTextStyle] = js.native
  /**
    * The range of text to style.  The range may be extended to include
    * adjacent newlines.  If the range fully contains a paragraph belonging to
    * a list, the paragraph&#39;s bullet is also updated with the matching text
    * style.
    */
  var textRange: js.UndefOr[SchemaRange] = js.native
}

object SchemaUpdateTextStyleRequest {
  @scala.inline
  def apply(
    cellLocation: SchemaTableCellLocation = null,
    fields: String = null,
    objectId: String = null,
    style: SchemaTextStyle = null,
    textRange: SchemaRange = null
  ): SchemaUpdateTextStyleRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textRange != null) __obj.updateDynamic("textRange")(textRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateTextStyleRequest]
  }
}

