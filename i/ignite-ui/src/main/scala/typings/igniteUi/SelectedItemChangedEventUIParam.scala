package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedItemChangedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the current selected data item.
    */
  var newItem: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get a reference to the previous selected data item.
    */
  var oldItem: js.UndefOr[Any] = js.undefined
}
object SelectedItemChangedEventUIParam {
  
  inline def apply(): SelectedItemChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemChangedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedItemChangedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setNewItem(value: Any): Self = StObject.set(x, "newItem", value.asInstanceOf[js.Any])
    
    inline def setNewItemUndefined: Self = StObject.set(x, "newItem", js.undefined)
    
    inline def setOldItem(value: Any): Self = StObject.set(x, "oldItem", value.asInstanceOf[js.Any])
    
    inline def setOldItemUndefined: Self = StObject.set(x, "oldItem", js.undefined)
  }
}
