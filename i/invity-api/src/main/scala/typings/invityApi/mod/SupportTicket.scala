package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportTicket extends StObject {
  
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
  implicit class SupportTicketMutableBuilder[Self <: SupportTicket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReCaptchaV2Token(value: String): Self = StObject.set(x, "reCaptchaV2Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReCaptchaV2TokenUndefined: Self = StObject.set(x, "reCaptchaV2Token", js.undefined)
    
    @scala.inline
    def setReCaptchaV3Token(value: String): Self = StObject.set(x, "reCaptchaV3Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReCaptchaV3TokenUndefined: Self = StObject.set(x, "reCaptchaV3Token", js.undefined)
    
    @scala.inline
    def setTopic(value: TicketTopic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
