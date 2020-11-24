package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedItemsChangingEventUIParam extends js.Object {
  
  /**
    * Used to stop the selected items from changing.
    */
  var cancel: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get a reference to the newly selected data items.
    */
  var newItems: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get a reference to the current selected data items.
    */
  var oldItems: js.UndefOr[js.Any] = js.native
}
object SelectedItemsChangingEventUIParam {
  
  @scala.inline
  def apply(): SelectedItemsChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemsChangingEventUIParam]
  }
  
  @scala.inline
  implicit class SelectedItemsChangingEventUIParamOps[Self <: SelectedItemsChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCancel(value: js.Any): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setNewItems(value: js.Any): Self = this.set("newItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewItems: Self = this.set("newItems", js.undefined)
    
    @scala.inline
    def setOldItems(value: js.Any): Self = this.set("oldItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldItems: Self = this.set("oldItems", js.undefined)
  }
}
