package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedItemChangingEventUIParam extends StObject {
  
  /**
    * Used to stop the selected item from changing.
    */
  var cancel: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get a reference to the newly selected data item.
    */
  var newItem: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get a reference to the current selected data item.
    */
  var oldItem: js.UndefOr[Any] = js.undefined
}
object SelectedItemChangingEventUIParam {
  
  inline def apply(): SelectedItemChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemChangingEventUIParam]
  }
  
  extension [Self <: SelectedItemChangingEventUIParam](x: Self) {
    
    inline def setCancel(value: Any): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setNewItem(value: Any): Self = StObject.set(x, "newItem", value.asInstanceOf[js.Any])
    
    inline def setNewItemUndefined: Self = StObject.set(x, "newItem", js.undefined)
    
    inline def setOldItem(value: Any): Self = StObject.set(x, "oldItem", value.asInstanceOf[js.Any])
    
    inline def setOldItemUndefined: Self = StObject.set(x, "oldItem", js.undefined)
  }
}
