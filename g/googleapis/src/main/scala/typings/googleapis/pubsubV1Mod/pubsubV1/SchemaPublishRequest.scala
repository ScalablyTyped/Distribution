package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the Publish method.
  */
trait SchemaPublishRequest extends StObject {
  
  /**
    * The messages to publish.
    */
  var messages: js.UndefOr[js.Array[SchemaPubsubMessage]] = js.undefined
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
    def setMessages(value: js.Array[SchemaPubsubMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: SchemaPubsubMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
