package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertRow
  extends handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction {
  var actionType: handsontableLib.handsontableLibStrings.insert_row
  var amount: scala.Double
  var index: scala.Double
}

object InsertRow {
  @scala.inline
  def apply(
    actionType: handsontableLib.handsontableLibStrings.insert_row,
    amount: scala.Double,
    index: scala.Double
  ): InsertRow = {
    val __obj = js.Dynamic.literal(actionType = actionType, amount = amount, index = index)
  
    __obj.asInstanceOf[InsertRow]
  }
}

