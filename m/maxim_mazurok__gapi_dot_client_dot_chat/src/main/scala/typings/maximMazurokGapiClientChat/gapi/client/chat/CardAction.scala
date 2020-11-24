package typings.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardAction extends js.Object {
  
  /** The label used to be displayed in the action menu item. */
  var actionLabel: js.UndefOr[String] = js.native
  
  /** The onclick action for this action item. */
  var onClick: js.UndefOr[OnClick] = js.native
}
object CardAction {
  
  @scala.inline
  def apply(): CardAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardAction]
  }
  
  @scala.inline
  implicit class CardActionOps[Self <: CardAction] (val x: Self) extends AnyVal {
    
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
    def setActionLabel(value: String): Self = this.set("actionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionLabel: Self = this.set("actionLabel", js.undefined)
    
    @scala.inline
    def setOnClick(value: OnClick): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
}
