package typings.handsontable.mod.Handsontable.plugins.MergeCellsPlugin

import typings.handsontable.mod.Handsontable.wot.CellRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionCalculations extends js.Object {
  
  def getUpdatedSelectionRange(oldSelectionRange: CellRange, delta: js.Object): CellRange = js.native
  
  def snapDelta(delta: js.Object, selectionRange: CellRange, mergedCell: MergedCellCoords): Unit = js.native
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
  
  @scala.inline
  implicit class SelectionCalculationsOps[Self <: SelectionCalculations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetUpdatedSelectionRange(value: (CellRange, js.Object) => CellRange): Self = this.set("getUpdatedSelectionRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSnapDelta(value: (js.Object, CellRange, MergedCellCoords) => Unit): Self = this.set("snapDelta", js.Any.fromFunction3(value))
  }
}
