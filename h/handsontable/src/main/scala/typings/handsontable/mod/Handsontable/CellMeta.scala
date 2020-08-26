package typings.handsontable.mod.Handsontable

import typings.handsontable.mod.Handsontable.comments.CommentObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional cell-specific meta data.
  */
@js.native
trait CellMeta extends ColumnSettings {
  var comment: js.UndefOr[CommentObject] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var isSearchResult: js.UndefOr[Boolean] = js.native
  var skipRowOnPaste: js.UndefOr[Boolean] = js.native
  var valid: js.UndefOr[Boolean] = js.native
}

object CellMeta {
  @scala.inline
  def apply(): CellMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellMeta]
  }
  @scala.inline
  implicit class CellMetaOps[Self <: CellMeta] (val x: Self) extends AnyVal {
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
    def setComment(value: CommentObject): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIsSearchResult(value: Boolean): Self = this.set("isSearchResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSearchResult: Self = this.set("isSearchResult", js.undefined)
    @scala.inline
    def setSkipRowOnPaste(value: Boolean): Self = this.set("skipRowOnPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipRowOnPaste: Self = this.set("skipRowOnPaste", js.undefined)
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
  }
  
}

