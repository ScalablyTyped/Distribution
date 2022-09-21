package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conversation extends StObject {
  
  var datetime: Double
  
  var done: js.UndefOr[Boolean] = js.undefined
  
  var id: Double
  
  var last_message_preview: String
  
  var message_count: Double
  
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var with_account: String
  
  var with_account_id: Double
}
object Conversation {
  
  inline def apply(
    datetime: Double,
    id: Double,
    last_message_preview: String,
    message_count: Double,
    with_account: String,
    with_account_id: Double
  ): Conversation = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_message_preview = last_message_preview.asInstanceOf[js.Any], message_count = message_count.asInstanceOf[js.Any], with_account = with_account.asInstanceOf[js.Any], with_account_id = with_account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversation]
  }
  
  extension [Self <: Conversation](x: Self) {
    
    inline def setDatetime(value: Double): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLast_message_preview(value: String): Self = StObject.set(x, "last_message_preview", value.asInstanceOf[js.Any])
    
    inline def setMessage_count(value: Double): Self = StObject.set(x, "message_count", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setWith_account(value: String): Self = StObject.set(x, "with_account", value.asInstanceOf[js.Any])
    
    inline def setWith_account_id(value: Double): Self = StObject.set(x, "with_account_id", value.asInstanceOf[js.Any])
  }
}
