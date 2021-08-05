package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubSubIODetails extends StObject {
  
  /** Subscription used in the connection. */
  var subscription: js.UndefOr[String] = js.undefined
  
  /** Topic accessed in the connection. */
  var topic: js.UndefOr[String] = js.undefined
}
object PubSubIODetails {
  
  inline def apply(): PubSubIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubSubIODetails]
  }
  
  extension [Self <: PubSubIODetails](x: Self) {
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
