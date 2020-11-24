package typings.materialBanner.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCBannerCloseEventDetail extends js.Object {
  
  var reason: CloseReason = js.native
}
object MDCBannerCloseEventDetail {
  
  @scala.inline
  def apply(reason: CloseReason): MDCBannerCloseEventDetail = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCBannerCloseEventDetail]
  }
  
  @scala.inline
  implicit class MDCBannerCloseEventDetailOps[Self <: MDCBannerCloseEventDetail] (val x: Self) extends AnyVal {
    
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
    def setReason(value: CloseReason): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
