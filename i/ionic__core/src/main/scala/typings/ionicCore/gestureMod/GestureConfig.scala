package typings.ionicCore.gestureMod

import typings.ionicCore.ionicCoreStrings.x
import typings.ionicCore.ionicCoreStrings.y
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureConfig extends js.Object {
  var blurOnStart: js.UndefOr[Boolean] = js.undefined
  var canStart: js.UndefOr[GestureCallback] = js.undefined
  var direction: js.UndefOr[x | y] = js.undefined
  var disableScroll: js.UndefOr[Boolean] = js.undefined
  var el: Node
  var gestureName: String
  var gesturePriority: js.UndefOr[Double] = js.undefined
  var maxAngle: js.UndefOr[Double] = js.undefined
  var notCaptured: js.UndefOr[GestureCallback] = js.undefined
  var onEnd: js.UndefOr[GestureCallback] = js.undefined
  var onMove: js.UndefOr[GestureCallback] = js.undefined
  var onStart: js.UndefOr[GestureCallback] = js.undefined
  var onWillStart: js.UndefOr[js.Function1[/* _ */ GestureDetail, js.Promise[Unit]]] = js.undefined
  var passive: js.UndefOr[Boolean] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object GestureConfig {
  @scala.inline
  def apply(
    el: Node,
    gestureName: String,
    blurOnStart: js.UndefOr[Boolean] = js.undefined,
    canStart: /* detail */ GestureDetail => Boolean | Unit = null,
    direction: x | y = null,
    disableScroll: js.UndefOr[Boolean] = js.undefined,
    gesturePriority: js.UndefOr[Double] = js.undefined,
    maxAngle: js.UndefOr[Double] = js.undefined,
    notCaptured: /* detail */ GestureDetail => Boolean | Unit = null,
    onEnd: /* detail */ GestureDetail => Boolean | Unit = null,
    onMove: /* detail */ GestureDetail => Boolean | Unit = null,
    onStart: /* detail */ GestureDetail => Boolean | Unit = null,
    onWillStart: /* _ */ GestureDetail => js.Promise[Unit] = null,
    passive: js.UndefOr[Boolean] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined
  ): GestureConfig = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], gestureName = gestureName.asInstanceOf[js.Any])
    if (!js.isUndefined(blurOnStart)) __obj.updateDynamic("blurOnStart")(blurOnStart.get.asInstanceOf[js.Any])
    if (canStart != null) __obj.updateDynamic("canStart")(js.Any.fromFunction1(canStart))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gesturePriority)) __obj.updateDynamic("gesturePriority")(gesturePriority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAngle)) __obj.updateDynamic("maxAngle")(maxAngle.get.asInstanceOf[js.Any])
    if (notCaptured != null) __obj.updateDynamic("notCaptured")(js.Any.fromFunction1(notCaptured))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onMove != null) __obj.updateDynamic("onMove")(js.Any.fromFunction1(onMove))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    if (onWillStart != null) __obj.updateDynamic("onWillStart")(js.Any.fromFunction1(onWillStart))
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureConfig]
  }
}

