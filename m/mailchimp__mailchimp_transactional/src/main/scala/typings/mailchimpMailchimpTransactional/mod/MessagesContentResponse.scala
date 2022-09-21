package typings.mailchimpMailchimpTransactional.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesContentResponse extends StObject {
  
  /** the message's unique id */
  var _id: String
  
  /** an array of any attachments that can be found in the message */
  var attachments: js.Array[MessageAttachment]
  
  /** the email address of the sender */
  var from_email: String
  
  /** the alias of the sender (if any) */
  var from_name: js.UndefOr[String | Null] = js.undefined
  
  /** the key-value pairs of the custom MIME headers for the message's main document */
  var headers: Record[String, String]
  
  /** the HTML part of the message, if any */
  var html: js.UndefOr[String | Null] = js.undefined
  
  /** the message's subject line */
  var subject: String
  
  /** list of tags on this message */
  var tags: js.Array[String]
  
  /** the text part of the message, if any */
  var text: js.UndefOr[String | Null] = js.undefined
  
  var to: MessageTo
  
  /** the Unix timestamp from when this message was sent */
  var ts: Double
}
object MessagesContentResponse {
  
  inline def apply(
    _id: String,
    attachments: js.Array[MessageAttachment],
    from_email: String,
    headers: Record[String, String],
    subject: String,
    tags: js.Array[String],
    to: MessageTo,
    ts: Double
  ): MessagesContentResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], from_email = from_email.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesContentResponse]
  }
  
  extension [Self <: MessagesContentResponse](x: Self) {
    
    inline def setAttachments(value: js.Array[MessageAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsVarargs(value: MessageAttachment*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setFrom_email(value: String): Self = StObject.set(x, "from_email", value.asInstanceOf[js.Any])
    
    inline def setFrom_name(value: String): Self = StObject.set(x, "from_name", value.asInstanceOf[js.Any])
    
    inline def setFrom_nameNull: Self = StObject.set(x, "from_name", null)
    
    inline def setFrom_nameUndefined: Self = StObject.set(x, "from_name", js.undefined)
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlNull: Self = StObject.set(x, "html", null)
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTo(value: MessageTo): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
