package typings.kafkajs.anon

import typings.kafkajs.mod.FetchOffsetsPartition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Partitions extends StObject {
  
  var partitions: js.Array[FetchOffsetsPartition]
  
  var topic: String
}
object Partitions {
  
  inline def apply(partitions: js.Array[FetchOffsetsPartition], topic: String): Partitions = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partitions]
  }
  
  extension [Self <: Partitions](x: Self) {
    
    inline def setPartitions(value: js.Array[FetchOffsetsPartition]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsVarargs(value: FetchOffsetsPartition*): Self = StObject.set(x, "partitions", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
