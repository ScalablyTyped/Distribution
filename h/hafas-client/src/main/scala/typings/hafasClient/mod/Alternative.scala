package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternative extends js.Object {
  var cancelled: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var line: js.UndefOr[Line] = js.undefined
  var loadFactor: js.UndefOr[String] = js.undefined
  var plannedPlatform: js.UndefOr[String] = js.undefined
  var plannedWhen: js.UndefOr[String] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var remarks: js.UndefOr[js.Array[Hint]] = js.undefined
  var stop: js.UndefOr[Station | Stop] = js.undefined
  var tripId: String
  var when: js.UndefOr[String] = js.undefined
}

object Alternative {
  @scala.inline
  def apply(
    tripId: String,
    cancelled: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    direction: String = null,
    line: Line = null,
    loadFactor: String = null,
    plannedPlatform: String = null,
    plannedWhen: String = null,
    platform: String = null,
    remarks: js.Array[Hint] = null,
    stop: Station | Stop = null,
    when: String = null
  ): Alternative = {
    val __obj = js.Dynamic.literal(tripId = tripId.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelled)) __obj.updateDynamic("cancelled")(cancelled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (loadFactor != null) __obj.updateDynamic("loadFactor")(loadFactor.asInstanceOf[js.Any])
    if (plannedPlatform != null) __obj.updateDynamic("plannedPlatform")(plannedPlatform.asInstanceOf[js.Any])
    if (plannedWhen != null) __obj.updateDynamic("plannedWhen")(plannedWhen.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (remarks != null) __obj.updateDynamic("remarks")(remarks.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alternative]
  }
}

