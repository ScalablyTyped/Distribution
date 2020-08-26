package typings.handsontable.mod.Handsontable.comments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentConfig extends js.Object {
  var col: Double = js.native
  var comment: CommentObject = js.native
  var row: Double = js.native
}

object CommentConfig {
  @scala.inline
  def apply(col: Double, comment: CommentObject, row: Double): CommentConfig = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentConfig]
  }
  @scala.inline
  implicit class CommentConfigOps[Self <: CommentConfig] (val x: Self) extends AnyVal {
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
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: CommentObject): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
  }
  
}

