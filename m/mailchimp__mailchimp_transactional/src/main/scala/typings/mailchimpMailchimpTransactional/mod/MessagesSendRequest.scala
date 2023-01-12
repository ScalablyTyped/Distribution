package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesSendRequest
  extends StObject
     with BaseRequest {
  
  /**
    * Enable a background sending mode that is optimized for bulk sending.
    * In async mode, messages/send will immediately return a status of "queued" for every recipient.
    * To handle rejections when sending in async mode, set up a webhook for the 'reject' event.
    * Defaults to false for messages with no more than 10 recipients;
    * messages with more than 10 recipients are always sent asynchronously, regardless of the value of async.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the dedicated ip pool that should be used to send the message.
    * If you do not have any dedicated IPs, this parameter has no effect.
    * If you specify a pool that does not exist, your default pool will be used instead.
    */
  var ip_pool: js.UndefOr[String] = js.undefined
  
  /** The information on the message to send */
  var message: MessagesMessage
  
  /**
    * When this message should be sent as a UTC timestamp in YYYY-MM-DD HH:MM:SS format.
    * If you specify a time in the past, the message will be sent immediately.
    */
  var send_at: js.UndefOr[String] = js.undefined
}
object MessagesSendRequest {
  
  inline def apply(message: MessagesMessage): MessagesSendRequest = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesSendRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessagesSendRequest] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setIp_pool(value: String): Self = StObject.set(x, "ip_pool", value.asInstanceOf[js.Any])
    
    inline def setIp_poolUndefined: Self = StObject.set(x, "ip_pool", js.undefined)
    
    inline def setMessage(value: MessagesMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSend_at(value: String): Self = StObject.set(x, "send_at", value.asInstanceOf[js.Any])
    
    inline def setSend_atUndefined: Self = StObject.set(x, "send_at", js.undefined)
  }
}
