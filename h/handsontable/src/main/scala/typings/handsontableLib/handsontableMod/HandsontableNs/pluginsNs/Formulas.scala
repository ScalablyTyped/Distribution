package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Formulas extends Base {
  var dataProvider: DataProvider
  var eventManager: EventManager
  var sheet: Sheet
  var undoRedoSnapshot: UndoRedoSnapshot
  def getCellValue(row: scala.Double, column: scala.Double): js.Any
  def getVariable(name: java.lang.String): js.Any
  def hasComputedCellValue(row: scala.Double, column: scala.Double): scala.Boolean
  def recalculate(): scala.Unit
  def recalculateFull(): scala.Unit
  def recalculateOptimized(): scala.Unit
  def setVariable(name: java.lang.String, value: js.Any): scala.Unit
}

