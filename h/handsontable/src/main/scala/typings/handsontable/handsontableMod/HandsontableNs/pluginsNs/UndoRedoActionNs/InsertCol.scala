package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.UndoRedoActionNs

import typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction
import typings.handsontable.handsontableStrings.insert_col
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertCol extends UndoRedoAction {
  var actionType: insert_col
  var amount: Double
  var index: Double
}

object InsertCol {
  @scala.inline
  def apply(actionType: insert_col, amount: Double, index: Double): InsertCol = {
    val __obj = js.Dynamic.literal(actionType = actionType, amount = amount, index = index)
  
    __obj.asInstanceOf[InsertCol]
  }
}

