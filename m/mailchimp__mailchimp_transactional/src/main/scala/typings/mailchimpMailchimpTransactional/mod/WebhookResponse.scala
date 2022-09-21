package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhookResponse extends StObject {
  
  /** the key used to requests for this webhook */
  var auth_key: String
  
  /** the number of event batches that have ever been sent to this webhook */
  var batches_sent: Double
  
  /** the date and time that the webhook was created as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var created_at: String
  
  /** a description of the webhook */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /** The message events that will be posted to the hook */
  var events: js.Array[WebhookEvent]
  
  /** the total number of events that have ever been sent to this webhook */
  var events_sent: Double
  
  /** a unique integer identifier for the webhook */
  var id: Double
  
  /** if we've ever gotten an error trying to post to this webhook, the last error that we've seen */
  var last_error: js.UndefOr[String | Null] = js.undefined
  
  /**
    * the date and time that the webhook last successfully received events as a UTC string in
    * YYYY-MM-DD HH:MM:SS format
    */
  var last_sent_at: String
  
  /** The URL that the event data will be posted to */
  var url: String
}
object WebhookResponse {
  
  inline def apply(
    auth_key: String,
    batches_sent: Double,
    created_at: String,
    events: js.Array[WebhookEvent],
    events_sent: Double,
    id: Double,
    last_sent_at: String,
    url: String
  ): WebhookResponse = {
    val __obj = js.Dynamic.literal(auth_key = auth_key.asInstanceOf[js.Any], batches_sent = batches_sent.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], events_sent = events_sent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_sent_at = last_sent_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookResponse]
  }
  
  extension [Self <: WebhookResponse](x: Self) {
    
    inline def setAuth_key(value: String): Self = StObject.set(x, "auth_key", value.asInstanceOf[js.Any])
    
    inline def setBatches_sent(value: Double): Self = StObject.set(x, "batches_sent", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEvents(value: js.Array[WebhookEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: WebhookEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setEvents_sent(value: Double): Self = StObject.set(x, "events_sent", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLast_error(value: String): Self = StObject.set(x, "last_error", value.asInstanceOf[js.Any])
    
    inline def setLast_errorNull: Self = StObject.set(x, "last_error", null)
    
    inline def setLast_errorUndefined: Self = StObject.set(x, "last_error", js.undefined)
    
    inline def setLast_sent_at(value: String): Self = StObject.set(x, "last_sent_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
