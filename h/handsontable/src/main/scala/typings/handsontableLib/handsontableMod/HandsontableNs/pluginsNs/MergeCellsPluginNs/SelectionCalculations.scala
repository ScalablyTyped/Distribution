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
    getUpdatedSelectionRange: js.Function2[
      handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, 
      js.Object, 
      handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange
    ],
    snapDelta: js.Function3[
      js.Object, 
      handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, 
      MergedCellCoords, 
      scala.Unit
    ]
  ): SelectionCalculations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getUpdatedSelectionRange")(getUpdatedSelectionRange)
    __obj.updateDynamic("snapDelta")(snapDelta)
    __obj.asInstanceOf[SelectionCalculations]
  }
}

