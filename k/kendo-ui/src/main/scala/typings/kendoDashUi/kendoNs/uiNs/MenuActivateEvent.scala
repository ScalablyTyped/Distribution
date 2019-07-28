package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuActivateEvent extends MenuEvent {
  var item: js.UndefOr[HTMLElement] = js.undefined
}

object MenuActivateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Menu,
    item: HTMLElement = null
  ): MenuActivateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[MenuActivateEvent]
  }
}

