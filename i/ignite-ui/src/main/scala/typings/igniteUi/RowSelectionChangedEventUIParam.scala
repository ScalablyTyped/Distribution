package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowSelectionChangedEventUIParam extends StObject {
  
  /**
    * Gets reference to GridSelection.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to the row object.
    */
  var row: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to rows object array.
    */
  var selectedRows: js.UndefOr[js.Array[Any]] = js.undefined
}
object RowSelectionChangedEventUIParam {
  
  inline def apply(): RowSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectionChangedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowSelectionChangedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setSelectedRows(value: js.Array[Any]): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowsUndefined: Self = StObject.set(x, "selectedRows", js.undefined)
    
    inline def setSelectedRowsVarargs(value: Any*): Self = StObject.set(x, "selectedRows", js.Array(value*))
  }
}
