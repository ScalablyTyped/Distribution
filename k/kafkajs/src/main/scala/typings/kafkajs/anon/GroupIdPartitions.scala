package typings.kafkajs.anon

import typings.kafkajs.mod.SeekEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupIdPartitions extends StObject {
  
  var groupId: String
  
  var partitions: js.Array[SeekEntry]
  
  var topic: String
}
object GroupIdPartitions {
  
  inline def apply(groupId: String, partitions: js.Array[SeekEntry], topic: String): GroupIdPartitions = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], partitions = partitions.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupIdPartitions]
  }
  
  extension [Self <: GroupIdPartitions](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setPartitions(value: js.Array[SeekEntry]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setPartitionsVarargs(value: SeekEntry*): Self = StObject.set(x, "partitions", js.Array(value*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
