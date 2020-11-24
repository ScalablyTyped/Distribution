package typings.invityApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportTicket extends js.Object {
  
  var description: String = js.native
  
  var email: String = js.native
  
  var name: String = js.native
  
  var reCaptchaV2Token: js.UndefOr[String] = js.native
  
  var reCaptchaV3Token: js.UndefOr[String] = js.native
  
  var topic: TicketTopic = js.native
}
object SupportTicket {
  
  @scala.inline
  def apply(description: String, email: String, name: String, topic: TicketTopic): SupportTicket = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportTicket]
  }
  
  @scala.inline
  implicit class SupportTicketOps[Self <: SupportTicket] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: TicketTopic): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReCaptchaV2Token(value: String): Self = this.set("reCaptchaV2Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReCaptchaV2Token: Self = this.set("reCaptchaV2Token", js.undefined)
    
    @scala.inline
    def setReCaptchaV3Token(value: String): Self = this.set("reCaptchaV3Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReCaptchaV3Token: Self = this.set("reCaptchaV3Token", js.undefined)
  }
}
