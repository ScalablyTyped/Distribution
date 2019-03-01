package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageBatchPayload extends MessagePayloadBase {
  var topicMessages: js.Array[ProducerTopicMessage]
}

object MessageBatchPayload {
  @scala.inline
  def apply(
    topicMessages: js.Array[ProducerTopicMessage],
    acks: AcksBehaviour = null,
    compression: CompressionTypes = null,
    timeout: scala.Int | scala.Double = null
  ): MessageBatchPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("topicMessages")(topicMessages)
    if (acks != null) __obj.updateDynamic("acks")(acks)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBatchPayload]
  }
}

