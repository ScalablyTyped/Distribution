package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgComboSelectionChangedEventUIParam extends js.Object {
  
  /**
    * Used to obtain reference to array of new selected items. That can be null.
    */
  var items: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain reference to array of old selected items. That can be null.
    */
  var oldItems: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain reference to igCombo.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object IgComboSelectionChangedEventUIParam {
  
  @scala.inline
  def apply(): IgComboSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboSelectionChangedEventUIParam]
  }
  
  @scala.inline
  implicit class IgComboSelectionChangedEventUIParamOps[Self <: IgComboSelectionChangedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setItems(value: js.Any): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setOldItems(value: js.Any): Self = this.set("oldItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldItems: Self = this.set("oldItems", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
