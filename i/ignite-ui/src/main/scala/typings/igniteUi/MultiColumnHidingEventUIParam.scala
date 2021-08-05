package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiColumnHidingEventUIParam extends StObject {
  
  /**
    * Gets the array of the hidden column keys. Only when you click on Reset button in column chooser there is an array of column keys.
    */
  var columnKeys: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets a reference to the GridHiding widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object MultiColumnHidingEventUIParam {
  
  inline def apply(): MultiColumnHidingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiColumnHidingEventUIParam]
  }
  
  extension [Self <: MultiColumnHidingEventUIParam](x: Self) {
    
    inline def setColumnKeys(value: js.Array[js.Any]): Self = StObject.set(x, "columnKeys", value.asInstanceOf[js.Any])
    
    inline def setColumnKeysUndefined: Self = StObject.set(x, "columnKeys", js.undefined)
    
    inline def setColumnKeysVarargs(value: js.Any*): Self = StObject.set(x, "columnKeys", js.Array(value :_*))
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
