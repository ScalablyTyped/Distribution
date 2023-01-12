package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicPartitionOffset
  extends StObject
     with TopicPartition {
  
  var offset: String
}
object TopicPartitionOffset {
  
  inline def apply(offset: String, partition: Double, topic: String): TopicPartitionOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicPartitionOffset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicPartitionOffset] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
