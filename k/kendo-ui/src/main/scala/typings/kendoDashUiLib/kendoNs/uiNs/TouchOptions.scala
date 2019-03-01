package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchOptions extends js.Object {
  var doubleTapTimeout: js.UndefOr[scala.Double] = js.undefined
  var doubletap: js.UndefOr[js.Function1[/* e */ TouchDoubletapEvent, scala.Unit]] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ TouchDragEvent, scala.Unit]] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ TouchDragendEvent, scala.Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ TouchDragstartEvent, scala.Unit]] = js.undefined
  var enableSwipe: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var gesturechange: js.UndefOr[js.Function1[/* e */ TouchGesturechangeEvent, scala.Unit]] = js.undefined
  var gestureend: js.UndefOr[js.Function1[/* e */ TouchGestureendEvent, scala.Unit]] = js.undefined
  var gesturestart: js.UndefOr[js.Function1[/* e */ TouchGesturestartEvent, scala.Unit]] = js.undefined
  var hold: js.UndefOr[js.Function1[/* e */ TouchHoldEvent, scala.Unit]] = js.undefined
  var maxDuration: js.UndefOr[scala.Double] = js.undefined
  var maxYDelta: js.UndefOr[scala.Double] = js.undefined
  var minHold: js.UndefOr[scala.Double] = js.undefined
  var minXDelta: js.UndefOr[scala.Double] = js.undefined
  var multiTouch: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var surface: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var swipe: js.UndefOr[js.Function1[/* e */ TouchSwipeEvent, scala.Unit]] = js.undefined
  var tap: js.UndefOr[js.Function1[/* e */ TouchTapEvent, scala.Unit]] = js.undefined
  var touchstart: js.UndefOr[js.Function1[/* e */ TouchTouchstartEvent, scala.Unit]] = js.undefined
}

object TouchOptions {
  @scala.inline
  def apply(
    doubleTapTimeout: scala.Int | scala.Double = null,
    doubletap: js.Function1[/* e */ TouchDoubletapEvent, scala.Unit] = null,
    drag: js.Function1[/* e */ TouchDragEvent, scala.Unit] = null,
    dragend: js.Function1[/* e */ TouchDragendEvent, scala.Unit] = null,
    dragstart: js.Function1[/* e */ TouchDragstartEvent, scala.Unit] = null,
    enableSwipe: js.UndefOr[scala.Boolean] = js.undefined,
    filter: java.lang.String = null,
    gesturechange: js.Function1[/* e */ TouchGesturechangeEvent, scala.Unit] = null,
    gestureend: js.Function1[/* e */ TouchGestureendEvent, scala.Unit] = null,
    gesturestart: js.Function1[/* e */ TouchGesturestartEvent, scala.Unit] = null,
    hold: js.Function1[/* e */ TouchHoldEvent, scala.Unit] = null,
    maxDuration: scala.Int | scala.Double = null,
    maxYDelta: scala.Int | scala.Double = null,
    minHold: scala.Int | scala.Double = null,
    minXDelta: scala.Int | scala.Double = null,
    multiTouch: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    surface: kendoDashUiLib.JQuery = null,
    swipe: js.Function1[/* e */ TouchSwipeEvent, scala.Unit] = null,
    tap: js.Function1[/* e */ TouchTapEvent, scala.Unit] = null,
    touchstart: js.Function1[/* e */ TouchTouchstartEvent, scala.Unit] = null
  ): TouchOptions = {
    val __obj = js.Dynamic.literal()
    if (doubleTapTimeout != null) __obj.updateDynamic("doubleTapTimeout")(doubleTapTimeout.asInstanceOf[js.Any])
    if (doubletap != null) __obj.updateDynamic("doubletap")(doubletap)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragend != null) __obj.updateDynamic("dragend")(dragend)
    if (dragstart != null) __obj.updateDynamic("dragstart")(dragstart)
    if (!js.isUndefined(enableSwipe)) __obj.updateDynamic("enableSwipe")(enableSwipe)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (gesturechange != null) __obj.updateDynamic("gesturechange")(gesturechange)
    if (gestureend != null) __obj.updateDynamic("gestureend")(gestureend)
    if (gesturestart != null) __obj.updateDynamic("gesturestart")(gesturestart)
    if (hold != null) __obj.updateDynamic("hold")(hold)
    if (maxDuration != null) __obj.updateDynamic("maxDuration")(maxDuration.asInstanceOf[js.Any])
    if (maxYDelta != null) __obj.updateDynamic("maxYDelta")(maxYDelta.asInstanceOf[js.Any])
    if (minHold != null) __obj.updateDynamic("minHold")(minHold.asInstanceOf[js.Any])
    if (minXDelta != null) __obj.updateDynamic("minXDelta")(minXDelta.asInstanceOf[js.Any])
    if (!js.isUndefined(multiTouch)) __obj.updateDynamic("multiTouch")(multiTouch)
    if (name != null) __obj.updateDynamic("name")(name)
    if (surface != null) __obj.updateDynamic("surface")(surface)
    if (swipe != null) __obj.updateDynamic("swipe")(swipe)
    if (tap != null) __obj.updateDynamic("tap")(tap)
    if (touchstart != null) __obj.updateDynamic("touchstart")(touchstart)
    __obj.asInstanceOf[TouchOptions]
  }
}

