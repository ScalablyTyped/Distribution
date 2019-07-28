package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerBatch extends js.Object {
  var highWatermark: Double
  var messages: js.Array[ConsumerMessage]
  var partition: Double
  var topic: String
}

object ConsumerBatch {
  @scala.inline
  def apply(highWatermark: Double, messages: js.Array[ConsumerMessage], partition: Double, topic: String): ConsumerBatch = {
    val __obj = js.Dynamic.literal(highWatermark = highWatermark, messages = messages, partition = partition, topic = topic)
  
    __obj.asInstanceOf[ConsumerBatch]
  }
}

