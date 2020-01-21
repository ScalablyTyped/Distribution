package typings.jquerymobile

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleEvents extends js.Object {
  var collapse: js.UndefOr[JQueryMobileEvent] = js.undefined
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
  var expand: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object CollapsibleEvents {
  @scala.inline
  def apply(
    collapse: (/* event */ Event_, /* ui */ js.Any) => Unit = null,
    create: (/* event */ Event_, /* ui */ js.Any) => Unit = null,
    expand: (/* event */ Event_, /* ui */ js.Any) => Unit = null
  ): CollapsibleEvents = {
    val __obj = js.Dynamic.literal()
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction2(collapse))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction2(expand))
    __obj.asInstanceOf[CollapsibleEvents]
  }
}

