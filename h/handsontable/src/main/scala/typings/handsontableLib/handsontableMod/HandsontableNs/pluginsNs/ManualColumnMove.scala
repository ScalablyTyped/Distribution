package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ManualColumnMove extends Base {
  var backlight: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.moveUINs.BacklightUI
  var columnsMapper: MoveColumnsMapper
  var eventManager: EventManager
  var guideline: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.moveUINs.GuidelineUI
  var removedColumns: js.Array[_]
  def moveColumn(column: scala.Double, target: scala.Double): scala.Unit
  def moveColumns(columns: js.Array[scala.Double], target: scala.Double): scala.Unit
}

