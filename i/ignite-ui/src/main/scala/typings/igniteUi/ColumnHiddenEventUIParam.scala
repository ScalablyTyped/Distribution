package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnHiddenEventUIParam extends StObject {
  
  /**
    * Gets the hidden column index. Has a value only if the column's key is a number.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the hidden column key. Has a value only if the column's key is a string.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the GridHiding widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ColumnHiddenEventUIParam {
  
  inline def apply(): ColumnHiddenEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHiddenEventUIParam]
  }
  
  extension [Self <: ColumnHiddenEventUIParam](x: Self) {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
