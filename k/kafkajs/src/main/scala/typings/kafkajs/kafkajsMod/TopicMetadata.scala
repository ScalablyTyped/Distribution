package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicMetadata extends js.Object {
  var name: String
  var partitions: js.Array[PartitionMetadata]
}

object TopicMetadata {
  @scala.inline
  def apply(name: String, partitions: js.Array[PartitionMetadata]): TopicMetadata = {
    val __obj = js.Dynamic.literal(name = name, partitions = partitions)
  
    __obj.asInstanceOf[TopicMetadata]
  }
}

