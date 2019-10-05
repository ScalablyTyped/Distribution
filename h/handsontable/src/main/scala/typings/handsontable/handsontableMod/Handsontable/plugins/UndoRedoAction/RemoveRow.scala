package typings.handsontable.handsontableMod.Handsontable.plugins.UndoRedoAction

import typings.handsontable.handsontableStrings.remove_row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveRow extends js.Object {
  var actionType: remove_row
  var data: js.Array[js.Array[typings.handsontable.handsontableMod.Handsontable.plugins.CellValue]]
  var index: Double
}

object RemoveRow {
  @scala.inline
  def apply(
    actionType: remove_row,
    data: js.Array[js.Array[typings.handsontable.handsontableMod.Handsontable.plugins.CellValue]],
    index: Double
  ): RemoveRow = {
    val __obj = js.Dynamic.literal(actionType = actionType, data = data, index = index)
  
    __obj.asInstanceOf[RemoveRow]
  }
}

