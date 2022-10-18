package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionsArray extends StObject {
  
  var partitions: js.Array[FetchOffset]
  
  var topic: String
}
object PartitionsArray {
  
  inline def apply(partitions: js.Array[FetchOffset], topic: String): PartitionsArray = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionsArray]
  }
  
  extension [Self <: PartitionsArray](x: Self) {
    
    inline def setPartitions(value: js.Array[FetchOffset]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsVarargs(value: FetchOffset*): Self = StObject.set(x, "partitions", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
