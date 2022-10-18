package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionerArgs extends StObject {
  
  var message: Message
  
  var partitionMetadata: js.Array[PartitionMetadata]
  
  var topic: String
}
object PartitionerArgs {
  
  inline def apply(message: Message, partitionMetadata: js.Array[PartitionMetadata], topic: String): PartitionerArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], partitionMetadata = partitionMetadata.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionerArgs]
  }
  
  extension [Self <: PartitionerArgs](x: Self) {
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPartitionMetadata(value: js.Array[PartitionMetadata]): Self = StObject.set(x, "partitionMetadata", value.asInstanceOf[js.Any])
    
    inline def setPartitionMetadataVarargs(value: PartitionMetadata*): Self = StObject.set(x, "partitionMetadata", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
