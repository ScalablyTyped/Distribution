package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckBoxStateChangedEventUIParam extends StObject {
  
  /**
    * Gets reference to the grid the RowSelectors are initialized for.
    */
  var grid: js.UndefOr[js.Any] = js.native
  
  /**
    * Checks if the header check box is the one being clicked. In this case no row related args are passed.
    */
  var isHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets reference to the igGridRowSelectors.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the row the clicked row selector resides in.
    */
  var row: js.UndefOr[String] = js.native
  
  /**
    * Gets the index of the row the clicked row selector resides in.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets the key of the row the clicked row selector resides in.
    */
  var rowKey: js.UndefOr[String] = js.native
  
  /**
    * Gets reference to the row selector cell.
    */
  var rowSelector: js.UndefOr[String] = js.native
  
  /**
    * Gets the state of the checkbox ("on","off").
    */
  var state: js.UndefOr[String] = js.native
}
object CheckBoxStateChangedEventUIParam {
  
  @scala.inline
  def apply(): CheckBoxStateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckBoxStateChangedEventUIParam]
  }
  
  @scala.inline
  implicit class CheckBoxStateChangedEventUIParamMutableBuilder[Self <: CheckBoxStateChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrid(value: js.Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setIsHeader(value: Boolean): Self = StObject.set(x, "isHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeaderUndefined: Self = StObject.set(x, "isHeader", js.undefined)
    
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
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
