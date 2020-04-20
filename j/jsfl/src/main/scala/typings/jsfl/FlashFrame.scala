package typings.jsfl

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
    getCustomEase: () => js.Any,
    hasCustomEase: js.Any,
    labelType: js.Any,
    motionTweenOrientToPath: js.Any,
    motionTweenRotate: js.Any,
    motionTweenRotateTimes: js.Any,
    motionTweenScale: js.Any,
    motionTweenSnap: js.Any,
    motionTweenSync: js.Any,
    name: js.Any,
    setCustomEase: () => js.Any,
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
    val __obj = js.Dynamic.literal(actionScript = actionScript.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], getCustomEase = js.Any.fromFunction0(getCustomEase), hasCustomEase = hasCustomEase.asInstanceOf[js.Any], labelType = labelType.asInstanceOf[js.Any], motionTweenOrientToPath = motionTweenOrientToPath.asInstanceOf[js.Any], motionTweenRotate = motionTweenRotate.asInstanceOf[js.Any], motionTweenRotateTimes = motionTweenRotateTimes.asInstanceOf[js.Any], motionTweenScale = motionTweenScale.asInstanceOf[js.Any], motionTweenSnap = motionTweenSnap.asInstanceOf[js.Any], motionTweenSync = motionTweenSync.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setCustomEase = js.Any.fromFunction0(setCustomEase), shapeTweenBlend = shapeTweenBlend.asInstanceOf[js.Any], soundEffect = soundEffect.asInstanceOf[js.Any], soundLibraryItem = soundLibraryItem.asInstanceOf[js.Any], soundLoop = soundLoop.asInstanceOf[js.Any], soundLoopMode = soundLoopMode.asInstanceOf[js.Any], soundName = soundName.asInstanceOf[js.Any], soundSync = soundSync.asInstanceOf[js.Any], startFrame = startFrame.asInstanceOf[js.Any], tweenEasing = tweenEasing.asInstanceOf[js.Any], tweenType = tweenType.asInstanceOf[js.Any], useSingleEaseCurve = useSingleEaseCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashFrame]
  }
}

