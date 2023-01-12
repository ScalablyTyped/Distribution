package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesRescheduleRequest
  extends StObject
     with BaseRequest {
  
  /** a scheduled email id, as returned by any of the messages/send calls or messages/list-scheduled */
  var id: String
  
  /**
    * the new UTC timestamp when the message should sent. Mandrill can't time travel, so if you specify
    * a time in past the message will be sent immediately
    */
  var send_at: String
}
object MessagesRescheduleRequest {
  
  inline def apply(id: String, send_at: String): MessagesRescheduleRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], send_at = send_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesRescheduleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessagesRescheduleRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSend_at(value: String): Self = StObject.set(x, "send_at", value.asInstanceOf[js.Any])
  }
}
