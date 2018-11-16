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

