package typings.kafkajs.anon

import typings.kafkajs.mod.TopicOffsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kafkajs.kafkajs.Offsets & {  consumerGroupId :string} */
trait OffsetsconsumerGroupIdstr extends StObject {
  
  var consumerGroupId: String
  
  var topics: js.Array[TopicOffsets]
}
object OffsetsconsumerGroupIdstr {
  
  inline def apply(consumerGroupId: String, topics: js.Array[TopicOffsets]): OffsetsconsumerGroupIdstr = {
    val __obj = js.Dynamic.literal(consumerGroupId = consumerGroupId.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetsconsumerGroupIdstr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffsetsconsumerGroupIdstr] (val x: Self) extends AnyVal {
    
    inline def setConsumerGroupId(value: String): Self = StObject.set(x, "consumerGroupId", value.asInstanceOf[js.Any])
    
    inline def setTopics(value: js.Array[TopicOffsets]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: TopicOffsets*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
