package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedItemsChangedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the current selected data items.
    */
  var newItems: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get a reference to the previous selected data items.
    */
  var oldItems: js.UndefOr[Any] = js.undefined
}
object SelectedItemsChangedEventUIParam {
  
  inline def apply(): SelectedItemsChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemsChangedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedItemsChangedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setNewItems(value: Any): Self = StObject.set(x, "newItems", value.asInstanceOf[js.Any])
    
    inline def setNewItemsUndefined: Self = StObject.set(x, "newItems", js.undefined)
    
    inline def setOldItems(value: Any): Self = StObject.set(x, "oldItems", value.asInstanceOf[js.Any])
    
    inline def setOldItemsUndefined: Self = StObject.set(x, "oldItems", js.undefined)
  }
}
