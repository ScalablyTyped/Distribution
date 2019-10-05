package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchOptions extends js.Object {
  var doubleTapTimeout: js.UndefOr[Double] = js.undefined
  var doubletap: js.UndefOr[js.Function1[/* e */ TouchDoubletapEvent, Unit]] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ TouchDragEvent, Unit]] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ TouchDragendEvent, Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ TouchDragstartEvent, Unit]] = js.undefined
  var enableSwipe: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var gesturechange: js.UndefOr[js.Function1[/* e */ TouchGesturechangeEvent, Unit]] = js.undefined
  var gestureend: js.UndefOr[js.Function1[/* e */ TouchGestureendEvent, Unit]] = js.undefined
  var gesturestart: js.UndefOr[js.Function1[/* e */ TouchGesturestartEvent, Unit]] = js.undefined
  var hold: js.UndefOr[js.Function1[/* e */ TouchHoldEvent, Unit]] = js.undefined
  var maxDuration: js.UndefOr[Double] = js.undefined
  var maxYDelta: js.UndefOr[Double] = js.undefined
  var minHold: js.UndefOr[Double] = js.undefined
  var minXDelta: js.UndefOr[Double] = js.undefined
  var multiTouch: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var surface: js.UndefOr[JQuery] = js.undefined
  var swipe: js.UndefOr[js.Function1[/* e */ TouchSwipeEvent, Unit]] = js.undefined
  var tap: js.UndefOr[js.Function1[/* e */ TouchTapEvent, Unit]] = js.undefined
  var touchstart: js.UndefOr[js.Function1[/* e */ TouchTouchstartEvent, Unit]] = js.undefined
}

object TouchOptions {
  @scala.inline
  def apply(
    doubleTapTimeout: Int | Double = null,
    doubletap: /* e */ TouchDoubletapEvent => Unit = null,
    drag: /* e */ TouchDragEvent => Unit = null,
    dragend: /* e */ TouchDragendEvent => Unit = null,
    dragstart: /* e */ TouchDragstartEvent => Unit = null,
    enableSwipe: js.UndefOr[Boolean] = js.undefined,
    filter: String = null,
    gesturechange: /* e */ TouchGesturechangeEvent => Unit = null,
    gestureend: /* e */ TouchGestureendEvent => Unit = null,
    gesturestart: /* e */ TouchGesturestartEvent => Unit = null,
    hold: /* e */ TouchHoldEvent => Unit = null,
    maxDuration: Int | Double = null,
    maxYDelta: Int | Double = null,
    minHold: Int | Double = null,
    minXDelta: Int | Double = null,
    multiTouch: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    surface: JQuery = null,
    swipe: /* e */ TouchSwipeEvent => Unit = null,
    tap: /* e */ TouchTapEvent => Unit = null,
    touchstart: /* e */ TouchTouchstartEvent => Unit = null
  ): TouchOptions = {
    val __obj = js.Dynamic.literal()
    if (doubleTapTimeout != null) __obj.updateDynamic("doubleTapTimeout")(doubleTapTimeout.asInstanceOf[js.Any])
    if (doubletap != null) __obj.updateDynamic("doubletap")(js.Any.fromFunction1(doubletap))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1(dragend))
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1(dragstart))
    if (!js.isUndefined(enableSwipe)) __obj.updateDynamic("enableSwipe")(enableSwipe)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (gesturechange != null) __obj.updateDynamic("gesturechange")(js.Any.fromFunction1(gesturechange))
    if (gestureend != null) __obj.updateDynamic("gestureend")(js.Any.fromFunction1(gestureend))
    if (gesturestart != null) __obj.updateDynamic("gesturestart")(js.Any.fromFunction1(gesturestart))
    if (hold != null) __obj.updateDynamic("hold")(js.Any.fromFunction1(hold))
    if (maxDuration != null) __obj.updateDynamic("maxDuration")(maxDuration.asInstanceOf[js.Any])
    if (maxYDelta != null) __obj.updateDynamic("maxYDelta")(maxYDelta.asInstanceOf[js.Any])
    if (minHold != null) __obj.updateDynamic("minHold")(minHold.asInstanceOf[js.Any])
    if (minXDelta != null) __obj.updateDynamic("minXDelta")(minXDelta.asInstanceOf[js.Any])
    if (!js.isUndefined(multiTouch)) __obj.updateDynamic("multiTouch")(multiTouch)
    if (name != null) __obj.updateDynamic("name")(name)
    if (surface != null) __obj.updateDynamic("surface")(surface)
    if (swipe != null) __obj.updateDynamic("swipe")(js.Any.fromFunction1(swipe))
    if (tap != null) __obj.updateDynamic("tap")(js.Any.fromFunction1(tap))
    if (touchstart != null) __obj.updateDynamic("touchstart")(js.Any.fromFunction1(touchstart))
    __obj.asInstanceOf[TouchOptions]
  }
}

