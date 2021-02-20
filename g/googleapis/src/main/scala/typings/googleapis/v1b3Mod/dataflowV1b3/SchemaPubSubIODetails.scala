package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for a PubSub connector used by the job.
  */
@js.native
trait SchemaPubSubIODetails extends StObject {
  
  /**
    * Subscription used in the connection.
    */
  var subscription: js.UndefOr[String] = js.native
  
  /**
    * Topic accessed in the connection.
    */
  var topic: js.UndefOr[String] = js.native
}
object SchemaPubSubIODetails {
  
  @scala.inline
  def apply(): SchemaPubSubIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubSubIODetails]
  }
  
  @scala.inline
  implicit class SchemaPubSubIODetailsMutableBuilder[Self <: SchemaPubSubIODetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
