package typings.mailchimpMailchimpTransactional.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesParseResponse extends StObject {
  
  /** an array of any attachments that can be found in the message */
  var attachments: js.Array[MessageAttachmentParsed]
  
  /** the email address of the sender */
  var from_email: String
  
  /** the alias of the sender (if any) */
  var from_name: js.UndefOr[String | Null] = js.undefined
  
  /** the key-value pairs of the MIME headers for the message's main document */
  var headers: Record[String, String]
  
  /** the HTML part of the message, if any */
  var html: js.UndefOr[String | Null] = js.undefined
  
  /** an array of any embedded images that can be found in the message */
  var images: js.Array[MessageImage]
  
  /** the subject of the message */
  var subject: String
  
  /** the text part of the message, if any */
  var text: js.UndefOr[String | Null] = js.undefined
  
  /** an array of any recipients in the message */
  var to: js.Array[MessageTo]
}
object MessagesParseResponse {
  
  inline def apply(
    attachments: js.Array[MessageAttachmentParsed],
    from_email: String,
    headers: Record[String, String],
    images: js.Array[MessageImage],
    subject: String,
    to: js.Array[MessageTo]
  ): MessagesParseResponse = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], from_email = from_email.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesParseResponse]
  }
  
  extension [Self <: MessagesParseResponse](x: Self) {
    
    inline def setAttachments(value: js.Array[MessageAttachmentParsed]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsVarargs(value: MessageAttachmentParsed*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setFrom_email(value: String): Self = StObject.set(x, "from_email", value.asInstanceOf[js.Any])
    
    inline def setFrom_name(value: String): Self = StObject.set(x, "from_name", value.asInstanceOf[js.Any])
    
    inline def setFrom_nameNull: Self = StObject.set(x, "from_name", null)
    
    inline def setFrom_nameUndefined: Self = StObject.set(x, "from_name", js.undefined)
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlNull: Self = StObject.set(x, "html", null)
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setImages(value: js.Array[MessageImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: MessageImage*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTo(value: js.Array[MessageTo]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToVarargs(value: MessageTo*): Self = StObject.set(x, "to", js.Array(value*))
  }
}
