package typings.handsontable.mod.Handsontable.plugins.UndoRedoAction

import typings.handsontable.handsontableStrings.filter
import typings.handsontable.mod.Handsontable.plugins.FiltersPlugin.ColumnConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var actionType: filter
  var conditionsStack: js.Array[ColumnConditions]
}

object Filter {
  @scala.inline
  def apply(actionType: filter, conditionsStack: js.Array[ColumnConditions]): Filter = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], conditionsStack = conditionsStack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Filter]
  }
}

