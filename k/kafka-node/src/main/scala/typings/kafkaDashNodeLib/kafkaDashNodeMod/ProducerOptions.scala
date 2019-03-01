package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerOptions extends js.Object {
  var ackTimeoutMs: js.UndefOr[scala.Double] = js.undefined
  var partitionerType: js.UndefOr[scala.Double] = js.undefined
  var requireAcks: js.UndefOr[scala.Double] = js.undefined
}

object ProducerOptions {
  @scala.inline
  def apply(
    ackTimeoutMs: scala.Int | scala.Double = null,
    partitionerType: scala.Int | scala.Double = null,
    requireAcks: scala.Int | scala.Double = null
  ): ProducerOptions = {
    val __obj = js.Dynamic.literal()
    if (ackTimeoutMs != null) __obj.updateDynamic("ackTimeoutMs")(ackTimeoutMs.asInstanceOf[js.Any])
    if (partitionerType != null) __obj.updateDynamic("partitionerType")(partitionerType.asInstanceOf[js.Any])
    if (requireAcks != null) __obj.updateDynamic("requireAcks")(requireAcks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerOptions]
  }
}

