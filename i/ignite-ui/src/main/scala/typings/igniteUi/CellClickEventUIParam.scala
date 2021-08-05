package typings.igniteUi

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellClickEventUIParam extends StObject {
  
  /**
    * Gets a reference to cell DOM element.
    */
  var cellElement: js.UndefOr[Element] = js.undefined
  
  /**
    * Gets the column index of the DOM element.
    */
  var colIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the column key.
    */
  var colKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the row index.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the row key.
    */
  var rowKey: js.UndefOr[js.Any] = js.undefined
}
object CellClickEventUIParam {
  
  inline def apply(): CellClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellClickEventUIParam]
  }
  
  extension [Self <: CellClickEventUIParam](x: Self) {
    
    inline def setCellElement(value: Element): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
    
    inline def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
    
    inline def setColIndex(value: Double): Self = StObject.set(x, "colIndex", value.asInstanceOf[js.Any])
    
    inline def setColIndexUndefined: Self = StObject.set(x, "colIndex", js.undefined)
    
    inline def setColKey(value: String): Self = StObject.set(x, "colKey", value.asInstanceOf[js.Any])
    
    inline def setColKeyUndefined: Self = StObject.set(x, "colKey", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setRowKey(value: js.Any): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
    
    inline def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
  }
}
