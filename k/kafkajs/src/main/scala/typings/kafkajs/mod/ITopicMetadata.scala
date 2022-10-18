package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITopicMetadata extends StObject {
  
  var name: String
  
  var partitions: js.Array[PartitionMetadata]
}
object ITopicMetadata {
  
  inline def apply(name: String, partitions: js.Array[PartitionMetadata]): ITopicMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], partitions = partitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopicMetadata]
  }
  
  extension [Self <: ITopicMetadata](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPartitions(value: js.Array[PartitionMetadata]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsVarargs(value: PartitionMetadata*): Self = StObject.set(x, "partitions", js.Array(value*))
  }
}
