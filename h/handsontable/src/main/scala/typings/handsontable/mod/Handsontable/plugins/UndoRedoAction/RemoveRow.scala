package typings.handsontable.mod.Handsontable.plugins.UndoRedoAction

import typings.handsontable.handsontableStrings.remove_row
import typings.handsontable.mod.Handsontable.plugins.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveRow extends js.Object {
  var actionType: remove_row = js.native
  var data: js.Array[js.Array[CellValue]] = js.native
  var index: Double = js.native
}

object RemoveRow {
  @scala.inline
  def apply(actionType: remove_row, data: js.Array[js.Array[CellValue]], index: Double): RemoveRow = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRow]
  }
  @scala.inline
  implicit class RemoveRowOps[Self <: RemoveRow] (val x: Self) extends AnyVal {
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
    def setActionType(value: remove_row): Self = this.set("actionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: js.Array[CellValue]*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Array[CellValue]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
  
}

