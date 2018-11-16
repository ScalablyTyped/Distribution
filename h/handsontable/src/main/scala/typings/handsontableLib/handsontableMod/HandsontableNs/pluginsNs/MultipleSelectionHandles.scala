package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MultipleSelectionHandles extends Base {
  var dragged: js.Array[_]
  var eventManager: EventManager
  var lastSetCell: stdLib.HTMLElement | scala.Unit
  def getCurrentRangeCoords(
    selectedRange: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange,
    currentTouch: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords,
    touchStartDirection: java.lang.String,
    currentDirection: java.lang.String,
    draggedHandle: java.lang.String
  ): js.Object
  def isDragged(): scala.Boolean
}

