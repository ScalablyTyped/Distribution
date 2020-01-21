package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerOptions extends js.Object {
  var ackTimeoutMs: js.UndefOr[Double] = js.undefined
  var partitionerType: js.UndefOr[Double] = js.undefined
  var requireAcks: js.UndefOr[Double] = js.undefined
}

object ProducerOptions {
  @scala.inline
  def apply(
    ackTimeoutMs: Int | Double = null,
    partitionerType: Int | Double = null,
    requireAcks: Int | Double = null
  ): ProducerOptions = {
    val __obj = js.Dynamic.literal()
    if (ackTimeoutMs != null) __obj.updateDynamic("ackTimeoutMs")(ackTimeoutMs.asInstanceOf[js.Any])
    if (partitionerType != null) __obj.updateDynamic("partitionerType")(partitionerType.asInstanceOf[js.Any])
    if (requireAcks != null) __obj.updateDynamic("requireAcks")(requireAcks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerOptions]
  }
}

