package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhooksAddRequest
  extends StObject
     with BaseRequest {
  
  /** an optional description of the webhook */
  var description: js.UndefOr[String] = js.undefined
  
  /** an optional list of events that will be posted to the webhook */
  var events: js.UndefOr[js.Array[WebhookEvent]] = js.undefined
  
  /** the URL to POST batches of events */
  var url: String
}
object WebhooksAddRequest {
  
  inline def apply(url: String): WebhooksAddRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhooksAddRequest]
  }
  
  extension [Self <: WebhooksAddRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEvents(value: js.Array[WebhookEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: WebhookEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
