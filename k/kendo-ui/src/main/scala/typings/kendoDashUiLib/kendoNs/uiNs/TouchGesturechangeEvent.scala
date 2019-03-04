package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchGesturechangeEvent extends TouchEvent {
  var center: js.UndefOr[kendoDashUiLib.kendoNs.mobileNs.uiNs.Point] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var event: js.UndefOr[kendoDashUiLib.JQueryEventObject] = js.undefined
  var touches: js.UndefOr[js.Any] = js.undefined
}

object TouchGesturechangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Touch,
    center: kendoDashUiLib.kendoNs.mobileNs.uiNs.Point = null,
    distance: scala.Int | scala.Double = null,
    event: kendoDashUiLib.JQueryEventObject = null,
    touches: js.Any = null
  ): TouchGesturechangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (center != null) __obj.updateDynamic("center")(center)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    if (touches != null) __obj.updateDynamic("touches")(touches)
    __obj.asInstanceOf[TouchGesturechangeEvent]
  }
}

