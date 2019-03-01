package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashFrame extends js.Object {
  var actionScript: js.Any
  var duration: js.Any
  var elements: js.Array[FlashElement]
  var hasCustomEase: js.Any
  var labelType: js.Any
  var motionTweenOrientToPath: js.Any
  var motionTweenRotate: js.Any
  var motionTweenRotateTimes: js.Any
  var motionTweenScale: js.Any
  var motionTweenSnap: js.Any
  var motionTweenSync: js.Any
  var name: js.Any
  var shapeTweenBlend: js.Any
  var soundEffect: js.Any
  var soundLibraryItem: FlashSoundItem
  var soundLoop: js.Any
  var soundLoopMode: js.Any
  var soundName: js.Any
  var soundSync: js.Any
  var startFrame: js.Any
  var tweenEasing: js.Any
  var tweenType: js.Any
  var useSingleEaseCurve: js.Any
  def getCustomEase(): js.Any
  def setCustomEase(): js.Any
}

object FlashFrame {
  @scala.inline
  def apply(
    actionScript: js.Any,
    duration: js.Any,
    elements: js.Array[FlashElement],
    getCustomEase: js.Function0[js.Any],
    hasCustomEase: js.Any,
    labelType: js.Any,
    motionTweenOrientToPath: js.Any,
    motionTweenRotate: js.Any,
    motionTweenRotateTimes: js.Any,
    motionTweenScale: js.Any,
    motionTweenSnap: js.Any,
    motionTweenSync: js.Any,
    name: js.Any,
    setCustomEase: js.Function0[js.Any],
    shapeTweenBlend: js.Any,
    soundEffect: js.Any,
    soundLibraryItem: FlashSoundItem,
    soundLoop: js.Any,
    soundLoopMode: js.Any,
    soundName: js.Any,
    soundSync: js.Any,
    startFrame: js.Any,
    tweenEasing: js.Any,
    tweenType: js.Any,
    useSingleEaseCurve: js.Any
  ): FlashFrame = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actionScript")(actionScript)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("elements")(elements)
    __obj.updateDynamic("getCustomEase")(getCustomEase)
    __obj.updateDynamic("hasCustomEase")(hasCustomEase)
    __obj.updateDynamic("labelType")(labelType)
    __obj.updateDynamic("motionTweenOrientToPath")(motionTweenOrientToPath)
    __obj.updateDynamic("motionTweenRotate")(motionTweenRotate)
    __obj.updateDynamic("motionTweenRotateTimes")(motionTweenRotateTimes)
    __obj.updateDynamic("motionTweenScale")(motionTweenScale)
    __obj.updateDynamic("motionTweenSnap")(motionTweenSnap)
    __obj.updateDynamic("motionTweenSync")(motionTweenSync)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("setCustomEase")(setCustomEase)
    __obj.updateDynamic("shapeTweenBlend")(shapeTweenBlend)
    __obj.updateDynamic("soundEffect")(soundEffect)
    __obj.updateDynamic("soundLibraryItem")(soundLibraryItem)
    __obj.updateDynamic("soundLoop")(soundLoop)
    __obj.updateDynamic("soundLoopMode")(soundLoopMode)
    __obj.updateDynamic("soundName")(soundName)
    __obj.updateDynamic("soundSync")(soundSync)
    __obj.updateDynamic("startFrame")(startFrame)
    __obj.updateDynamic("tweenEasing")(tweenEasing)
    __obj.updateDynamic("tweenType")(tweenType)
    __obj.updateDynamic("useSingleEaseCurve")(useSingleEaseCurve)
    __obj.asInstanceOf[FlashFrame]
  }
}

