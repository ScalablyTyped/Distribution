package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionerPartitionMetadata extends js.Object {
  var leader: Double
  var partitionId: Double
}

object PartitionerPartitionMetadata {
  @scala.inline
  def apply(leader: Double, partitionId: Double): PartitionerPartitionMetadata = {
    val __obj = js.Dynamic.literal(leader = leader, partitionId = partitionId)
  
    __obj.asInstanceOf[PartitionerPartitionMetadata]
  }
}

