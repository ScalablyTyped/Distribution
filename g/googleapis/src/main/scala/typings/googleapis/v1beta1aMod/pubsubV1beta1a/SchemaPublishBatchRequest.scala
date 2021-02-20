package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the PublishBatch method.
  */
@js.native
trait SchemaPublishBatchRequest extends StObject {
  
  /**
    * The messages to publish.
    */
  var messages: js.UndefOr[js.Array[SchemaPubsubMessage]] = js.native
  
  /**
    * The messages in the request will be published on this topic.
    */
  var topic: js.UndefOr[String] = js.native
}
object SchemaPublishBatchRequest {
  
  @scala.inline
  def apply(): SchemaPublishBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishBatchRequest]
  }
  
  @scala.inline
  implicit class SchemaPublishBatchRequestMutableBuilder[Self <: SchemaPublishBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: js.Array[SchemaPubsubMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: SchemaPubsubMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
