package typings.jquerymobile

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonEvents extends js.Object {
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object ButtonEvents {
  @scala.inline
  def apply(create: (/* event */ Event, /* ui */ js.Any) => Unit = null): ButtonEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    __obj.asInstanceOf[ButtonEvents]
  }
}

