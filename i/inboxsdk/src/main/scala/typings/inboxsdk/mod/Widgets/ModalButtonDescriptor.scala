package typings.inboxsdk.mod.Widgets

import typings.inboxsdk.inboxsdkStrings.PRIMARY_ACTION
import typings.inboxsdk.inboxsdkStrings.SECONDARY_ACTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalButtonDescriptor extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  def onClick(): Unit = js.native
  
  var orderHint: js.UndefOr[Double] = js.native
  
  var text: String = js.native
  
  var title: String = js.native
  
  var `type`: js.UndefOr[PRIMARY_ACTION | SECONDARY_ACTION] = js.native
}
object ModalButtonDescriptor {
  
  @scala.inline
  def apply(onClick: () => Unit, text: String, title: String): ModalButtonDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalButtonDescriptor]
  }
  
  @scala.inline
  implicit class ModalButtonDescriptorOps[Self <: ModalButtonDescriptor] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setOrderHint(value: Double): Self = this.set("orderHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderHint: Self = this.set("orderHint", js.undefined)
    
    @scala.inline
    def setType(value: PRIMARY_ACTION | SECONDARY_ACTION): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
