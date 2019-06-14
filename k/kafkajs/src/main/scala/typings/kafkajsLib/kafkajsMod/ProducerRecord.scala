package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerRecord extends js.Object {
  var acks: js.UndefOr[scala.Double] = js.undefined
  var compression: js.UndefOr[CompressionTypes] = js.undefined
  var messages: js.Array[Message]
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var topic: java.lang.String
}

object ProducerRecord {
  @scala.inline
  def apply(
    messages: js.Array[Message],
    topic: java.lang.String,
    acks: scala.Int | scala.Double = null,
    compression: CompressionTypes = null,
    timeout: scala.Int | scala.Double = null
  ): ProducerRecord = {
    val __obj = js.Dynamic.literal(messages = messages, topic = topic)
    if (acks != null) __obj.updateDynamic("acks")(acks.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerRecord]
  }
}

