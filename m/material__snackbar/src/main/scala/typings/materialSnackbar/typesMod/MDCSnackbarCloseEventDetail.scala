package typings.materialSnackbar.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCSnackbarCloseEventDetail extends js.Object {
  
  var reason: js.UndefOr[String] = js.native
}
object MDCSnackbarCloseEventDetail {
  
  @scala.inline
  def apply(): MDCSnackbarCloseEventDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MDCSnackbarCloseEventDetail]
  }
  
  @scala.inline
  implicit class MDCSnackbarCloseEventDetailOps[Self <: MDCSnackbarCloseEventDetail] (val x: Self) extends AnyVal {
    
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
