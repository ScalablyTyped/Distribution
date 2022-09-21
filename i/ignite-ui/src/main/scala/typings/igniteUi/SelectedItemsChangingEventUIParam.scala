package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedItemsChangingEventUIParam extends StObject {
  
  /**
    * Used to stop the selected items from changing.
    */
  var cancel: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get a reference to the newly selected data items.
    */
  var newItems: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get a reference to the current selected data items.
    */
  var oldItems: js.UndefOr[Any] = js.undefined
}
object SelectedItemsChangingEventUIParam {
  
  inline def apply(): SelectedItemsChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemsChangingEventUIParam]
  }
  
  extension [Self <: SelectedItemsChangingEventUIParam](x: Self) {
    
    inline def setCancel(value: Any): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setNewItems(value: Any): Self = StObject.set(x, "newItems", value.asInstanceOf[js.Any])
    
    inline def setNewItemsUndefined: Self = StObject.set(x, "newItems", js.undefined)
    
    inline def setOldItems(value: Any): Self = StObject.set(x, "oldItems", value.asInstanceOf[js.Any])
    
    inline def setOldItemsUndefined: Self = StObject.set(x, "oldItems", js.undefined)
  }
}
