package typings.mailchimpMailchimpTransactional.mod

import typings.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalStrings.bounced
import typings.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalStrings.rejected
import typings.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalStrings.sent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesSearchResponse extends StObject {
  
  /** the message's unique id */
  var _id: String
  
  /** how many times has a link been clicked in this message */
  var clicks: Double
  
  /** list of individual clicks for the message */
  var clicks_detail: js.Array[MessagesClickDetail]
  
  /** the recipient email address */
  var email: String
  
  /** any custom metadata provided when the message was sent */
  var metadata: js.UndefOr[Any] = js.undefined
  
  /** how many times has this message been opened */
  var opens: Double
  
  /** list of individual opens for the message */
  var opens_detail: js.Array[MessageOpenDetail]
  
  /** the email address of the sender */
  var sender: String
  
  /** sending status of this message */
  var state: sent | bounced | rejected
  
  /** the message's subject line */
  var subject: String
  
  /** list of tags on this message */
  var tags: js.Array[String]
  
  /** the unique name of the template used, if any */
  var template: js.UndefOr[String | Null] = js.undefined
  
  /** the Unix timestamp from when this message was sent */
  var ts: Double
}
object MessagesSearchResponse {
  
  inline def apply(
    _id: String,
    clicks: Double,
    clicks_detail: js.Array[MessagesClickDetail],
    email: String,
    opens: Double,
    opens_detail: js.Array[MessageOpenDetail],
    sender: String,
    state: sent | bounced | rejected,
    subject: String,
    tags: js.Array[String],
    ts: Double
  ): MessagesSearchResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clicks = clicks.asInstanceOf[js.Any], clicks_detail = clicks_detail.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], opens = opens.asInstanceOf[js.Any], opens_detail = opens_detail.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesSearchResponse]
  }
  
  extension [Self <: MessagesSearchResponse](x: Self) {
    
    inline def setClicks(value: Double): Self = StObject.set(x, "clicks", value.asInstanceOf[js.Any])
    
    inline def setClicks_detail(value: js.Array[MessagesClickDetail]): Self = StObject.set(x, "clicks_detail", value.asInstanceOf[js.Any])
    
    inline def setClicks_detailVarargs(value: MessagesClickDetail*): Self = StObject.set(x, "clicks_detail", js.Array(value*))
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOpens(value: Double): Self = StObject.set(x, "opens", value.asInstanceOf[js.Any])
    
    inline def setOpens_detail(value: js.Array[MessageOpenDetail]): Self = StObject.set(x, "opens_detail", value.asInstanceOf[js.Any])
    
    inline def setOpens_detailVarargs(value: MessageOpenDetail*): Self = StObject.set(x, "opens_detail", js.Array(value*))
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setState(value: sent | bounced | rejected): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateNull: Self = StObject.set(x, "template", null)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
