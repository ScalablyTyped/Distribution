package typings.kafkaNode.mod

import typings.kafkaNode.anon.Name
import typings.kafkaNode.anon.Partition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTopicRequest extends StObject {
  
  var configEntries: js.UndefOr[js.Array[Name]] = js.undefined
  
  var partitions: Double
  
  var replicaAssignment: js.UndefOr[js.Array[Partition]] = js.undefined
  
  var replicationFactor: Double
  
  var topic: String
}
object CreateTopicRequest {
  
  inline def apply(partitions: Double, replicationFactor: Double, topic: String): CreateTopicRequest = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], replicationFactor = replicationFactor.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTopicRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigEntries(value: js.Array[Name]): Self = StObject.set(x, "configEntries", value.asInstanceOf[js.Any])
    
    inline def setConfigEntriesUndefined: Self = StObject.set(x, "configEntries", js.undefined)
    
    inline def setConfigEntriesVarargs(value: Name*): Self = StObject.set(x, "configEntries", js.Array(value*))
    
    inline def setPartitions(value: Double): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    inline def setReplicaAssignment(value: js.Array[Partition]): Self = StObject.set(x, "replicaAssignment", value.asInstanceOf[js.Any])
    
    inline def setReplicaAssignmentUndefined: Self = StObject.set(x, "replicaAssignment", js.undefined)
    
    inline def setReplicaAssignmentVarargs(value: Partition*): Self = StObject.set(x, "replicaAssignment", js.Array(value*))
    
    inline def setReplicationFactor(value: Double): Self = StObject.set(x, "replicationFactor", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
