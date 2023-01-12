package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Partitions extends StObject {
  
  var partitions: js.Array[Partition]
  
  var topic: String
}
object Partitions {
  
  inline def apply(partitions: js.Array[Partition], topic: String): Partitions = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partitions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partitions] (val x: Self) extends AnyVal {
    
    inline def setPartitions(value: js.Array[Partition]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsVarargs(value: Partition*): Self = StObject.set(x, "partitions", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
