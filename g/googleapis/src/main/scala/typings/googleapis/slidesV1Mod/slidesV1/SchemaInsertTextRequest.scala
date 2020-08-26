package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts text into a shape or a table cell.
  */
@js.native
trait SchemaInsertTextRequest extends js.Object {
  /**
    * The optional table cell location if the text is to be inserted into a
    * table cell. If present, the object_id must refer to a table.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.native
  /**
    * The index where the text will be inserted, in Unicode code units, based
    * on TextElement indexes.  The index is zero-based and is computed from the
    * start of the string. The index may be adjusted to prevent insertions
    * inside Unicode grapheme clusters. In these cases, the text will be
    * inserted immediately after the grapheme cluster.
    */
  var insertionIndex: js.UndefOr[Double] = js.native
  /**
    * The object ID of the shape or table where the text will be inserted.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The text to be inserted.  Inserting a newline character will implicitly
    * create a new ParagraphMarker at that index. The paragraph style of the
    * new paragraph will be copied from the paragraph at the current insertion
    * index, including lists and bullets.  Text styles for inserted text will
    * be determined automatically, generally preserving the styling of
    * neighboring text. In most cases, the text will be added to the TextRun
    * that exists at the insertion index.  Some control characters
    * (U+0000-U+0008, U+000C-U+001F) and characters from the Unicode Basic
    * Multilingual Plane Private Use Area (U+E000-U+F8FF) will be stripped out
    * of the inserted text.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaInsertTextRequest {
  @scala.inline
  def apply(): SchemaInsertTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertTextRequest]
  }
  @scala.inline
  implicit class SchemaInsertTextRequestOps[Self <: SchemaInsertTextRequest] (val x: Self) extends AnyVal {
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
    def setInsertionIndex(value: Double): Self = this.set("insertionIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertionIndex: Self = this.set("insertionIndex", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

