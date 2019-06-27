package typings
package atIonicCoreLib.distTypesUtilsGestureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureConfig extends js.Object {
  var canStart: js.UndefOr[GestureCallback] = js.undefined
  var direction: js.UndefOr[atIonicCoreLib.atIonicCoreLibStrings.x | atIonicCoreLib.atIonicCoreLibStrings.y] = js.undefined
  var disableScroll: js.UndefOr[scala.Boolean] = js.undefined
  var el: stdLib.Node
  var gestureName: java.lang.String
  var gesturePriority: js.UndefOr[scala.Double] = js.undefined
  var maxAngle: js.UndefOr[scala.Double] = js.undefined
  var notCaptured: js.UndefOr[GestureCallback] = js.undefined
  var onEnd: js.UndefOr[GestureCallback] = js.undefined
  var onMove: js.UndefOr[GestureCallback] = js.undefined
  var onStart: js.UndefOr[GestureCallback] = js.undefined
  var onWillStart: js.UndefOr[js.Function1[/* _ */ GestureDetail, js.Promise[scala.Unit]]] = js.undefined
  var passive: js.UndefOr[scala.Boolean] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object GestureConfig {
  @scala.inline
  def apply(
    el: stdLib.Node,
    gestureName: java.lang.String,
    canStart: GestureCallback = null,
    direction: atIonicCoreLib.atIonicCoreLibStrings.x | atIonicCoreLib.atIonicCoreLibStrings.y = null,
    disableScroll: js.UndefOr[scala.Boolean] = js.undefined,
    gesturePriority: scala.Int | scala.Double = null,
    maxAngle: scala.Int | scala.Double = null,
    notCaptured: GestureCallback = null,
    onEnd: GestureCallback = null,
    onMove: GestureCallback = null,
    onStart: GestureCallback = null,
    onWillStart: /* _ */ GestureDetail => js.Promise[scala.Unit] = null,
    passive: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null
  ): GestureConfig = {
    val __obj = js.Dynamic.literal(el = el, gestureName = gestureName)
    if (canStart != null) __obj.updateDynamic("canStart")(canStart)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll)
    if (gesturePriority != null) __obj.updateDynamic("gesturePriority")(gesturePriority.asInstanceOf[js.Any])
    if (maxAngle != null) __obj.updateDynamic("maxAngle")(maxAngle.asInstanceOf[js.Any])
    if (notCaptured != null) __obj.updateDynamic("notCaptured")(notCaptured)
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd)
    if (onMove != null) __obj.updateDynamic("onMove")(onMove)
    if (onStart != null) __obj.updateDynamic("onStart")(onStart)
    if (onWillStart != null) __obj.updateDynamic("onWillStart")(js.Any.fromFunction1(onWillStart))
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureConfig]
  }
}

