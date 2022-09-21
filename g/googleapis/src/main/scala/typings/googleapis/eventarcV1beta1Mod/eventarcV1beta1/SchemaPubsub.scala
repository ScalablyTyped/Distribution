package typings.googleapis.eventarcV1beta1Mod.eventarcV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPubsub extends StObject {
  
  /**
    * Output only. The name of the Pub/Sub subscription created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID\}/subscriptions/{SUBSCRIPTION_NAME\}`.
    */
  var subscription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The name of the Pub/Sub topic created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID\}/topics/{TOPIC_NAME\}`. You may set an existing topic for triggers of the type `google.cloud.pubsub.topic.v1.messagePublished` only. The topic you provide here will not be deleted by Eventarc at trigger deletion.
    */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object SchemaPubsub {
  
  inline def apply(): SchemaPubsub = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsub]
  }
  
  extension [Self <: SchemaPubsub](x: Self) {
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
