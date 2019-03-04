package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchTapEvent extends TouchEvent {
  var event: js.UndefOr[kendoDashUiLib.JQueryEventObject] = js.undefined
  var touch: js.UndefOr[kendoDashUiLib.kendoNs.mobileNs.uiNs.TouchEventOptions] = js.undefined
}

object TouchTapEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Touch,
    event: kendoDashUiLib.JQueryEventObject = null,
    touch: kendoDashUiLib.kendoNs.mobileNs.uiNs.TouchEventOptions = null
  ): TouchTapEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (event != null) __obj.updateDynamic("event")(event)
    if (touch != null) __obj.updateDynamic("touch")(touch)
    __obj.asInstanceOf[TouchTapEvent]
  }
}

