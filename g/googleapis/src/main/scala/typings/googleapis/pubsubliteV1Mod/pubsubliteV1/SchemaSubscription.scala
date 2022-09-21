package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscription extends StObject {
  
  /**
    * The settings for this subscription's message delivery.
    */
  var deliveryConfig: js.UndefOr[SchemaDeliveryConfig] = js.undefined
  
  /**
    * The name of the subscription. Structured like: projects/{project_number\}/locations/{location\}/subscriptions/{subscription_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the topic this subscription is attached to. Structured like: projects/{project_number\}/locations/{location\}/topics/{topic_id\}
    */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object SchemaSubscription {
  
  inline def apply(): SchemaSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscription]
  }
  
  extension [Self <: SchemaSubscription](x: Self) {
    
    inline def setDeliveryConfig(value: SchemaDeliveryConfig): Self = StObject.set(x, "deliveryConfig", value.asInstanceOf[js.Any])
    
    inline def setDeliveryConfigUndefined: Self = StObject.set(x, "deliveryConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
