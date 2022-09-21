package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellSelectionChangingEventUIParam extends StObject {
  
  /**
    * Gets reference to the cell object.
    */
  var cell: js.UndefOr[Any] = js.undefined
  
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
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to selected cells object array.
    */
  var selectedCells: js.UndefOr[js.Array[Any]] = js.undefined
}
object CellSelectionChangingEventUIParam {
  
  inline def apply(): CellSelectionChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellSelectionChangingEventUIParam]
  }
  
  extension [Self <: CellSelectionChangingEventUIParam](x: Self) {
    
    inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    inline def setFirstColumnIndex(value: Double): Self = StObject.set(x, "firstColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setFirstColumnIndexUndefined: Self = StObject.set(x, "firstColumnIndex", js.undefined)
    
    inline def setFirstRowIndex(value: Double): Self = StObject.set(x, "firstRowIndex", value.asInstanceOf[js.Any])
    
    inline def setFirstRowIndexUndefined: Self = StObject.set(x, "firstRowIndex", js.undefined)
    
    inline def setLastColumnIndex(value: Double): Self = StObject.set(x, "lastColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setLastColumnIndexUndefined: Self = StObject.set(x, "lastColumnIndex", js.undefined)
    
    inline def setLastRowIndex(value: Double): Self = StObject.set(x, "lastRowIndex", value.asInstanceOf[js.Any])
    
    inline def setLastRowIndexUndefined: Self = StObject.set(x, "lastRowIndex", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSelectedCells(value: js.Array[Any]): Self = StObject.set(x, "selectedCells", value.asInstanceOf[js.Any])
    
    inline def setSelectedCellsUndefined: Self = StObject.set(x, "selectedCells", js.undefined)
    
    inline def setSelectedCellsVarargs(value: Any*): Self = StObject.set(x, "selectedCells", js.Array(value*))
  }
}
