package typings.handsontable.handsontableMod.Handsontable.plugins.MergeCellsPlugin

import typings.handsontable.handsontableMod.Handsontable.wot.CellRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionCalculations extends js.Object {
  def getUpdatedSelectionRange(oldSelectionRange: CellRange, delta: js.Object): CellRange
  def snapDelta(delta: js.Object, selectionRange: CellRange, mergedCell: MergedCellCoords): Unit
}

object SelectionCalculations {
  @scala.inline
  def apply(
    getUpdatedSelectionRange: (CellRange, js.Object) => CellRange,
    snapDelta: (js.Object, CellRange, MergedCellCoords) => Unit
  ): SelectionCalculations = {
    val __obj = js.Dynamic.literal(getUpdatedSelectionRange = js.Any.fromFunction2(getUpdatedSelectionRange), snapDelta = js.Any.fromFunction3(snapDelta))
  
    __obj.asInstanceOf[SelectionCalculations]
  }
}

