package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQueryEventObject
import typings.kendoDashUi.kendoNs.mobileNs.uiNs.TouchEventOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchDragendEvent extends TouchEvent {
  var event: js.UndefOr[JQueryEventObject] = js.undefined
  var touch: js.UndefOr[TouchEventOptions] = js.undefined
}

object TouchDragendEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Touch,
    event: JQueryEventObject = null,
    touch: TouchEventOptions = null
  ): TouchDragendEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (event != null) __obj.updateDynamic("event")(event)
    if (touch != null) __obj.updateDynamic("touch")(touch)
    __obj.asInstanceOf[TouchDragendEvent]
  }
}

