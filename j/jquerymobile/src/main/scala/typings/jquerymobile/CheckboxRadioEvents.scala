package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxRadioEvents extends js.Object {
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object CheckboxRadioEvents {
  @scala.inline
  def apply(create: JQueryMobileEvent = null): CheckboxRadioEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[CheckboxRadioEvents]
  }
}

