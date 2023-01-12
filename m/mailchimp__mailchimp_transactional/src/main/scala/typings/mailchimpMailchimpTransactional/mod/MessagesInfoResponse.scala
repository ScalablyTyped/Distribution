package typings.mailchimpMailchimpTransactional.mod

import typings.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalStrings.bounced
import typings.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalStrings.rejected
import typings.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalStrings.sent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesInfoResponse
  extends StObject
     with MessagesSearchResponse {
  
  /** a log of up to 3 smtp events for the message */
  var smtp_events: js.Array[MessageSmtpEvent]
}
object MessagesInfoResponse {
  
  inline def apply(
    _id: String,
    clicks: Double,
    clicks_detail: js.Array[MessagesClickDetail],
    email: String,
    opens: Double,
    opens_detail: js.Array[MessageOpenDetail],
    sender: String,
    smtp_events: js.Array[MessageSmtpEvent],
    state: sent | bounced | rejected,
    subject: String,
    tags: js.Array[String],
    ts: Double
  ): MessagesInfoResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clicks = clicks.asInstanceOf[js.Any], clicks_detail = clicks_detail.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], opens = opens.asInstanceOf[js.Any], opens_detail = opens_detail.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], smtp_events = smtp_events.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesInfoResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessagesInfoResponse] (val x: Self) extends AnyVal {
    
    inline def setSmtp_events(value: js.Array[MessageSmtpEvent]): Self = StObject.set(x, "smtp_events", value.asInstanceOf[js.Any])
    
    inline def setSmtp_eventsVarargs(value: MessageSmtpEvent*): Self = StObject.set(x, "smtp_events", js.Array(value*))
  }
}
