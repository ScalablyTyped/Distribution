package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PartitionMetadata extends js.Object {
  var partitionMetadata: js.Array[kafkajsLib.kafkajsMod.PartitionMetadata]
  var topic: scala.Double
  var topicErrorCode: scala.Double
}

object Anon_PartitionMetadata {
  @scala.inline
  def apply(
    partitionMetadata: js.Array[kafkajsLib.kafkajsMod.PartitionMetadata],
    topic: scala.Double,
    topicErrorCode: scala.Double
  ): Anon_PartitionMetadata = {
    val __obj = js.Dynamic.literal(partitionMetadata = partitionMetadata, topic = topic, topicErrorCode = topicErrorCode)
  
    __obj.asInstanceOf[Anon_PartitionMetadata]
  }
}

