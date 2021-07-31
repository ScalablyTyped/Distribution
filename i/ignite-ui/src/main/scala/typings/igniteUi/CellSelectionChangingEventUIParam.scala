package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellSelectionChangingEventUIParam extends StObject {
  
  /**
    * Gets reference to the cell object.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the column index for the first cell in a range selection.
    */
  var firstColumnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the row index for the first cell in a range selection.
    */
  var firstRowIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the column index for the last cell in a range selection.
    */
  var lastColumnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the row index for the last cell in a range selection.
    */
  var lastRowIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets reference to GridSelection.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets reference to selected cells object array.
    */
  var selectedCells: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object CellSelectionChangingEventUIParam {
  
  @scala.inline
  def apply(): CellSelectionChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellSelectionChangingEventUIParam]
  }
  
  @scala.inline
  implicit class CellSelectionChangingEventUIParamMutableBuilder[Self <: CellSelectionChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell(value: js.Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    @scala.inline
    def setFirstColumnIndex(value: Double): Self = StObject.set(x, "firstColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstColumnIndexUndefined: Self = StObject.set(x, "firstColumnIndex", js.undefined)
    
    @scala.inline
    def setFirstRowIndex(value: Double): Self = StObject.set(x, "firstRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstRowIndexUndefined: Self = StObject.set(x, "firstRowIndex", js.undefined)
    
    @scala.inline
    def setLastColumnIndex(value: Double): Self = StObject.set(x, "lastColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastColumnIndexUndefined: Self = StObject.set(x, "lastColumnIndex", js.undefined)
    
    @scala.inline
    def setLastRowIndex(value: Double): Self = StObject.set(x, "lastRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRowIndexUndefined: Self = StObject.set(x, "lastRowIndex", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setSelectedCells(value: js.Array[js.Any]): Self = StObject.set(x, "selectedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedCellsUndefined: Self = StObject.set(x, "selectedCells", js.undefined)
    
    @scala.inline
    def setSelectedCellsVarargs(value: js.Any*): Self = StObject.set(x, "selectedCells", js.Array(value :_*))
  }
}
