package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates bullets for all of the paragraphs that overlap with the given text
  * index range.  The nesting level of each paragraph will be determined by
  * counting leading tabs in front of each paragraph. To avoid excess space
  * between the bullet and the corresponding paragraph, these leading tabs are
  * removed by this request. This may change the indices of parts of the text.
  * If the paragraph immediately before paragraphs being updated is in a list
  * with a matching preset, the paragraphs being updated are added to that
  * preceding list.
  */
@js.native
trait SchemaCreateParagraphBulletsRequest extends js.Object {
  /**
    * The kinds of bullet glyphs to be used. Defaults to the
    * `BULLET_DISC_CIRCLE_SQUARE` preset.
    */
  var bulletPreset: js.UndefOr[String] = js.native
  /**
    * The optional table cell location if the text to be modified is in a table
    * cell. If present, the object_id must refer to a table.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.native
  /**
    * The object ID of the shape or table containing the text to add bullets
    * to.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The range of text to apply the bullet presets to, based on TextElement
    * indexes.
    */
  var textRange: js.UndefOr[SchemaRange] = js.native
}

object SchemaCreateParagraphBulletsRequest {
  @scala.inline
  def apply(
    bulletPreset: String = null,
    cellLocation: SchemaTableCellLocation = null,
    objectId: String = null,
    textRange: SchemaRange = null
  ): SchemaCreateParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    if (bulletPreset != null) __obj.updateDynamic("bulletPreset")(bulletPreset.asInstanceOf[js.Any])
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (textRange != null) __obj.updateDynamic("textRange")(textRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateParagraphBulletsRequest]
  }
}

