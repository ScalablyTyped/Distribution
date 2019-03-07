package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change
  extends handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction {
  var actionType: handsontableLib.handsontableLibStrings.change
  var changes: js.Array[handsontableLib.handsontableMod.HandsontableNs.CellChange]
}

object Change {
  @scala.inline
  def apply(
    actionType: handsontableLib.handsontableLibStrings.change,
    changes: js.Array[handsontableLib.handsontableMod.HandsontableNs.CellChange]
  ): Change = {
    val __obj = js.Dynamic.literal(actionType = actionType, changes = changes)
  
    __obj.asInstanceOf[Change]
  }
}

