package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionsTopicString extends StObject {
  
  var partitions: js.UndefOr[js.Array[Double]] = js.undefined
  
  var topic: String
}
object PartitionsTopicString {
  
  inline def apply(topic: String): PartitionsTopicString = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionsTopicString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartitionsTopicString] (val x: Self) extends AnyVal {
    
    inline def setPartitions(value: js.Array[Double]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsUndefined: Self = StObject.set(x, "partitions", js.undefined)
    
    inline def setPartitionsVarargs(value: Double*): Self = StObject.set(x, "partitions", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
