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
  var grid: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets reference to RowSelectors.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
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
  
  @scala.inline
  def apply(): RowSelectorClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectorClickedEventUIParam]
  }
  
  @scala.inline
  implicit class RowSelectorClickedEventUIParamMutableBuilder[Self <: RowSelectorClickedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixedRow(value: String): Self = StObject.set(x, "fixedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedRowUndefined: Self = StObject.set(x, "fixedRow", js.undefined)
    
    @scala.inline
    def setGrid(value: js.Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setRowKey(value: String): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
    
    @scala.inline
    def setRowSelector(value: String): Self = StObject.set(x, "rowSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSelectorUndefined: Self = StObject.set(x, "rowSelector", js.undefined)
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
