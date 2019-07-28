package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionSendOffsetsTopic extends js.Object {
  var partitions: js.Array[TransactionSendOffsetsTopicPartitions]
  var topic: String
}

object TransactionSendOffsetsTopic {
  @scala.inline
  def apply(partitions: js.Array[TransactionSendOffsetsTopicPartitions], topic: String): TransactionSendOffsetsTopic = {
    val __obj = js.Dynamic.literal(partitions = partitions, topic = topic)
  
    __obj.asInstanceOf[TransactionSendOffsetsTopic]
  }
}

