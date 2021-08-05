package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowSelectionChangedEventUIParam extends StObject {
  
  /**
    * Gets reference to GridSelection.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets reference to the row object.
    */
  var row: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets reference to rows object array.
    */
  var selectedRows: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object RowSelectionChangedEventUIParam {
  
  inline def apply(): RowSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectionChangedEventUIParam]
  }
  
  extension [Self <: RowSelectionChangedEventUIParam](x: Self) {
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRow(value: js.Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setSelectedRows(value: js.Array[js.Any]): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowsUndefined: Self = StObject.set(x, "selectedRows", js.undefined)
    
    inline def setSelectedRowsVarargs(value: js.Any*): Self = StObject.set(x, "selectedRows", js.Array(value :_*))
  }
}
