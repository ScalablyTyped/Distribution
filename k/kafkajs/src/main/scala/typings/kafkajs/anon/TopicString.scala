package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicString extends StObject {
  
  var partitions: js.Array[FirstSequence]
  
  var topic: String
}
object TopicString {
  
  inline def apply(partitions: js.Array[FirstSequence], topic: String): TopicString = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicString] (val x: Self) extends AnyVal {
    
    inline def setPartitions(value: js.Array[FirstSequence]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsVarargs(value: FirstSequence*): Self = StObject.set(x, "partitions", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
