package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionSendOffsetsTopicPartitions extends js.Object {
  var offset: String
  var partition: Double
}

object TransactionSendOffsetsTopicPartitions {
  @scala.inline
  def apply(offset: String, partition: Double): TransactionSendOffsetsTopicPartitions = {
    val __obj = js.Dynamic.literal(offset = offset, partition = partition)
  
    __obj.asInstanceOf[TransactionSendOffsetsTopicPartitions]
  }
}

