package typings.jqueryAlertable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertableOptions extends js.Object {
  
  var cancelButton: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var hide: js.UndefOr[js.Function] = js.native
  
  var html: js.UndefOr[Boolean] = js.native
  
  var modal: js.UndefOr[String] = js.native
  
  var okButton: js.UndefOr[String] = js.native
  
  var overlay: js.UndefOr[String] = js.native
  
  var prompt: js.UndefOr[String] = js.native
  
  var show: js.UndefOr[js.Function] = js.native
}
object AlertableOptions {
  
  @scala.inline
  def apply(): AlertableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertableOptions]
  }
  
  @scala.inline
  implicit class AlertableOptionsOps[Self <: AlertableOptions] (val x: Self) extends AnyVal {
    
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
    def setCancelButton(value: String): Self = this.set("cancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButton: Self = this.set("cancelButton", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setHide(value: js.Function): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setModal(value: String): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setOkButton(value: String): Self = this.set("okButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkButton: Self = this.set("okButton", js.undefined)
    
    @scala.inline
    def setOverlay(value: String): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setShow(value: js.Function): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}
