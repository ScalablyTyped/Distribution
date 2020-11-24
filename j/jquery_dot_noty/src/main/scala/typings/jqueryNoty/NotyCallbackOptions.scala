package typings.jqueryNoty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotyCallbackOptions extends js.Object {
  
  var afterClose: js.UndefOr[js.Function] = js.native
  
  var afterShow: js.UndefOr[js.Function] = js.native
  
  var onClose: js.UndefOr[js.Function] = js.native
  
  var onCloseClick: js.UndefOr[js.Function] = js.native
  
  var onShow: js.UndefOr[js.Function] = js.native
}
object NotyCallbackOptions {
  
  @scala.inline
  def apply(): NotyCallbackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotyCallbackOptions]
  }
  
  @scala.inline
  implicit class NotyCallbackOptionsOps[Self <: NotyCallbackOptions] (val x: Self) extends AnyVal {
    
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
    def setAfterClose(value: js.Function): Self = this.set("afterClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterClose: Self = this.set("afterClose", js.undefined)
    
    @scala.inline
    def setAfterShow(value: js.Function): Self = this.set("afterShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterShow: Self = this.set("afterShow", js.undefined)
    
    @scala.inline
    def setOnClose(value: js.Function): Self = this.set("onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnCloseClick(value: js.Function): Self = this.set("onCloseClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCloseClick: Self = this.set("onCloseClick", js.undefined)
    
    @scala.inline
    def setOnShow(value: js.Function): Self = this.set("onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
  }
}
