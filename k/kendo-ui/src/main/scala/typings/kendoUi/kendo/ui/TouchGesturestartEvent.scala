package typings.kendoUi.kendo.ui

import typings.kendoUi.JQueryEventObject
import typings.kendoUi.kendo.mobile.ui.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchGesturestartEvent extends TouchEvent {
  var center: js.UndefOr[Point] = js.native
  var distance: js.UndefOr[Double] = js.native
  var event: js.UndefOr[JQueryEventObject] = js.native
  var touches: js.UndefOr[js.Any] = js.native
}

object TouchGesturestartEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Touch): TouchGesturestartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchGesturestartEvent]
  }
  @scala.inline
  implicit class TouchGesturestartEventOps[Self <: TouchGesturestartEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCenter(value: Point): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setEvent(value: JQueryEventObject): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setTouches(value: js.Any): Self = this.set("touches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouches: Self = this.set("touches", js.undefined)
  }
  
}

