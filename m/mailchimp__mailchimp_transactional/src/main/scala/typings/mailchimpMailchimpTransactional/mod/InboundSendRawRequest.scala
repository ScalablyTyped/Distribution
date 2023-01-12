package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundSendRawRequest
  extends StObject
     with BaseRequest {
  
  /** the remote MTA's ip address. Optional; required for the SPF check. */
  var client_address: js.UndefOr[String] = js.undefined
  
  /**
    * the identification provided by the client mta in the MTA state of the SMTP conversation.
    * Required for the SPF check.
    */
  var helo: js.UndefOr[String] = js.undefined
  
  /** the address specified in the MAIL FROM stage of the SMTP conversation. Required for the SPF check. */
  var mail_from: js.UndefOr[String] = js.undefined
  
  /** the full MIME document of an email message */
  var raw_message: String
  
  /**
    * optionally define the recipients to receive the message - otherwise we'll use the
    * To, Cc, and Bcc headers provided in the document
    */
  var to: js.UndefOr[js.Array[String]] = js.undefined
}
object InboundSendRawRequest {
  
  inline def apply(raw_message: String): InboundSendRawRequest = {
    val __obj = js.Dynamic.literal(raw_message = raw_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundSendRawRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InboundSendRawRequest] (val x: Self) extends AnyVal {
    
    inline def setClient_address(value: String): Self = StObject.set(x, "client_address", value.asInstanceOf[js.Any])
    
    inline def setClient_addressUndefined: Self = StObject.set(x, "client_address", js.undefined)
    
    inline def setHelo(value: String): Self = StObject.set(x, "helo", value.asInstanceOf[js.Any])
    
    inline def setHeloUndefined: Self = StObject.set(x, "helo", js.undefined)
    
    inline def setMail_from(value: String): Self = StObject.set(x, "mail_from", value.asInstanceOf[js.Any])
    
    inline def setMail_fromUndefined: Self = StObject.set(x, "mail_from", js.undefined)
    
    inline def setRaw_message(value: String): Self = StObject.set(x, "raw_message", value.asInstanceOf[js.Any])
    
    inline def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value*))
  }
}
