package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowSelectionChangingEventUIParam extends StObject {
  
  /**
    * Gets the end index for a range row selection.
    */
  var endIndex: js.UndefOr[Double] = js.undefined
  
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
  
  /**
    * Gets the start index for a range row selection.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
}
object RowSelectionChangingEventUIParam {
  
  inline def apply(): RowSelectionChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectionChangingEventUIParam]
  }
  
  extension [Self <: RowSelectionChangingEventUIParam](x: Self) {
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRow(value: js.Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setSelectedRows(value: js.Array[js.Any]): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowsUndefined: Self = StObject.set(x, "selectedRows", js.undefined)
    
    inline def setSelectedRowsVarargs(value: js.Any*): Self = StObject.set(x, "selectedRows", js.Array(value :_*))
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
