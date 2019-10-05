package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQueryEventObject
import typings.kendoDashUi.kendo.mobile.ui.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchGesturestartEvent extends TouchEvent {
  var center: js.UndefOr[Point] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var event: js.UndefOr[JQueryEventObject] = js.undefined
  var touches: js.UndefOr[js.Any] = js.undefined
}

object TouchGesturestartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Touch,
    center: Point = null,
    distance: Int | Double = null,
    event: JQueryEventObject = null,
    touches: js.Any = null
  ): TouchGesturestartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (center != null) __obj.updateDynamic("center")(center)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    if (touches != null) __obj.updateDynamic("touches")(touches)
    __obj.asInstanceOf[TouchGesturestartEvent]
  }
}

