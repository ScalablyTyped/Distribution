package typings.jqueryui.JQueryUINs

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressbarEvents extends js.Object {
  var change: js.UndefOr[ProgressbarEvent] = js.undefined
  var complete: js.UndefOr[ProgressbarEvent] = js.undefined
  var create: js.UndefOr[ProgressbarEvent] = js.undefined
}

object ProgressbarEvents {
  @scala.inline
  def apply(
    change: (/* event */ Event, /* ui */ ProgressbarUIParams) => Unit = null,
    complete: (/* event */ Event, /* ui */ ProgressbarUIParams) => Unit = null,
    create: (/* event */ Event, /* ui */ ProgressbarUIParams) => Unit = null
  ): ProgressbarEvents = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction2(complete))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    __obj.asInstanceOf[ProgressbarEvents]
  }
}

