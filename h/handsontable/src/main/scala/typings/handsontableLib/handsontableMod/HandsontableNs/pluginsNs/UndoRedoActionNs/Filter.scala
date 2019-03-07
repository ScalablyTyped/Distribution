package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter
  extends handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction {
  var actionType: handsontableLib.handsontableLibStrings.filter
  var conditionsStack: js.Array[
    handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs.ColumnConditions
  ]
}

object Filter {
  @scala.inline
  def apply(
    actionType: handsontableLib.handsontableLibStrings.filter,
    conditionsStack: js.Array[
      handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs.ColumnConditions
    ]
  ): Filter = {
    val __obj = js.Dynamic.literal(actionType = actionType, conditionsStack = conditionsStack)
  
    __obj.asInstanceOf[Filter]
  }
}

