package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerEachMessagePayload extends js.Object {
  var message: ConsumerMessage
  var partition: scala.Double
  var topic: java.lang.String
}

object ConsumerEachMessagePayload {
  @scala.inline
  def apply(message: ConsumerMessage, partition: scala.Double, topic: java.lang.String): ConsumerEachMessagePayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("partition")(partition)
    __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[ConsumerEachMessagePayload]
  }
}

