package typings.inboxsdk.mod.Compose

import typings.inboxsdk.inboxsdkStrings.MODIFIER
import typings.inboxsdk.inboxsdkStrings.SEND_ACTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComposeButtonDescriptor extends js.Object {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var hasDropdown: js.UndefOr[Boolean] = js.native
  
  var iconClass: js.UndefOr[String] = js.native
  
  var iconUrl: js.UndefOr[String] = js.native
  
  def onClick(event: ComposeButtonClickEvent): Unit = js.native
  
  var orderHint: js.UndefOr[Double] = js.native
  
  var title: String = js.native
  
  var `type`: js.UndefOr[MODIFIER | SEND_ACTION] = js.native
}
object ComposeButtonDescriptor {
  
  @scala.inline
  def apply(onClick: ComposeButtonClickEvent => Unit, title: String): ComposeButtonDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeButtonDescriptor]
  }
  
  @scala.inline
  implicit class ComposeButtonDescriptorOps[Self <: ComposeButtonDescriptor] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: ComposeButtonClickEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHasDropdown(value: Boolean): Self = this.set("hasDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasDropdown: Self = this.set("hasDropdown", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    
    @scala.inline
    def setOrderHint(value: Double): Self = this.set("orderHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderHint: Self = this.set("orderHint", js.undefined)
    
    @scala.inline
    def setType(value: MODIFIER | SEND_ACTION): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
