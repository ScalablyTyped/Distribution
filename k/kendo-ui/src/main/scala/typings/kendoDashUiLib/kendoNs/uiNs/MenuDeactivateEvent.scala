package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuDeactivateEvent extends MenuEvent {
  var item: js.UndefOr[kendoDashUiLib.HTMLElement] = js.undefined
}

object MenuDeactivateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Menu,
    item: kendoDashUiLib.HTMLElement = null
  ): MenuDeactivateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[MenuDeactivateEvent]
  }
}

