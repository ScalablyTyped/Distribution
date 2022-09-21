package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPullBatchRequest extends StObject {
  
  /**
    * The maximum number of PubsubEvents returned for this request. The Pub/Sub system may return fewer than the number of events specified.
    */
  var maxEvents: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If this is specified as true the system will respond immediately even if it is not able to return a message in the Pull response. Otherwise the system is allowed to wait until at least one message is available rather than returning no messages. The client may cancel the request if it does not wish to wait any longer for the response.
    */
  var returnImmediately: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The subscription from which messages should be pulled.
    */
  var subscription: js.UndefOr[String | Null] = js.undefined
}
object SchemaPullBatchRequest {
  
  inline def apply(): SchemaPullBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullBatchRequest]
  }
  
  extension [Self <: SchemaPullBatchRequest](x: Self) {
    
    inline def setMaxEvents(value: Double): Self = StObject.set(x, "maxEvents", value.asInstanceOf[js.Any])
    
    inline def setMaxEventsNull: Self = StObject.set(x, "maxEvents", null)
    
    inline def setMaxEventsUndefined: Self = StObject.set(x, "maxEvents", js.undefined)
    
    inline def setReturnImmediately(value: Boolean): Self = StObject.set(x, "returnImmediately", value.asInstanceOf[js.Any])
    
    inline def setReturnImmediatelyNull: Self = StObject.set(x, "returnImmediately", null)
    
    inline def setReturnImmediatelyUndefined: Self = StObject.set(x, "returnImmediately", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
