package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionSendOffsets extends js.Object {
  var consumerGroupId: java.lang.String
  var topics: js.Array[TransactionSendOffsetsTopic]
}

object TransactionSendOffsets {
  @scala.inline
  def apply(consumerGroupId: java.lang.String, topics: js.Array[TransactionSendOffsetsTopic]): TransactionSendOffsets = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("consumerGroupId")(consumerGroupId)
    __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[TransactionSendOffsets]
  }
}

