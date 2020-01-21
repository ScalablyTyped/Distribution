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
  def apply(eventStorageEnabled: js.UndefOr[Boolean] = js.undefined, interval: Int | Double = null): EventTransmissionPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(eventStorageEnabled)) __obj.updateDynamic("eventStorageEnabled")(eventStorageEnabled.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTransmissionPolicy]
  }
}

