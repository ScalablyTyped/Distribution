package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicOffsets extends js.Object {
  var partitions: js.Array[PartitionOffset]
  var topic: java.lang.String
}

object TopicOffsets {
  @scala.inline
  def apply(partitions: js.Array[PartitionOffset], topic: java.lang.String): TopicOffsets = {
    val __obj = js.Dynamic.literal(partitions = partitions, topic = topic)
  
    __obj.asInstanceOf[TopicOffsets]
  }
}

