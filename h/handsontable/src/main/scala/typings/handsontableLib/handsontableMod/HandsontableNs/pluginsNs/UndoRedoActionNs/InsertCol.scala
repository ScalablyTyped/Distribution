package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertCol
  extends handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction {
  var actionType: handsontableLib.handsontableLibStrings.insert_col
  var amount: scala.Double
  var index: scala.Double
}

object InsertCol {
  @scala.inline
  def apply(
    actionType: handsontableLib.handsontableLibStrings.insert_col,
    amount: scala.Double,
    index: scala.Double
  ): InsertCol = {
    val __obj = js.Dynamic.literal(actionType = actionType, amount = amount, index = index)
  
    __obj.asInstanceOf[InsertCol]
  }
}

