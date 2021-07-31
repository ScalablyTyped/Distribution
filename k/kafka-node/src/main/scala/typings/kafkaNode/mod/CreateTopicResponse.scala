package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTopicResponse extends StObject {
  
  var error: String
  
  var topic: String
}
object CreateTopicResponse {
  
  @scala.inline
  def apply(error: String, topic: String): CreateTopicResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicResponse]
  }
  
  @scala.inline
  implicit class CreateTopicResponseMutableBuilder[Self <: CreateTopicResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
