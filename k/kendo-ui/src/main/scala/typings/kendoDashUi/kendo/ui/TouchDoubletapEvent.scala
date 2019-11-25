package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQueryEventObject
import typings.kendoDashUi.kendo.mobile.ui.TouchEventOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchDoubletapEvent extends TouchEvent {
  var event: js.UndefOr[JQueryEventObject] = js.undefined
  var touch: js.UndefOr[TouchEventOptions] = js.undefined
}

object TouchDoubletapEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Touch,
    event: JQueryEventObject = null,
    touch: TouchEventOptions = null
  ): TouchDoubletapEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchDoubletapEvent]
  }
}

