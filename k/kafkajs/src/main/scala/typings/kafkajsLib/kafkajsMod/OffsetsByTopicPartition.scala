package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetsByTopicPartition extends js.Object {
  var topics: js.Array[TopicOffsets]
}

object OffsetsByTopicPartition {
  @scala.inline
  def apply(topics: js.Array[TopicOffsets]): OffsetsByTopicPartition = {
    val __obj = js.Dynamic.literal(topics = topics)
  
    __obj.asInstanceOf[OffsetsByTopicPartition]
  }
}

