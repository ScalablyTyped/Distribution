package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgComboSelectionChangedEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to array of new selected items. That can be null.
    */
  var items: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain reference to array of old selected items. That can be null.
    */
  var oldItems: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain reference to igCombo.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object IgComboSelectionChangedEventUIParam {
  
  inline def apply(): IgComboSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboSelectionChangedEventUIParam]
  }
  
  extension [Self <: IgComboSelectionChangedEventUIParam](x: Self) {
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setOldItems(value: Any): Self = StObject.set(x, "oldItems", value.asInstanceOf[js.Any])
    
    inline def setOldItemsUndefined: Self = StObject.set(x, "oldItems", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
