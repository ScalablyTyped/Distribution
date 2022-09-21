package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubsubConfig extends StObject {
  
  /** Service account that will make the push request. */
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
  
  /** Potential issues with the underlying Pub/Sub subscription configuration. Only populated on get requests. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Name of the subscription. Format is `projects/{project}/subscriptions/{subscription}`. */
  var subscription: js.UndefOr[String] = js.undefined
  
  /** The name of the topic from which this subscription is receiving messages. Format is `projects/{project}/topics/{topic}`. */
  var topic: js.UndefOr[String] = js.undefined
}
object PubsubConfig {
  
  inline def apply(): PubsubConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubsubConfig]
  }
  
  extension [Self <: PubsubConfig](x: Self) {
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
