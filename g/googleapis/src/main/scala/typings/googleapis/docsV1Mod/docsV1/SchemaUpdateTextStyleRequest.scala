package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update the styling of text.
  */
@js.native
trait SchemaUpdateTextStyleRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `text_style` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.  For
    * example, to update the text style to bold, set `fields` to
    * `&quot;bold&quot;`.  To reset a property to its default value, include
    * its field name in the field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The range of text to style.  The range may be extended to include
    * adjacent newlines.  If the range fully contains a paragraph belonging to
    * a list, the paragraph&#39;s bullet is also updated with the matching text
    * style.
    */
  var range: js.UndefOr[SchemaRange] = js.native
  /**
    * The styles to set on the text.  If the value for a particular style
    * matches that of the parent, that style will be set to inherit.  Certain
    * text style changes may cause other changes in order to to mirror the
    * behavior of the Docs editor. See the documentation of TextStyle for more
    * information.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
}

object SchemaUpdateTextStyleRequest {
  @scala.inline
  def apply(fields: String = null, range: SchemaRange = null, textStyle: SchemaTextStyle = null): SchemaUpdateTextStyleRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateTextStyleRequest]
  }
}

