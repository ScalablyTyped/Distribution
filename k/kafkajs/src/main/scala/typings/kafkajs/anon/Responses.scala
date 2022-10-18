package typings.kafkajs.anon

import typings.kafkajs.mod.TopicOffsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses extends StObject {
  
  var responses: js.Array[TopicOffsets]
}
object Responses {
  
  inline def apply(responses: js.Array[TopicOffsets]): Responses = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses]
  }
  
  extension [Self <: Responses](x: Self) {
    
    inline def setResponses(value: js.Array[TopicOffsets]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesVarargs(value: TopicOffsets*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
