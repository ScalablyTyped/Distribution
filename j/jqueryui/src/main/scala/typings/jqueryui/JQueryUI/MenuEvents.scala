package typings.jqueryui.JQueryUI

import typings.jquery.JQuery.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuEvents extends js.Object {
  var blur: js.UndefOr[MenuEvent] = js.undefined
  var create: js.UndefOr[MenuEvent] = js.undefined
  var focus: js.UndefOr[MenuEvent] = js.undefined
  var select: js.UndefOr[MenuEvent] = js.undefined
}

object MenuEvents {
  @scala.inline
  def apply(
    blur: (/* event */ Event, /* ui */ MenuUIParams) => Unit = null,
    create: (/* event */ Event, /* ui */ MenuUIParams) => Unit = null,
    focus: (/* event */ Event, /* ui */ MenuUIParams) => Unit = null,
    select: (/* event */ Event, /* ui */ MenuUIParams) => Unit = null
  ): MenuEvents = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction2(blur))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2(focus))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2(select))
    __obj.asInstanceOf[MenuEvents]
  }
}

