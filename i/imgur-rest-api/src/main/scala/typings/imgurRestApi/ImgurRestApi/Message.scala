package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var account_id: Double
  
  var body: String
  
  var conversation_id: Double
  
  var datetime: Double
  
  var from: String
  
  var id: Double
  
  var sender_id: Double
}
object Message {
  
  inline def apply(
    account_id: Double,
    body: String,
    conversation_id: Double,
    datetime: Double,
    from: String,
    id: Double,
    sender_id: Double
  ): Message = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], conversation_id = conversation_id.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sender_id = sender_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setConversation_id(value: Double): Self = StObject.set(x, "conversation_id", value.asInstanceOf[js.Any])
    
    inline def setDatetime(value: Double): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSender_id(value: Double): Self = StObject.set(x, "sender_id", value.asInstanceOf[js.Any])
  }
}
