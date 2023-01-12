package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnHidingRefusedEventUIParam extends StObject {
  
  /**
    * Array of column keys. Has a value only if the column's key is a string.
    */
  var columnKeys: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets a reference to the GridHiding widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ColumnHidingRefusedEventUIParam {
  
  inline def apply(): ColumnHidingRefusedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHidingRefusedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnHidingRefusedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setColumnKeys(value: js.Array[Any]): Self = StObject.set(x, "columnKeys", value.asInstanceOf[js.Any])
    
    inline def setColumnKeysUndefined: Self = StObject.set(x, "columnKeys", js.undefined)
    
    inline def setColumnKeysVarargs(value: Any*): Self = StObject.set(x, "columnKeys", js.Array(value*))
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
