package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes text from a shape or a table cell.
  */
@js.native
trait SchemaDeleteTextRequest extends js.Object {
  /**
    * The optional table cell location if the text is to be deleted from a
    * table cell. If present, the object_id must refer to a table.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.native
  /**
    * The object ID of the shape or table from which the text will be deleted.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The range of text to delete, based on TextElement indexes.  There is
    * always an implicit newline character at the end of a shape&#39;s or table
    * cell&#39;s text that cannot be deleted. `Range.Type.ALL` will use the
    * correct bounds, but care must be taken when specifying explicit bounds
    * for range types `FROM_START_INDEX` and `FIXED_RANGE`. For example, if the
    * text is &quot;ABC&quot;, followed by an implicit newline, then the
    * maximum value is 2 for `text_range.start_index` and 3 for
    * `text_range.end_index`.  Deleting text that crosses a paragraph boundary
    * may result in changes to paragraph styles and lists as the two paragraphs
    * are merged.  Ranges that include only one code unit of a surrogate pair
    * are expanded to include both code units.
    */
  var textRange: js.UndefOr[SchemaRange] = js.native
}

object SchemaDeleteTextRequest {
  @scala.inline
  def apply(): SchemaDeleteTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteTextRequest]
  }
  @scala.inline
  implicit class SchemaDeleteTextRequestOps[Self <: SchemaDeleteTextRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCellLocation(value: SchemaTableCellLocation): Self = this.set("cellLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellLocation: Self = this.set("cellLocation", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setTextRange(value: SchemaRange): Self = this.set("textRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextRange: Self = this.set("textRange", js.undefined)
  }
  
}

