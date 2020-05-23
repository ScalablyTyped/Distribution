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
    ackTimeoutMs: js.UndefOr[Double] = js.undefined,
    partitionerType: js.UndefOr[Double] = js.undefined,
    requireAcks: js.UndefOr[Double] = js.undefined
  ): ProducerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ackTimeoutMs)) __obj.updateDynamic("ackTimeoutMs")(ackTimeoutMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partitionerType)) __obj.updateDynamic("partitionerType")(partitionerType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requireAcks)) __obj.updateDynamic("requireAcks")(requireAcks.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerOptions]
  }
}

