package typings.jquerymobile

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderEvents extends js.Object {
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
  var slidestart: js.UndefOr[JQueryMobileEvent] = js.undefined
  var slidestop: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object SliderEvents {
  @scala.inline
  def apply(
    create: (/* event */ Event_, /* ui */ js.Any) => Unit = null,
    slidestart: (/* event */ Event_, /* ui */ js.Any) => Unit = null,
    slidestop: (/* event */ Event_, /* ui */ js.Any) => Unit = null
  ): SliderEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (slidestart != null) __obj.updateDynamic("slidestart")(js.Any.fromFunction2(slidestart))
    if (slidestop != null) __obj.updateDynamic("slidestop")(js.Any.fromFunction2(slidestop))
    __obj.asInstanceOf[SliderEvents]
  }
}

