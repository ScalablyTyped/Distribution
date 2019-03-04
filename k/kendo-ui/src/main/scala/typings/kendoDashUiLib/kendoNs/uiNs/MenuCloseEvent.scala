package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuCloseEvent extends MenuEvent {
  var item: js.UndefOr[kendoDashUiLib.HTMLElement] = js.undefined
}

object MenuCloseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Menu,
    item: kendoDashUiLib.HTMLElement = null
  ): MenuCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[MenuCloseEvent]
  }
}

