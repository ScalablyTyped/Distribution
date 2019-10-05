package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuOpenEvent extends MenuEvent {
  var item: js.UndefOr[HTMLElement] = js.undefined
}

object MenuOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Menu,
    item: HTMLElement = null
  ): MenuOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[MenuOpenEvent]
  }
}

