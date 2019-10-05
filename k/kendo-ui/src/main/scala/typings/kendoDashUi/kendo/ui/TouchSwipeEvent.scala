package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQueryEventObject
import typings.kendoDashUi.kendo.mobile.ui.TouchEventOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchSwipeEvent extends TouchEvent {
  var direction: js.UndefOr[String] = js.undefined
  var event: js.UndefOr[JQueryEventObject] = js.undefined
  var touch: js.UndefOr[TouchEventOptions] = js.undefined
}

object TouchSwipeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Touch,
    direction: String = null,
    event: JQueryEventObject = null,
    touch: TouchEventOptions = null
  ): TouchSwipeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (event != null) __obj.updateDynamic("event")(event)
    if (touch != null) __obj.updateDynamic("touch")(touch)
    __obj.asInstanceOf[TouchSwipeEvent]
  }
}

