package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.UndoRedoActionNs

import typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction
import typings.handsontable.handsontableStrings.remove_col
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveCol extends UndoRedoAction {
  var actionType: remove_col
  var amount: Double
  var columnPositions: js.Array[Double]
  var data: js.Array[
    js.Array[typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.CellValue]
  ]
  var headers: js.Array[String]
  var index: Double
  var indexes: js.Array[Double]
}

object RemoveCol {
  @scala.inline
  def apply(
    actionType: remove_col,
    amount: Double,
    columnPositions: js.Array[Double],
    data: js.Array[
      js.Array[typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.CellValue]
    ],
    headers: js.Array[String],
    index: Double,
    indexes: js.Array[Double]
  ): RemoveCol = {
    val __obj = js.Dynamic.literal(actionType = actionType, amount = amount, columnPositions = columnPositions, data = data, headers = headers, index = index, indexes = indexes)
  
    __obj.asInstanceOf[RemoveCol]
  }
}

