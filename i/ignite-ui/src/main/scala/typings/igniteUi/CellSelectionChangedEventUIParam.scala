package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellSelectionChangedEventUIParam extends StObject {
  
  /**
    * Gets reference to the cell object.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets reference to GridSelection.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets reference to selected cells object array.
    */
  var selectedCells: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object CellSelectionChangedEventUIParam {
  
  @scala.inline
  def apply(): CellSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellSelectionChangedEventUIParam]
  }
  
  @scala.inline
  implicit class CellSelectionChangedEventUIParamMutableBuilder[Self <: CellSelectionChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell(value: js.Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
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
