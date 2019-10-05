package typings.jquerymobile

import typings.std.Event
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
    popupafterclose: (/* event */ Event, /* ui */ js.Any) => Unit = null,
    popupafteropen: (/* event */ Event, /* ui */ js.Any) => Unit = null,
    popupbeforeposition: (/* event */ Event, /* ui */ js.Any) => Unit = null
  ): PopupEvents = {
    val __obj = js.Dynamic.literal()
    if (popupafterclose != null) __obj.updateDynamic("popupafterclose")(js.Any.fromFunction2(popupafterclose))
    if (popupafteropen != null) __obj.updateDynamic("popupafteropen")(js.Any.fromFunction2(popupafteropen))
    if (popupbeforeposition != null) __obj.updateDynamic("popupbeforeposition")(js.Any.fromFunction2(popupbeforeposition))
    __obj.asInstanceOf[PopupEvents]
  }
}

