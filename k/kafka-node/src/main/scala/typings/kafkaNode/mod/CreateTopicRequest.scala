package typings.kafkaNode.mod

import typings.kafkaNode.anon.Name
import typings.kafkaNode.anon.Partition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTopicRequest extends js.Object {
  
  var configEntries: js.UndefOr[js.Array[Name]] = js.native
  
  var partitions: Double = js.native
  
  var replicaAssignment: js.UndefOr[js.Array[Partition]] = js.native
  
  var replicationFactor: Double = js.native
  
  var topic: String = js.native
}
object CreateTopicRequest {
  
  @scala.inline
  def apply(partitions: Double, replicationFactor: Double, topic: String): CreateTopicRequest = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], replicationFactor = replicationFactor.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicRequest]
  }
  
  @scala.inline
  implicit class CreateTopicRequestOps[Self <: CreateTopicRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPartitions(value: Double): Self = this.set("partitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationFactor(value: Double): Self = this.set("replicationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigEntriesVarargs(value: Name*): Self = this.set("configEntries", js.Array(value :_*))
    
    @scala.inline
    def setConfigEntries(value: js.Array[Name]): Self = this.set("configEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigEntries: Self = this.set("configEntries", js.undefined)
    
    @scala.inline
    def setReplicaAssignmentVarargs(value: Partition*): Self = this.set("replicaAssignment", js.Array(value :_*))
    
    @scala.inline
    def setReplicaAssignment(value: js.Array[Partition]): Self = this.set("replicaAssignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaAssignment: Self = this.set("replicaAssignment", js.undefined)
  }
}
