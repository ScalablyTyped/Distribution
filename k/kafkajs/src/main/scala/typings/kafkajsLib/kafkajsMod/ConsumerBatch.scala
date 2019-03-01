package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerBatch extends js.Object {
  var highWatermark: scala.Double
  var messages: js.Array[ConsumerMessage]
  var partition: scala.Double
  var topic: java.lang.String
}

object ConsumerBatch {
  @scala.inline
  def apply(
    highWatermark: scala.Double,
    messages: js.Array[ConsumerMessage],
    partition: scala.Double,
    topic: java.lang.String
  ): ConsumerBatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("highWatermark")(highWatermark)
    __obj.updateDynamic("messages")(messages)
    __obj.updateDynamic("partition")(partition)
    __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[ConsumerBatch]
  }
}

