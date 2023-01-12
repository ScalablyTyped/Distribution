package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesScheduledMessageResponse extends StObject {
  
  /** the scheduled message id */
  var _id: String
  
  /** the UTC timestamp when the message was created, in YYYY-MM-DD HH:MM:SS format */
  var created_at: String
  
  /** the email's sender address */
  var from_email: String
  
  /** the UTC timestamp when the message will be sent, in YYYY-MM-DD HH:MM:SS format */
  var send_at: String
  
  /** the email's subject */
  var subject: String
  
  /** the email's recipient */
  var to: String
}
object MessagesScheduledMessageResponse {
  
  inline def apply(_id: String, created_at: String, from_email: String, send_at: String, subject: String, to: String): MessagesScheduledMessageResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], from_email = from_email.asInstanceOf[js.Any], send_at = send_at.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesScheduledMessageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessagesScheduledMessageResponse] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setFrom_email(value: String): Self = StObject.set(x, "from_email", value.asInstanceOf[js.Any])
    
    inline def setSend_at(value: String): Self = StObject.set(x, "send_at", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
