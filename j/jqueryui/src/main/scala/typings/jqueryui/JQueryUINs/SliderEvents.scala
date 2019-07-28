package typings.jqueryui.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderEvents extends js.Object {
  var change: js.UndefOr[SliderEvent] = js.undefined
  var create: js.UndefOr[SliderEvent] = js.undefined
  var slide: js.UndefOr[SliderEvent] = js.undefined
  var start: js.UndefOr[SliderEvent] = js.undefined
  var stop: js.UndefOr[SliderEvent] = js.undefined
}

object SliderEvents {
  @scala.inline
  def apply(
    change: SliderEvent = null,
    create: SliderEvent = null,
    slide: SliderEvent = null,
    start: SliderEvent = null,
    stop: SliderEvent = null
  ): SliderEvents = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (create != null) __obj.updateDynamic("create")(create)
    if (slide != null) __obj.updateDynamic("slide")(slide)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[SliderEvents]
  }
}

