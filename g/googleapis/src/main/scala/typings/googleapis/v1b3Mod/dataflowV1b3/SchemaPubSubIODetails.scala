package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPubSubIODetails extends StObject {
  
  /**
    * Subscription used in the connection.
    */
  var subscription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Topic accessed in the connection.
    */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object SchemaPubSubIODetails {
  
  inline def apply(): SchemaPubSubIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubSubIODetails]
  }
  
  extension [Self <: SchemaPubSubIODetails](x: Self) {
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
