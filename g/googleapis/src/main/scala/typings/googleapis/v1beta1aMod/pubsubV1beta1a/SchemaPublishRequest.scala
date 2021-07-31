package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the Publish method.
  */
trait SchemaPublishRequest extends StObject {
  
  /**
    * The message to publish.
    */
  var message: js.UndefOr[SchemaPubsubMessage] = js.undefined
  
  /**
    * The message in the request will be published on this topic.
    */
  var topic: js.UndefOr[String] = js.undefined
}
object SchemaPublishRequest {
  
  @scala.inline
  def apply(): SchemaPublishRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishRequest]
  }
  
  @scala.inline
  implicit class SchemaPublishRequestMutableBuilder[Self <: SchemaPublishRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: SchemaPubsubMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
