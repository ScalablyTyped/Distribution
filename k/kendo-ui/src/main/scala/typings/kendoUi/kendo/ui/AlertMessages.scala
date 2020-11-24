package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertMessages extends js.Object {
  
  var okText: js.UndefOr[String] = js.native
}
object AlertMessages {
  
  @scala.inline
  def apply(): AlertMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertMessages]
  }
  
  @scala.inline
  implicit class AlertMessagesOps[Self <: AlertMessages] (val x: Self) extends AnyVal {
    
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
    def setOkText(value: String): Self = this.set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
  }
}
