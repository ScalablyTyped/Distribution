package typings.inboxsdk.mod.Router

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadDescriptor extends js.Object {
  
  var gmailThreadId: js.UndefOr[String] = js.native
  
  var rfcMessageId: js.UndefOr[String] = js.native
}
object ThreadDescriptor {
  
  @scala.inline
  def apply(): ThreadDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreadDescriptor]
  }
  
  @scala.inline
  implicit class ThreadDescriptorOps[Self <: ThreadDescriptor] (val x: Self) extends AnyVal {
    
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
    def setGmailThreadId(value: String): Self = this.set("gmailThreadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGmailThreadId: Self = this.set("gmailThreadId", js.undefined)
    
    @scala.inline
    def setRfcMessageId(value: String): Self = this.set("rfcMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRfcMessageId: Self = this.set("rfcMessageId", js.undefined)
  }
}
