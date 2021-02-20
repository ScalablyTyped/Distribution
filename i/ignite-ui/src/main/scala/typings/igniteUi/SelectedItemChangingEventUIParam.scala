package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedItemChangingEventUIParam extends StObject {
  
  /**
    * Used to stop the selected item from changing.
    */
  var cancel: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get a reference to the newly selected data item.
    */
  var newItem: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get a reference to the current selected data item.
    */
  var oldItem: js.UndefOr[js.Any] = js.native
}
object SelectedItemChangingEventUIParam {
  
  @scala.inline
  def apply(): SelectedItemChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemChangingEventUIParam]
  }
  
  @scala.inline
  implicit class SelectedItemChangingEventUIParamMutableBuilder[Self <: SelectedItemChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: js.Any): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setNewItem(value: js.Any): Self = StObject.set(x, "newItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewItemUndefined: Self = StObject.set(x, "newItem", js.undefined)
    
    @scala.inline
    def setOldItem(value: js.Any): Self = StObject.set(x, "oldItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldItemUndefined: Self = StObject.set(x, "oldItem", js.undefined)
  }
}
