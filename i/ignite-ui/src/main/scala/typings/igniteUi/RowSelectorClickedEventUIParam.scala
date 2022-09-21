package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowSelectorClickedEventUIParam extends StObject {
  
  /**
    * Gets reference to the fixed row the clicked row selector resides in(if there are fixed columns).
    */
  var fixedRow: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the grid the RowSelectors are initialized for.
    */
  var grid: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to RowSelectors.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to the row the clicked row selector resides in.
    */
  var row: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the index of the row the clicked row selector resides in.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the key of the row the clicked row selector resides in.
    */
  var rowKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the row selector cell.
    */
  var rowSelector: js.UndefOr[String] = js.undefined
}
object RowSelectorClickedEventUIParam {
  
  inline def apply(): RowSelectorClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectorClickedEventUIParam]
  }
  
  extension [Self <: RowSelectorClickedEventUIParam](x: Self) {
    
    inline def setFixedRow(value: String): Self = StObject.set(x, "fixedRow", value.asInstanceOf[js.Any])
    
    inline def setFixedRowUndefined: Self = StObject.set(x, "fixedRow", js.undefined)
    
    inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setRowKey(value: String): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
    
    inline def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
    
    inline def setRowSelector(value: String): Self = StObject.set(x, "rowSelector", value.asInstanceOf[js.Any])
    
    inline def setRowSelectorUndefined: Self = StObject.set(x, "rowSelector", js.undefined)
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
