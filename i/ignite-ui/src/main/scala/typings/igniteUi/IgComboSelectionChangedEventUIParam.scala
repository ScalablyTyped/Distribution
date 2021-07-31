package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgComboSelectionChangedEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to array of new selected items. That can be null.
    */
  var items: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to obtain reference to array of old selected items. That can be null.
    */
  var oldItems: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to obtain reference to igCombo.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object IgComboSelectionChangedEventUIParam {
  
  @scala.inline
  def apply(): IgComboSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboSelectionChangedEventUIParam]
  }
  
  @scala.inline
  implicit class IgComboSelectionChangedEventUIParamMutableBuilder[Self <: IgComboSelectionChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setOldItems(value: js.Any): Self = StObject.set(x, "oldItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldItemsUndefined: Self = StObject.set(x, "oldItems", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
