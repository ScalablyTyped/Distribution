package typings.intercomClient.anon

import typings.intercomClient.messageMod.FromToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<intercom-client.intercom-client/Message.CreateMessage> */
@js.native
trait PartialCreateMessage extends js.Object {
  
  var body: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[FromToObject] = js.native
  
  var message_type: js.UndefOr[String] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var to: js.UndefOr[FromToObject] = js.native
}
object PartialCreateMessage {
  
  @scala.inline
  def apply(): PartialCreateMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreateMessage]
  }
  
  @scala.inline
  implicit class PartialCreateMessageOps[Self <: PartialCreateMessage] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setFrom(value: FromToObject): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setMessage_type(value: String): Self = this.set("message_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage_type: Self = this.set("message_type", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTo(value: FromToObject): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
