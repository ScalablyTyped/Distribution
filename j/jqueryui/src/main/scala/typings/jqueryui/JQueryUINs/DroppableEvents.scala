package typings.jqueryui.JQueryUINs

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableEvents extends js.Object {
  var activate: js.UndefOr[DroppableEvent] = js.undefined
  var create: js.UndefOr[DroppableEvent] = js.undefined
  var deactivate: js.UndefOr[DroppableEvent] = js.undefined
  var drop: js.UndefOr[DroppableEvent] = js.undefined
  var out: js.UndefOr[DroppableEvent] = js.undefined
  var over: js.UndefOr[DroppableEvent] = js.undefined
}

object DroppableEvents {
  @scala.inline
  def apply(
    activate: (/* event */ Event, /* ui */ DroppableEventUIParam) => Unit = null,
    create: (/* event */ Event, /* ui */ DroppableEventUIParam) => Unit = null,
    deactivate: (/* event */ Event, /* ui */ DroppableEventUIParam) => Unit = null,
    drop: (/* event */ Event, /* ui */ DroppableEventUIParam) => Unit = null,
    out: (/* event */ Event, /* ui */ DroppableEventUIParam) => Unit = null,
    over: (/* event */ Event, /* ui */ DroppableEventUIParam) => Unit = null
  ): DroppableEvents = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2(activate))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction2(deactivate))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction2(drop))
    if (out != null) __obj.updateDynamic("out")(js.Any.fromFunction2(out))
    if (over != null) __obj.updateDynamic("over")(js.Any.fromFunction2(over))
    __obj.asInstanceOf[DroppableEvents]
  }
}

