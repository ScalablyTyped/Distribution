package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveCol
  extends handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction {
  var actionType: handsontableLib.handsontableLibStrings.remove_col
  var amount: scala.Double
  var columnPositions: js.Array[scala.Double]
  var data: js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.CellValue]]
  var headers: js.Array[java.lang.String]
  var index: scala.Double
  var indexes: js.Array[scala.Double]
}

object RemoveCol {
  @scala.inline
  def apply(
    actionType: handsontableLib.handsontableLibStrings.remove_col,
    amount: scala.Double,
    columnPositions: js.Array[scala.Double],
    data: js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.CellValue]],
    headers: js.Array[java.lang.String],
    index: scala.Double,
    indexes: js.Array[scala.Double]
  ): RemoveCol = {
    val __obj = js.Dynamic.literal(actionType = actionType, amount = amount, columnPositions = columnPositions, data = data, headers = headers, index = index, indexes = indexes)
  
    __obj.asInstanceOf[RemoveCol]
  }
}

