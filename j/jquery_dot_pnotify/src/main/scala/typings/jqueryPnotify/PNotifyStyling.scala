package typings.jqueryPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PNotifyStyling extends StylingOptions {
  
  // reference
  var athing: js.UndefOr[String] = js.native
  
  // confirm
  var btn: js.UndefOr[String] = js.native
  
  var btnactive: js.UndefOr[String] = js.native
  
  var btnfocus: js.UndefOr[String] = js.native
  
  var btnhover: js.UndefOr[String] = js.native
  
  // buttons
  var closer: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var error_icon: js.UndefOr[String] = js.native
  
  var hi_btn: js.UndefOr[String] = js.native
  
  var hi_btnhov: js.UndefOr[String] = js.native
  
  var hi_hnd: js.UndefOr[String] = js.native
  
  // history
  var hi_menu: js.UndefOr[String] = js.native
  
  var info: js.UndefOr[String] = js.native
  
  var info_icon: js.UndefOr[String] = js.native
  
  var input: js.UndefOr[String] = js.native
  
  var notice: js.UndefOr[String] = js.native
  
  var notice_icon: js.UndefOr[String] = js.native
  
  var pin_down: js.UndefOr[String] = js.native
  
  var pin_up: js.UndefOr[String] = js.native
  
  var success: js.UndefOr[String] = js.native
  
  var success_icon: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object PNotifyStyling {
  
  @scala.inline
  def apply(): PNotifyStyling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyStyling]
  }
  
  @scala.inline
  implicit class PNotifyStylingOps[Self <: PNotifyStyling] (val x: Self) extends AnyVal {
    
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
    def setAthing(value: String): Self = this.set("athing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAthing: Self = this.set("athing", js.undefined)
    
    @scala.inline
    def setBtn(value: String): Self = this.set("btn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtn: Self = this.set("btn", js.undefined)
    
    @scala.inline
    def setBtnactive(value: String): Self = this.set("btnactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtnactive: Self = this.set("btnactive", js.undefined)
    
    @scala.inline
    def setBtnfocus(value: String): Self = this.set("btnfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtnfocus: Self = this.set("btnfocus", js.undefined)
    
    @scala.inline
    def setBtnhover(value: String): Self = this.set("btnhover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtnhover: Self = this.set("btnhover", js.undefined)
    
    @scala.inline
    def setCloser(value: String): Self = this.set("closer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloser: Self = this.set("closer", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setError_icon(value: String): Self = this.set("error_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError_icon: Self = this.set("error_icon", js.undefined)
    
    @scala.inline
    def setHi_btn(value: String): Self = this.set("hi_btn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHi_btn: Self = this.set("hi_btn", js.undefined)
    
    @scala.inline
    def setHi_btnhov(value: String): Self = this.set("hi_btnhov", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHi_btnhov: Self = this.set("hi_btnhov", js.undefined)
    
    @scala.inline
    def setHi_hnd(value: String): Self = this.set("hi_hnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHi_hnd: Self = this.set("hi_hnd", js.undefined)
    
    @scala.inline
    def setHi_menu(value: String): Self = this.set("hi_menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHi_menu: Self = this.set("hi_menu", js.undefined)
    
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setInfo_icon(value: String): Self = this.set("info_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo_icon: Self = this.set("info_icon", js.undefined)
    
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setNotice(value: String): Self = this.set("notice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotice: Self = this.set("notice", js.undefined)
    
    @scala.inline
    def setNotice_icon(value: String): Self = this.set("notice_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotice_icon: Self = this.set("notice_icon", js.undefined)
    
    @scala.inline
    def setPin_down(value: String): Self = this.set("pin_down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePin_down: Self = this.set("pin_down", js.undefined)
    
    @scala.inline
    def setPin_up(value: String): Self = this.set("pin_up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePin_up: Self = this.set("pin_up", js.undefined)
    
    @scala.inline
    def setSuccess(value: String): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setSuccess_icon(value: String): Self = this.set("success_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess_icon: Self = this.set("success_icon", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
