package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveRow
  extends handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction {
  var actionType: handsontableLib.handsontableLibStrings.remove_row
  var data: js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.CellValue]]
  var index: scala.Double
}

object RemoveRow {
  @scala.inline
  def apply(
    actionType: handsontableLib.handsontableLibStrings.remove_row,
    data: js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.CellValue]],
    index: scala.Double
  ): RemoveRow = {
    val __obj = js.Dynamic.literal(actionType = actionType, data = data, index = index)
  
    __obj.asInstanceOf[RemoveRow]
  }
}

