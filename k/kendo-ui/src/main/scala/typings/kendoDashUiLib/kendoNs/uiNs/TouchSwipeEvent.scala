package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchSwipeEvent extends TouchEvent {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var event: js.UndefOr[kendoDashUiLib.JQueryEventObject] = js.undefined
  var touch: js.UndefOr[kendoDashUiLib.kendoNs.mobileNs.uiNs.TouchEventOptions] = js.undefined
}

object TouchSwipeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Touch,
    direction: java.lang.String = null,
    event: kendoDashUiLib.JQueryEventObject = null,
    touch: kendoDashUiLib.kendoNs.mobileNs.uiNs.TouchEventOptions = null
  ): TouchSwipeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (event != null) __obj.updateDynamic("event")(event)
    if (touch != null) __obj.updateDynamic("touch")(touch)
    __obj.asInstanceOf[TouchSwipeEvent]
  }
}

