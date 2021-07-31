package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedItemsChangingEventUIParam extends StObject {
  
  /**
    * Used to stop the selected items from changing.
    */
  var cancel: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get a reference to the newly selected data items.
    */
  var newItems: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get a reference to the current selected data items.
    */
  var oldItems: js.UndefOr[js.Any] = js.undefined
}
object SelectedItemsChangingEventUIParam {
  
  @scala.inline
  def apply(): SelectedItemsChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemsChangingEventUIParam]
  }
  
  @scala.inline
  implicit class SelectedItemsChangingEventUIParamMutableBuilder[Self <: SelectedItemsChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: js.Any): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setNewItems(value: js.Any): Self = StObject.set(x, "newItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewItemsUndefined: Self = StObject.set(x, "newItems", js.undefined)
    
    @scala.inline
    def setOldItems(value: js.Any): Self = StObject.set(x, "oldItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldItemsUndefined: Self = StObject.set(x, "oldItems", js.undefined)
  }
}
