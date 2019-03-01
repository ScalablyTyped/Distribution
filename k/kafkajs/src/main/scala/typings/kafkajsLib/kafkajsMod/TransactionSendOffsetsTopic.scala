package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionSendOffsetsTopic extends js.Object {
  var partitions: js.Array[TransactionSendOffsetsTopicPartitions]
  var topic: java.lang.String
}

object TransactionSendOffsetsTopic {
  @scala.inline
  def apply(partitions: js.Array[TransactionSendOffsetsTopicPartitions], topic: java.lang.String): TransactionSendOffsetsTopic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("partitions")(partitions)
    __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[TransactionSendOffsetsTopic]
  }
}

