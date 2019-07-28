package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.UndoRedoActionNs

import typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction
import typings.handsontable.handsontableStrings.remove_row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveRow extends UndoRedoAction {
  var actionType: remove_row
  var data: js.Array[
    js.Array[typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.CellValue]
  ]
  var index: Double
}

object RemoveRow {
  @scala.inline
  def apply(
    actionType: remove_row,
    data: js.Array[
      js.Array[typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.CellValue]
    ],
    index: Double
  ): RemoveRow = {
    val __obj = js.Dynamic.literal(actionType = actionType, data = data, index = index)
  
    __obj.asInstanceOf[RemoveRow]
  }
}

