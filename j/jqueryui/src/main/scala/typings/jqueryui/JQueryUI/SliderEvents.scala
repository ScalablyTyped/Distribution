package typings.jqueryui.JQueryUI

import typings.jquery.JQuery.Event
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
    change: (/* event */ Event, /* ui */ SliderUIParams) => Unit = null,
    create: (/* event */ Event, /* ui */ SliderUIParams) => Unit = null,
    slide: (/* event */ Event, /* ui */ SliderUIParams) => Unit = null,
    start: (/* event */ Event, /* ui */ SliderUIParams) => Unit = null,
    stop: (/* event */ Event, /* ui */ SliderUIParams) => Unit = null
  ): SliderEvents = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction2(slide))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    __obj.asInstanceOf[SliderEvents]
  }
}

