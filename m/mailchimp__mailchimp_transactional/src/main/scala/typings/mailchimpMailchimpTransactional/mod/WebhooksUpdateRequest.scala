package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhooksUpdateRequest
  extends StObject
     with BaseRequest {
  
  /** an optional description of the webhook */
  var description: js.UndefOr[String] = js.undefined
  
  /** an optional list of events that will be posted to the webhook */
  var events: js.UndefOr[js.Array[WebhookEvent]] = js.undefined
  
  /** the unique identifier of a webhook belonging to this account */
  var id: Double
  
  /** the URL to POST batches of events. Requires webhook to exist. */
  var url: String
}
object WebhooksUpdateRequest {
  
  inline def apply(id: Double, url: String): WebhooksUpdateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhooksUpdateRequest]
  }
  
  extension [Self <: WebhooksUpdateRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEvents(value: js.Array[WebhookEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: WebhookEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
