package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewEvents extends js.Object {
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object ListViewEvents {
  @scala.inline
  def apply(create: JQueryMobileEvent = null): ListViewEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[ListViewEvents]
  }
}

