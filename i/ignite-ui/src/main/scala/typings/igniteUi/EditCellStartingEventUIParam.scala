package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditCellStartingEventUIParam extends StObject {
  
  /**
    * Gets the index of the column.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the key of the column.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the editor used for editing the column.
    */
  var editor: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Checks if the edit mode is for adding a new row.
    */
  var rowAdding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the row's PK value.
    */
  var rowID: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets or set the value of the editor.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}
object EditCellStartingEventUIParam {
  
  inline def apply(): EditCellStartingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditCellStartingEventUIParam]
  }
  
  extension [Self <: EditCellStartingEventUIParam](x: Self) {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setEditor(value: js.Any): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRowAdding(value: Boolean): Self = StObject.set(x, "rowAdding", value.asInstanceOf[js.Any])
    
    inline def setRowAddingUndefined: Self = StObject.set(x, "rowAdding", js.undefined)
    
    inline def setRowID(value: js.Any): Self = StObject.set(x, "rowID", value.asInstanceOf[js.Any])
    
    inline def setRowIDUndefined: Self = StObject.set(x, "rowID", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
