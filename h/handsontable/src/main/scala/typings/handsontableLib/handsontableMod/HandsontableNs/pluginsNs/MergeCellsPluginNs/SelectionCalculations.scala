package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionCalculations extends js.Object {
  def getUpdatedSelectionRange(
    oldSelectionRange: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange,
    delta: js.Object
  ): handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange
  def snapDelta(
    delta: js.Object,
    selectionRange: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange,
    mergedCell: MergedCellCoords
  ): scala.Unit
}

