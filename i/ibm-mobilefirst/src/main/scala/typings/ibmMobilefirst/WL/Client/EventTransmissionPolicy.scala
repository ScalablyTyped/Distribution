package typings.ibmMobilefirst.WL.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTransmissionPolicy extends js.Object {
  var eventStorageEnabled: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
}

object EventTransmissionPolicy {
  @scala.inline
  def apply(
    eventStorageEnabled: js.UndefOr[Boolean] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined
  ): EventTransmissionPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(eventStorageEnabled)) __obj.updateDynamic("eventStorageEnabled")(eventStorageEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTransmissionPolicy]
  }
}

