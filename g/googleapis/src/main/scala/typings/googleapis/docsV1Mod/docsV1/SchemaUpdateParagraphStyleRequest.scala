package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update the styling of all paragraphs that overlap with the given range.
  */
@js.native
trait SchemaUpdateParagraphStyleRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `paragraph_style` is implied and should not be specified.  For
    * example, to update the paragraph style&#39;s alignment property, set
    * `fields` to `&quot;alignment&quot;`.  To reset a property to its default
    * value, include its field name in the field mask but leave the field
    * itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The styles to set on the paragraphs.  Certain paragraph style changes may
    * cause other changes in order to mirror the behavior of the Docs editor.
    * See the documentation of ParagraphStyle for more information.
    */
  var paragraphStyle: js.UndefOr[SchemaParagraphStyle] = js.native
  /**
    * The range overlapping the paragraphs to style.
    */
  var range: js.UndefOr[SchemaRange] = js.native
}

object SchemaUpdateParagraphStyleRequest {
  @scala.inline
  def apply(fields: String = null, paragraphStyle: SchemaParagraphStyle = null, range: SchemaRange = null): SchemaUpdateParagraphStyleRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (paragraphStyle != null) __obj.updateDynamic("paragraphStyle")(paragraphStyle.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateParagraphStyleRequest]
  }
}

