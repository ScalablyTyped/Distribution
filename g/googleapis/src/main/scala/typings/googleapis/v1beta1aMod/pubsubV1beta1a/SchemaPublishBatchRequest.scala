package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPublishBatchRequest extends StObject {
  
  /**
    * The messages to publish.
    */
  var messages: js.UndefOr[js.Array[SchemaPubsubMessage]] = js.undefined
  
  /**
    * The messages in the request will be published on this topic.
    */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object SchemaPublishBatchRequest {
  
  inline def apply(): SchemaPublishBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishBatchRequest]
  }
  
  extension [Self <: SchemaPublishBatchRequest](x: Self) {
    
    inline def setMessages(value: js.Array[SchemaPubsubMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: SchemaPubsubMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
