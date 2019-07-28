package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.UndoRedoActionNs

import typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs.ColumnConditions
import typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction
import typings.handsontable.handsontableStrings.filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends UndoRedoAction {
  var actionType: filter
  var conditionsStack: js.Array[ColumnConditions]
}

object Filter {
  @scala.inline
  def apply(actionType: filter, conditionsStack: js.Array[ColumnConditions]): Filter = {
    val __obj = js.Dynamic.literal(actionType = actionType, conditionsStack = conditionsStack)
  
    __obj.asInstanceOf[Filter]
  }
}

