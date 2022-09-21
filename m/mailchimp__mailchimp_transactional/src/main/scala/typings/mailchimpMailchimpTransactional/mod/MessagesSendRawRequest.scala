package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesSendRawRequest
  extends StObject
     with BaseRequest {
  
  /**
    * enable a background sending mode that is optimized for bulk sending. In async mode, messages/sendRaw
    * will immediately return a status of \"queued\" for every recipient. To handle rejections when
    * sending in async mode, set up a webhook for the 'reject' event. Defaults to false for messages
    * with no more than 10 recipients; messages with more than 10 recipients are always sent asynchronously,
    * regardless of the value of async.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /** optionally define the sender address - otherwise we'll use the address found in the provided headers */
  var from_email: js.UndefOr[String] = js.undefined
  
  /** optionally define the sender alias */
  var from_name: js.UndefOr[String] = js.undefined
  
  /**
    * the name of the dedicated ip pool that should be used to send the message. If you do not have any
    * dedicated IPs, this parameter has no effect. If you specify a pool that does not exist, your
    * default pool will be used instead.
    */
  var ip_pool: js.UndefOr[String] = js.undefined
  
  /** the full MIME document of an email message */
  var raw_message: String
  
  /** a custom domain to use for the messages's return-path */
  var return_path_domain: js.UndefOr[String] = js.undefined
  
  /**
    * when this message should be sent as a UTC timestamp in YYYY-MM-DD HH:MM:SS format. If you specify
    * a time in the past, the message will be sent immediately.
    */
  var send_at: js.UndefOr[String] = js.undefined
  
  /**
    * optionally define the recipient to receive the message - otherwise we'll use the To, Cc, and Bcc
    * headers provided in the document
    */
  var to: js.UndefOr[js.Array[String]] = js.undefined
}
object MessagesSendRawRequest {
  
  inline def apply(raw_message: String): MessagesSendRawRequest = {
    val __obj = js.Dynamic.literal(raw_message = raw_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesSendRawRequest]
  }
  
  extension [Self <: MessagesSendRawRequest](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setFrom_email(value: String): Self = StObject.set(x, "from_email", value.asInstanceOf[js.Any])
    
    inline def setFrom_emailUndefined: Self = StObject.set(x, "from_email", js.undefined)
    
    inline def setFrom_name(value: String): Self = StObject.set(x, "from_name", value.asInstanceOf[js.Any])
    
    inline def setFrom_nameUndefined: Self = StObject.set(x, "from_name", js.undefined)
    
    inline def setIp_pool(value: String): Self = StObject.set(x, "ip_pool", value.asInstanceOf[js.Any])
    
    inline def setIp_poolUndefined: Self = StObject.set(x, "ip_pool", js.undefined)
    
    inline def setRaw_message(value: String): Self = StObject.set(x, "raw_message", value.asInstanceOf[js.Any])
    
    inline def setReturn_path_domain(value: String): Self = StObject.set(x, "return_path_domain", value.asInstanceOf[js.Any])
    
    inline def setReturn_path_domainUndefined: Self = StObject.set(x, "return_path_domain", js.undefined)
    
    inline def setSend_at(value: String): Self = StObject.set(x, "send_at", value.asInstanceOf[js.Any])
    
    inline def setSend_atUndefined: Self = StObject.set(x, "send_at", js.undefined)
    
    inline def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value*))
  }
}
