package typings.jquerymobile

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
    create: JQueryMobileEvent = null,
    slidestart: JQueryMobileEvent = null,
    slidestop: JQueryMobileEvent = null
  ): SliderEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    if (slidestart != null) __obj.updateDynamic("slidestart")(slidestart)
    if (slidestop != null) __obj.updateDynamic("slidestop")(slidestop)
    __obj.asInstanceOf[SliderEvents]
  }
}

