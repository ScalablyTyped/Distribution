package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionChangingEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to array of the selected items before the new selection has happened. That can be null.
    */
  var currentItems: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to obtain reference to array of all items that will be selected after the selection finish. That can be null.
    */
  var items: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to obtain reference to igCombo.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object SelectionChangingEventUIParam {
  
  @scala.inline
  def apply(): SelectionChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionChangingEventUIParam]
  }
  
  @scala.inline
  implicit class SelectionChangingEventUIParamMutableBuilder[Self <: SelectionChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentItems(value: js.Any): Self = StObject.set(x, "currentItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentItemsUndefined: Self = StObject.set(x, "currentItems", js.undefined)
    
    @scala.inline
    def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
