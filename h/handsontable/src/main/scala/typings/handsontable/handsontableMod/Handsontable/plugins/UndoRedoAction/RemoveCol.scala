package typings.handsontable.handsontableMod.Handsontable.plugins.UndoRedoAction

import typings.handsontable.handsontableMod.Handsontable.plugins.CellValue
import typings.handsontable.handsontableStrings.remove_col
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveCol extends js.Object {
  var actionType: remove_col
  var amount: Double
  var columnPositions: js.Array[Double]
  var data: js.Array[js.Array[CellValue]]
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
    data: js.Array[js.Array[CellValue]],
    headers: js.Array[String],
    index: Double,
    indexes: js.Array[Double]
  ): RemoveCol = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], columnPositions = columnPositions.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveCol]
  }
}

