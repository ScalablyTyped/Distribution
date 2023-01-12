package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetsByTopicPartition extends StObject {
  
  var topics: js.Array[TopicOffsets]
}
object OffsetsByTopicPartition {
  
  inline def apply(topics: js.Array[TopicOffsets]): OffsetsByTopicPartition = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetsByTopicPartition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffsetsByTopicPartition] (val x: Self) extends AnyVal {
    
    inline def setTopics(value: js.Array[TopicOffsets]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: TopicOffsets*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
