package typings.kendoUi.kendo.ui

import typings.kendoUi.JQueryEventObject
import typings.kendoUi.kendo.mobile.ui.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchGesturechangeEvent extends TouchEvent {
  var center: js.UndefOr[Point] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var event: js.UndefOr[JQueryEventObject] = js.undefined
  var touches: js.UndefOr[js.Any] = js.undefined
}

object TouchGesturechangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Touch,
    center: Point = null,
    distance: js.UndefOr[Double] = js.undefined,
    event: JQueryEventObject = null,
    touches: js.Any = null
  ): TouchGesturechangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (touches != null) __obj.updateDynamic("touches")(touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchGesturechangeEvent]
  }
}

