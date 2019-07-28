package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupEvents extends js.Object {
  var popupafterclose: js.UndefOr[JQueryMobileEvent] = js.undefined
  var popupafteropen: js.UndefOr[JQueryMobileEvent] = js.undefined
  var popupbeforeposition: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object PopupEvents {
  @scala.inline
  def apply(
    popupafterclose: JQueryMobileEvent = null,
    popupafteropen: JQueryMobileEvent = null,
    popupbeforeposition: JQueryMobileEvent = null
  ): PopupEvents = {
    val __obj = js.Dynamic.literal()
    if (popupafterclose != null) __obj.updateDynamic("popupafterclose")(popupafterclose)
    if (popupafteropen != null) __obj.updateDynamic("popupafteropen")(popupafteropen)
    if (popupbeforeposition != null) __obj.updateDynamic("popupbeforeposition")(popupbeforeposition)
    __obj.asInstanceOf[PopupEvents]
  }
}

