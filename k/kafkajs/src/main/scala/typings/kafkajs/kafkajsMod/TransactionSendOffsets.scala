package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionSendOffsets extends js.Object {
  var consumerGroupId: String
  var topics: js.Array[TransactionSendOffsetsTopic]
}

object TransactionSendOffsets {
  @scala.inline
  def apply(consumerGroupId: String, topics: js.Array[TransactionSendOffsetsTopic]): TransactionSendOffsets = {
    val __obj = js.Dynamic.literal(consumerGroupId = consumerGroupId, topics = topics)
  
    __obj.asInstanceOf[TransactionSendOffsets]
  }
}

