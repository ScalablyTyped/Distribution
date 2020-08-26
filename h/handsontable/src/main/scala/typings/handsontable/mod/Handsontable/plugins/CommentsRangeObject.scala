package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod.Handsontable.wot.CellCoords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsRangeObject extends js.Object {
  var from: CellCoords = js.native
  var to: js.UndefOr[CellCoords] = js.native
}

object CommentsRangeObject {
  @scala.inline
  def apply(from: CellCoords): CommentsRangeObject = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentsRangeObject]
  }
  @scala.inline
  implicit class CommentsRangeObjectOps[Self <: CommentsRangeObject] (val x: Self) extends AnyVal {
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
    def setFrom(value: CellCoords): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: CellCoords): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

