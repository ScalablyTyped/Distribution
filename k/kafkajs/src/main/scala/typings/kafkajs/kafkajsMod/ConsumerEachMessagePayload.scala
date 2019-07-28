package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerEachMessagePayload extends js.Object {
  var message: ConsumerMessage
  var partition: Double
  var topic: String
}

object ConsumerEachMessagePayload {
  @scala.inline
  def apply(message: ConsumerMessage, partition: Double, topic: String): ConsumerEachMessagePayload = {
    val __obj = js.Dynamic.literal(message = message, partition = partition, topic = topic)
  
    __obj.asInstanceOf[ConsumerEachMessagePayload]
  }
}

