package typings.jqueryui.JQueryUI

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectMenuEvents extends js.Object {
  var change: js.UndefOr[SelectMenuEvent] = js.undefined
  var close: js.UndefOr[SelectMenuEvent] = js.undefined
  var create: js.UndefOr[SelectMenuEvent] = js.undefined
  var focus: js.UndefOr[SelectMenuEvent] = js.undefined
  var open: js.UndefOr[SelectMenuEvent] = js.undefined
  var select: js.UndefOr[SelectMenuEvent] = js.undefined
}

object SelectMenuEvents {
  @scala.inline
  def apply(
    change: (/* event */ Event, /* ui */ SelectMenuUIParams) => Unit = null,
    close: (/* event */ Event, /* ui */ SelectMenuUIParams) => Unit = null,
    create: (/* event */ Event, /* ui */ SelectMenuUIParams) => Unit = null,
    focus: (/* event */ Event, /* ui */ SelectMenuUIParams) => Unit = null,
    open: (/* event */ Event, /* ui */ SelectMenuUIParams) => Unit = null,
    select: (/* event */ Event, /* ui */ SelectMenuUIParams) => Unit = null
  ): SelectMenuEvents = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2(close))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2(focus))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2(open))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2(select))
    __obj.asInstanceOf[SelectMenuEvents]
  }
}

