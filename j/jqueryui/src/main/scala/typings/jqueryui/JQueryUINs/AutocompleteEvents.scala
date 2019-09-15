package typings.jqueryui.JQueryUINs

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteEvents extends js.Object {
  var change: js.UndefOr[AutocompleteEvent] = js.undefined
  var close: js.UndefOr[AutocompleteEvent] = js.undefined
  var create: js.UndefOr[AutocompleteEvent] = js.undefined
  var focus: js.UndefOr[AutocompleteEvent] = js.undefined
  var open: js.UndefOr[AutocompleteEvent] = js.undefined
  var response: js.UndefOr[AutocompleteEvent] = js.undefined
  var search: js.UndefOr[AutocompleteEvent] = js.undefined
  var select: js.UndefOr[AutocompleteEvent] = js.undefined
}

object AutocompleteEvents {
  @scala.inline
  def apply(
    change: (/* event */ Event, /* ui */ AutocompleteUIParams) => Unit = null,
    close: (/* event */ Event, /* ui */ AutocompleteUIParams) => Unit = null,
    create: (/* event */ Event, /* ui */ AutocompleteUIParams) => Unit = null,
    focus: (/* event */ Event, /* ui */ AutocompleteUIParams) => Unit = null,
    open: (/* event */ Event, /* ui */ AutocompleteUIParams) => Unit = null,
    response: (/* event */ Event, /* ui */ AutocompleteUIParams) => Unit = null,
    search: (/* event */ Event, /* ui */ AutocompleteUIParams) => Unit = null,
    select: (/* event */ Event, /* ui */ AutocompleteUIParams) => Unit = null
  ): AutocompleteEvents = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2(close))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2(focus))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2(open))
    if (response != null) __obj.updateDynamic("response")(js.Any.fromFunction2(response))
    if (search != null) __obj.updateDynamic("search")(js.Any.fromFunction2(search))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2(select))
    __obj.asInstanceOf[AutocompleteEvents]
  }
}

