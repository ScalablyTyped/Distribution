package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundSendRawResponse extends StObject {
  
  /** the email address of the matching recipient */
  var email: String
  
  /** the mailbox route pattern that the recipient matched */
  var pattern: js.UndefOr[String | Null] = js.undefined
  
  /** the webhook URL that the message was posted to */
  var url: js.UndefOr[String | Null] = js.undefined
}
object InboundSendRawResponse {
  
  inline def apply(email: String): InboundSendRawResponse = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundSendRawResponse]
  }
  
  extension [Self <: InboundSendRawResponse](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternNull: Self = StObject.set(x, "pattern", null)
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
