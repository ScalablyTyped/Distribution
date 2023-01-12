package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITopicConfig extends StObject {
  
  var configEntries: js.UndefOr[js.Array[IResourceConfigEntry]] = js.undefined
  
  var numPartitions: js.UndefOr[Double] = js.undefined
  
  var replicaAssignment: js.UndefOr[js.Array[ReplicaAssignment]] = js.undefined
  
  var replicationFactor: js.UndefOr[Double] = js.undefined
  
  var topic: String
}
object ITopicConfig {
  
  inline def apply(topic: String): ITopicConfig = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopicConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITopicConfig] (val x: Self) extends AnyVal {
    
    inline def setConfigEntries(value: js.Array[IResourceConfigEntry]): Self = StObject.set(x, "configEntries", value.asInstanceOf[js.Any])
    
    inline def setConfigEntriesUndefined: Self = StObject.set(x, "configEntries", js.undefined)
    
    inline def setConfigEntriesVarargs(value: IResourceConfigEntry*): Self = StObject.set(x, "configEntries", js.Array(value*))
    
    inline def setNumPartitions(value: Double): Self = StObject.set(x, "numPartitions", value.asInstanceOf[js.Any])
    
    inline def setNumPartitionsUndefined: Self = StObject.set(x, "numPartitions", js.undefined)
    
    inline def setReplicaAssignment(value: js.Array[ReplicaAssignment]): Self = StObject.set(x, "replicaAssignment", value.asInstanceOf[js.Any])
    
    inline def setReplicaAssignmentUndefined: Self = StObject.set(x, "replicaAssignment", js.undefined)
    
    inline def setReplicaAssignmentVarargs(value: ReplicaAssignment*): Self = StObject.set(x, "replicaAssignment", js.Array(value*))
    
    inline def setReplicationFactor(value: Double): Self = StObject.set(x, "replicationFactor", value.asInstanceOf[js.Any])
    
    inline def setReplicationFactorUndefined: Self = StObject.set(x, "replicationFactor", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
