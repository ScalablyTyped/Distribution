package typings.handsontable.mod.Handsontable.plugins.UndoRedoAction

import typings.handsontable.handsontableStrings.remove_row
import typings.handsontable.mod.Handsontable.plugins.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveRow extends js.Object {
  var actionType: remove_row
  var data: js.Array[js.Array[CellValue]]
  var index: Double
}

object RemoveRow {
  @scala.inline
  def apply(actionType: remove_row, data: js.Array[js.Array[CellValue]], index: Double): RemoveRow = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRow]
  }
}

