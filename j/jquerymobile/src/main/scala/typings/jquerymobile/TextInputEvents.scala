package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputEvents extends js.Object {
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object TextInputEvents {
  @scala.inline
  def apply(create: JQueryMobileEvent = null): TextInputEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[TextInputEvents]
  }
}

