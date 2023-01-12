package typings.kafkajs.anon

import typings.kafkajs.mod.SeekEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionsTopic extends StObject {
  
  var partitions: js.Array[SeekEntry]
  
  var topic: String
}
object PartitionsTopic {
  
  inline def apply(partitions: js.Array[SeekEntry], topic: String): PartitionsTopic = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionsTopic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartitionsTopic] (val x: Self) extends AnyVal {
    
    inline def setPartitions(value: js.Array[SeekEntry]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsVarargs(value: SeekEntry*): Self = StObject.set(x, "partitions", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
