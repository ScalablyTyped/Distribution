package typings
package ibmDashMobilefirstLib.WLNs.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTransmissionPolicy extends js.Object {
  var eventStorageEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
}

object EventTransmissionPolicy {
  @scala.inline
  def apply(
    eventStorageEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    interval: scala.Int | scala.Double = null
  ): EventTransmissionPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(eventStorageEnabled)) __obj.updateDynamic("eventStorageEnabled")(eventStorageEnabled)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTransmissionPolicy]
  }
}

