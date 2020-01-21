package typings.jquerymobile

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleSetEvents extends js.Object {
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object CollapsibleSetEvents {
  @scala.inline
  def apply(create: (/* event */ Event_, /* ui */ js.Any) => Unit = null): CollapsibleSetEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    __obj.asInstanceOf[CollapsibleSetEvents]
  }
}

