package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicOffsets extends js.Object {
  var partitions: js.Array[PartitionOffset]
}

object TopicOffsets {
  @scala.inline
  def apply(partitions: js.Array[PartitionOffset]): TopicOffsets = {
    val __obj = js.Dynamic.literal(partitions = partitions)
  
    __obj.asInstanceOf[TopicOffsets]
  }
}

