package typings.kafkaNode.mod

import typings.kafkaNode.AnonName
import typings.kafkaNode.AnonPartition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTopicRequest extends js.Object {
  var configEntries: js.UndefOr[js.Array[AnonName]] = js.undefined
  var partitions: Double
  var replicaAssignment: js.UndefOr[js.Array[AnonPartition]] = js.undefined
  var replicationFactor: Double
  var topic: String
}

object CreateTopicRequest {
  @scala.inline
  def apply(
    partitions: Double,
    replicationFactor: Double,
    topic: String,
    configEntries: js.Array[AnonName] = null,
    replicaAssignment: js.Array[AnonPartition] = null
  ): CreateTopicRequest = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], replicationFactor = replicationFactor.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (configEntries != null) __obj.updateDynamic("configEntries")(configEntries.asInstanceOf[js.Any])
    if (replicaAssignment != null) __obj.updateDynamic("replicaAssignment")(replicaAssignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicRequest]
  }
}

