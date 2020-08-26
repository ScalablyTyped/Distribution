package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchOptions extends js.Object {
  var doubleTapTimeout: js.UndefOr[Double] = js.native
  var doubletap: js.UndefOr[js.Function1[/* e */ TouchDoubletapEvent, Unit]] = js.native
  var drag: js.UndefOr[js.Function1[/* e */ TouchDragEvent, Unit]] = js.native
  var dragend: js.UndefOr[js.Function1[/* e */ TouchDragendEvent, Unit]] = js.native
  var dragstart: js.UndefOr[js.Function1[/* e */ TouchDragstartEvent, Unit]] = js.native
  var enableSwipe: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[String] = js.native
  var gesturechange: js.UndefOr[js.Function1[/* e */ TouchGesturechangeEvent, Unit]] = js.native
  var gestureend: js.UndefOr[js.Function1[/* e */ TouchGestureendEvent, Unit]] = js.native
  var gesturestart: js.UndefOr[js.Function1[/* e */ TouchGesturestartEvent, Unit]] = js.native
  var hold: js.UndefOr[js.Function1[/* e */ TouchHoldEvent, Unit]] = js.native
  var maxDuration: js.UndefOr[Double] = js.native
  var maxYDelta: js.UndefOr[Double] = js.native
  var minHold: js.UndefOr[Double] = js.native
  var minXDelta: js.UndefOr[Double] = js.native
  var multiTouch: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var surface: js.UndefOr[JQuery] = js.native
  var swipe: js.UndefOr[js.Function1[/* e */ TouchSwipeEvent, Unit]] = js.native
  var tap: js.UndefOr[js.Function1[/* e */ TouchTapEvent, Unit]] = js.native
  var touchstart: js.UndefOr[js.Function1[/* e */ TouchTouchstartEvent, Unit]] = js.native
}

object TouchOptions {
  @scala.inline
  def apply(): TouchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchOptions]
  }
  @scala.inline
  implicit class TouchOptionsOps[Self <: TouchOptions] (val x: Self) extends AnyVal {
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
    def setDoubleTapTimeout(value: Double): Self = this.set("doubleTapTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleTapTimeout: Self = this.set("doubleTapTimeout", js.undefined)
    @scala.inline
    def setDoubletap(value: /* e */ TouchDoubletapEvent => Unit): Self = this.set("doubletap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDoubletap: Self = this.set("doubletap", js.undefined)
    @scala.inline
    def setDrag(value: /* e */ TouchDragEvent => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setDragend(value: /* e */ TouchDragendEvent => Unit): Self = this.set("dragend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragend: Self = this.set("dragend", js.undefined)
    @scala.inline
    def setDragstart(value: /* e */ TouchDragstartEvent => Unit): Self = this.set("dragstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragstart: Self = this.set("dragstart", js.undefined)
    @scala.inline
    def setEnableSwipe(value: Boolean): Self = this.set("enableSwipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSwipe: Self = this.set("enableSwipe", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setGesturechange(value: /* e */ TouchGesturechangeEvent => Unit): Self = this.set("gesturechange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGesturechange: Self = this.set("gesturechange", js.undefined)
    @scala.inline
    def setGestureend(value: /* e */ TouchGestureendEvent => Unit): Self = this.set("gestureend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGestureend: Self = this.set("gestureend", js.undefined)
    @scala.inline
    def setGesturestart(value: /* e */ TouchGesturestartEvent => Unit): Self = this.set("gesturestart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGesturestart: Self = this.set("gesturestart", js.undefined)
    @scala.inline
    def setHold(value: /* e */ TouchHoldEvent => Unit): Self = this.set("hold", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHold: Self = this.set("hold", js.undefined)
    @scala.inline
    def setMaxDuration(value: Double): Self = this.set("maxDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDuration: Self = this.set("maxDuration", js.undefined)
    @scala.inline
    def setMaxYDelta(value: Double): Self = this.set("maxYDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxYDelta: Self = this.set("maxYDelta", js.undefined)
    @scala.inline
    def setMinHold(value: Double): Self = this.set("minHold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHold: Self = this.set("minHold", js.undefined)
    @scala.inline
    def setMinXDelta(value: Double): Self = this.set("minXDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinXDelta: Self = this.set("minXDelta", js.undefined)
    @scala.inline
    def setMultiTouch(value: Boolean): Self = this.set("multiTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiTouch: Self = this.set("multiTouch", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSurface(value: JQuery): Self = this.set("surface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurface: Self = this.set("surface", js.undefined)
    @scala.inline
    def setSwipe(value: /* e */ TouchSwipeEvent => Unit): Self = this.set("swipe", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSwipe: Self = this.set("swipe", js.undefined)
    @scala.inline
    def setTap(value: /* e */ TouchTapEvent => Unit): Self = this.set("tap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTap: Self = this.set("tap", js.undefined)
    @scala.inline
    def setTouchstart(value: /* e */ TouchTouchstartEvent => Unit): Self = this.set("touchstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTouchstart: Self = this.set("touchstart", js.undefined)
  }
  
}

