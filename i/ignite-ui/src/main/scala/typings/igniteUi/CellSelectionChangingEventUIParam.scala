package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellSelectionChangingEventUIParam extends js.Object {
  
  /**
    * Gets reference to the cell object.
    */
  var cell: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the column index for the first cell in a range selection.
    */
  var firstColumnIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets the row index for the first cell in a range selection.
    */
  var firstRowIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets the column index for the last cell in a range selection.
    */
  var lastColumnIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets the row index for the last cell in a range selection.
    */
  var lastRowIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets reference to GridSelection.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets reference to selected cells object array.
    */
  var selectedCells: js.UndefOr[js.Array[_]] = js.native
}
object CellSelectionChangingEventUIParam {
  
  @scala.inline
  def apply(): CellSelectionChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellSelectionChangingEventUIParam]
  }
  
  @scala.inline
  implicit class CellSelectionChangingEventUIParamOps[Self <: CellSelectionChangingEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setCell(value: js.Any): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    
    @scala.inline
    def setFirstColumnIndex(value: Double): Self = this.set("firstColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstColumnIndex: Self = this.set("firstColumnIndex", js.undefined)
    
    @scala.inline
    def setFirstRowIndex(value: Double): Self = this.set("firstRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstRowIndex: Self = this.set("firstRowIndex", js.undefined)
    
    @scala.inline
    def setLastColumnIndex(value: Double): Self = this.set("lastColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastColumnIndex: Self = this.set("lastColumnIndex", js.undefined)
    
    @scala.inline
    def setLastRowIndex(value: Double): Self = this.set("lastRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRowIndex: Self = this.set("lastRowIndex", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setSelectedCellsVarargs(value: js.Any*): Self = this.set("selectedCells", js.Array(value :_*))
    
    @scala.inline
    def setSelectedCells(value: js.Array[_]): Self = this.set("selectedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedCells: Self = this.set("selectedCells", js.undefined)
  }
}
