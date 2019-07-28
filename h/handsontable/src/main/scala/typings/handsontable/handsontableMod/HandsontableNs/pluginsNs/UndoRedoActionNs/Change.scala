package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.UndoRedoActionNs

import typings.handsontable.handsontableMod.HandsontableNs.CellChange
import typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction
import typings.handsontable.handsontableStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends UndoRedoAction {
  var actionType: change
  var changes: js.Array[CellChange]
}

object Change {
  @scala.inline
  def apply(actionType: change, changes: js.Array[CellChange]): Change = {
    val __obj = js.Dynamic.literal(actionType = actionType, changes = changes)
  
    __obj.asInstanceOf[Change]
  }
}

