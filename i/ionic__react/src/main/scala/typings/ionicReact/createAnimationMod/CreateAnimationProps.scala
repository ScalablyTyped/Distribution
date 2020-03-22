package typings.ionicReact.createAnimationMod

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.animationInterfaceMod.AnimationDirection
import typings.ionicCore.animationInterfaceMod.AnimationFill
import typings.ionicCore.animationInterfaceMod.AnimationKeyFrames
import typings.ionicReact.AnonCallback
import typings.ionicReact.AnonDur
import typings.ionicReact.AnonForceLinearEasing
import typings.ionicReact.AnonStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAnimationProps extends js.Object {
  var afterAddClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var afterAddRead: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterAddWrite: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterClearStyles: js.UndefOr[js.Array[String]] = js.undefined
  var afterRemoveClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var afterStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var beforeAddClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var beforeAddRead: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeAddWrite: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeClearStyles: js.UndefOr[js.Array[String]] = js.undefined
  var beforeRemoveClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var beforeStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var destroy: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[AnimationDirection] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var fill: js.UndefOr[AnimationFill] = js.undefined
  var from: js.UndefOr[PartialPropertyValue] = js.undefined
  var fromTo: js.UndefOr[PropertyValue] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var iterations: js.UndefOr[Double] = js.undefined
  var keyframes: js.UndefOr[AnimationKeyFrames] = js.undefined
  var onFinish: js.UndefOr[AnonCallback] = js.undefined
  var pause: js.UndefOr[Boolean] = js.undefined
  var play: js.UndefOr[Boolean] = js.undefined
  var progressEnd: js.UndefOr[AnonDur] = js.undefined
  var progressStart: js.UndefOr[AnonForceLinearEasing] = js.undefined
  var progressStep: js.UndefOr[AnonStep] = js.undefined
  var stop: js.UndefOr[Boolean] = js.undefined
  var to: js.UndefOr[PartialPropertyValue] = js.undefined
}

object CreateAnimationProps {
  @scala.inline
  def apply(
    afterAddClass: String | js.Array[String] = null,
    afterAddRead: () => Unit = null,
    afterAddWrite: () => Unit = null,
    afterClearStyles: js.Array[String] = null,
    afterRemoveClass: String | js.Array[String] = null,
    afterStyles: StringDictionary[js.Any] = null,
    beforeAddClass: String | js.Array[String] = null,
    beforeAddRead: () => Unit = null,
    beforeAddWrite: () => Unit = null,
    beforeClearStyles: js.Array[String] = null,
    beforeRemoveClass: String | js.Array[String] = null,
    beforeStyles: StringDictionary[js.Any] = null,
    delay: Int | Double = null,
    destroy: js.UndefOr[Boolean] = js.undefined,
    direction: AnimationDirection = null,
    duration: Int | Double = null,
    easing: String = null,
    fill: AnimationFill = null,
    from: PartialPropertyValue = null,
    fromTo: PropertyValue = null,
    id: String = null,
    iterations: Int | Double = null,
    keyframes: AnimationKeyFrames = null,
    onFinish: AnonCallback = null,
    pause: js.UndefOr[Boolean] = js.undefined,
    play: js.UndefOr[Boolean] = js.undefined,
    progressEnd: AnonDur = null,
    progressStart: AnonForceLinearEasing = null,
    progressStep: AnonStep = null,
    stop: js.UndefOr[Boolean] = js.undefined,
    to: PartialPropertyValue = null
  ): CreateAnimationProps = {
    val __obj = js.Dynamic.literal()
    if (afterAddClass != null) __obj.updateDynamic("afterAddClass")(afterAddClass.asInstanceOf[js.Any])
    if (afterAddRead != null) __obj.updateDynamic("afterAddRead")(js.Any.fromFunction0(afterAddRead))
    if (afterAddWrite != null) __obj.updateDynamic("afterAddWrite")(js.Any.fromFunction0(afterAddWrite))
    if (afterClearStyles != null) __obj.updateDynamic("afterClearStyles")(afterClearStyles.asInstanceOf[js.Any])
    if (afterRemoveClass != null) __obj.updateDynamic("afterRemoveClass")(afterRemoveClass.asInstanceOf[js.Any])
    if (afterStyles != null) __obj.updateDynamic("afterStyles")(afterStyles.asInstanceOf[js.Any])
    if (beforeAddClass != null) __obj.updateDynamic("beforeAddClass")(beforeAddClass.asInstanceOf[js.Any])
    if (beforeAddRead != null) __obj.updateDynamic("beforeAddRead")(js.Any.fromFunction0(beforeAddRead))
    if (beforeAddWrite != null) __obj.updateDynamic("beforeAddWrite")(js.Any.fromFunction0(beforeAddWrite))
    if (beforeClearStyles != null) __obj.updateDynamic("beforeClearStyles")(beforeClearStyles.asInstanceOf[js.Any])
    if (beforeRemoveClass != null) __obj.updateDynamic("beforeRemoveClass")(beforeRemoveClass.asInstanceOf[js.Any])
    if (beforeStyles != null) __obj.updateDynamic("beforeStyles")(beforeStyles.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(destroy)) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (fromTo != null) __obj.updateDynamic("fromTo")(fromTo.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (keyframes != null) __obj.updateDynamic("keyframes")(keyframes.asInstanceOf[js.Any])
    if (onFinish != null) __obj.updateDynamic("onFinish")(onFinish.asInstanceOf[js.Any])
    if (!js.isUndefined(pause)) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (!js.isUndefined(play)) __obj.updateDynamic("play")(play.asInstanceOf[js.Any])
    if (progressEnd != null) __obj.updateDynamic("progressEnd")(progressEnd.asInstanceOf[js.Any])
    if (progressStart != null) __obj.updateDynamic("progressStart")(progressStart.asInstanceOf[js.Any])
    if (progressStep != null) __obj.updateDynamic("progressStep")(progressStep.asInstanceOf[js.Any])
    if (!js.isUndefined(stop)) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnimationProps]
  }
}

