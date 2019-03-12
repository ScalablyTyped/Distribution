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

object SelectionCalculations {
  @scala.inline
  def apply(
    getUpdatedSelectionRange: (handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, js.Object) => handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange,
    snapDelta: (js.Object, handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, MergedCellCoords) => scala.Unit
  ): SelectionCalculations = {
    val __obj = js.Dynamic.literal(getUpdatedSelectionRange = js.Any.fromFunction2(getUpdatedSelectionRange), snapDelta = js.Any.fromFunction3(snapDelta))
  
    __obj.asInstanceOf[SelectionCalculations]
  }
}

