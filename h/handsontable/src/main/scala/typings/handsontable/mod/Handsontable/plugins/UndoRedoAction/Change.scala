package typings.handsontable.mod.Handsontable.plugins.UndoRedoAction

import typings.handsontable.handsontableStrings.change
import typings.handsontable.mod.Handsontable.CellChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Change extends js.Object {
  var actionType: change = js.native
  var changes: js.Array[CellChange] = js.native
}

object Change {
  @scala.inline
  def apply(actionType: change, changes: js.Array[CellChange]): Change = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  @scala.inline
  implicit class ChangeOps[Self <: Change] (val x: Self) extends AnyVal {
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
    def setActionType(value: change): Self = this.set("actionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangesVarargs(value: CellChange*): Self = this.set("changes", js.Array(value :_*))
    @scala.inline
    def setChanges(value: js.Array[CellChange]): Self = this.set("changes", value.asInstanceOf[js.Any])
  }
  
}

