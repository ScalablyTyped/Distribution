package typings.materialDialog.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCDialogCloseEventDetail extends js.Object {
  
  var action: js.UndefOr[String] = js.native
}
object MDCDialogCloseEventDetail {
  
  @scala.inline
  def apply(): MDCDialogCloseEventDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MDCDialogCloseEventDetail]
  }
  
  @scala.inline
  implicit class MDCDialogCloseEventDetailOps[Self <: MDCDialogCloseEventDetail] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
  }
}
