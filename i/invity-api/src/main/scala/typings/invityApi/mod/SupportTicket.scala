package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportTicket extends StObject {
  
  var description: String
  
  var email: String
  
  var name: String
  
  var reCaptchaV2Token: js.UndefOr[String] = js.undefined
  
  var reCaptchaV3Token: js.UndefOr[String] = js.undefined
  
  var topic: TicketTopic
}
object SupportTicket {
  
  inline def apply(description: String, email: String, name: String, topic: TicketTopic): SupportTicket = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportTicket]
  }
  
  extension [Self <: SupportTicket](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReCaptchaV2Token(value: String): Self = StObject.set(x, "reCaptchaV2Token", value.asInstanceOf[js.Any])
    
    inline def setReCaptchaV2TokenUndefined: Self = StObject.set(x, "reCaptchaV2Token", js.undefined)
    
    inline def setReCaptchaV3Token(value: String): Self = StObject.set(x, "reCaptchaV3Token", value.asInstanceOf[js.Any])
    
    inline def setReCaptchaV3TokenUndefined: Self = StObject.set(x, "reCaptchaV3Token", js.undefined)
    
    inline def setTopic(value: TicketTopic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
