package typings.inboxsdk.mod.Widgets

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalOptions extends js.Object {
  
  var buttons: js.UndefOr[js.Array[ModalButtonDescriptor]] = js.native
  
  var chrome: js.UndefOr[Boolean] = js.native
  
  var constrainTitleWidth: js.UndefOr[Boolean] = js.native
  
  var el: HTMLElement = js.native
  
  var showCloseButton: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object ModalOptions {
  
  @scala.inline
  def apply(el: HTMLElement): ModalOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOptions]
  }
  
  @scala.inline
  implicit class ModalOptionsOps[Self <: ModalOptions] (val x: Self) extends AnyVal {
    
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
    def setEl(value: HTMLElement): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: ModalButtonDescriptor*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[ModalButtonDescriptor]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setChrome(value: Boolean): Self = this.set("chrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChrome: Self = this.set("chrome", js.undefined)
    
    @scala.inline
    def setConstrainTitleWidth(value: Boolean): Self = this.set("constrainTitleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrainTitleWidth: Self = this.set("constrainTitleWidth", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
