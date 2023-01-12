package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiColumnHidingEventUIParam extends StObject {
  
  /**
    * Gets the array of the hidden column keys. Only when you click on Reset button in column chooser there is an array of column keys.
    */
  var columnKeys: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets a reference to the GridHiding widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object MultiColumnHidingEventUIParam {
  
  inline def apply(): MultiColumnHidingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiColumnHidingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiColumnHidingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setColumnKeys(value: js.Array[Any]): Self = StObject.set(x, "columnKeys", value.asInstanceOf[js.Any])
    
    inline def setColumnKeysUndefined: Self = StObject.set(x, "columnKeys", js.undefined)
    
    inline def setColumnKeysVarargs(value: Any*): Self = StObject.set(x, "columnKeys", js.Array(value*))
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
