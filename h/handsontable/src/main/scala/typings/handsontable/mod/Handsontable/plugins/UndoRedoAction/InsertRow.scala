package typings.handsontable.mod.Handsontable.plugins.UndoRedoAction

import typings.handsontable.handsontableStrings.insert_row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertRow extends js.Object {
  var actionType: insert_row = js.native
  var amount: Double = js.native
  var index: Double = js.native
}

object InsertRow {
  @scala.inline
  def apply(actionType: insert_row, amount: Double, index: Double): InsertRow = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertRow]
  }
  @scala.inline
  implicit class InsertRowOps[Self <: InsertRow] (val x: Self) extends AnyVal {
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
    def setActionType(value: insert_row): Self = this.set("actionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
  
}

