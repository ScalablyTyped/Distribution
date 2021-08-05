package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for a PubSub connector used by the job.
  */
trait SchemaPubSubIODetails extends StObject {
  
  /**
    * Subscription used in the connection.
    */
  var subscription: js.UndefOr[String] = js.undefined
  
  /**
    * Topic accessed in the connection.
    */
  var topic: js.UndefOr[String] = js.undefined
}
object SchemaPubSubIODetails {
  
  inline def apply(): SchemaPubSubIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubSubIODetails]
  }
  
  extension [Self <: SchemaPubSubIODetails](x: Self) {
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
