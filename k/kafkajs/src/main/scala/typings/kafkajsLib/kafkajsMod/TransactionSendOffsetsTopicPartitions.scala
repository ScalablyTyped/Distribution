package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionSendOffsetsTopicPartitions extends js.Object {
  var offset: java.lang.String
  var partition: scala.Double
}

object TransactionSendOffsetsTopicPartitions {
  @scala.inline
  def apply(offset: java.lang.String, partition: scala.Double): TransactionSendOffsetsTopicPartitions = {
    val __obj = js.Dynamic.literal(offset = offset, partition = partition)
  
    __obj.asInstanceOf[TransactionSendOffsetsTopicPartitions]
  }
}

