package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonEvents extends js.Object {
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object ButtonEvents {
  @scala.inline
  def apply(create: JQueryMobileEvent = null): ButtonEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[ButtonEvents]
  }
}

