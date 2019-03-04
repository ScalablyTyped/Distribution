package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePayload extends MessagePayloadBase {
  var idempotent: js.UndefOr[scala.Boolean] = js.undefined
  var messages: js.Array[ProducerMessage]
  var topic: java.lang.String
  var transactionTimeout: js.UndefOr[scala.Double] = js.undefined
}

object MessagePayload {
  @scala.inline
  def apply(
    messages: js.Array[ProducerMessage],
    topic: java.lang.String,
    acks: AcksBehaviour = null,
    compression: CompressionTypes = null,
    idempotent: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    transactionTimeout: scala.Int | scala.Double = null
  ): MessagePayload = {
    val __obj = js.Dynamic.literal(messages = messages, topic = topic)
    if (acks != null) __obj.updateDynamic("acks")(acks)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (!js.isUndefined(idempotent)) __obj.updateDynamic("idempotent")(idempotent)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transactionTimeout != null) __obj.updateDynamic("transactionTimeout")(transactionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePayload]
  }
}

