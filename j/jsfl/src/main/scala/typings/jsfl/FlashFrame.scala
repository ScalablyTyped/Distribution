package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashFrame extends StObject {
  
  var actionScript: Any
  
  var duration: Any
  
  var elements: js.Array[FlashElement]
  
  def getCustomEase(): Any
  
  var hasCustomEase: Any
  
  var labelType: Any
  
  var motionTweenOrientToPath: Any
  
  var motionTweenRotate: Any
  
  var motionTweenRotateTimes: Any
  
  var motionTweenScale: Any
  
  var motionTweenSnap: Any
  
  var motionTweenSync: Any
  
  var name: Any
  
  def setCustomEase(): Any
  
  var shapeTweenBlend: Any
  
  var soundEffect: Any
  
  var soundLibraryItem: FlashSoundItem
  
  var soundLoop: Any
  
  var soundLoopMode: Any
  
  var soundName: Any
  
  var soundSync: Any
  
  var startFrame: Any
  
  var tweenEasing: Any
  
  var tweenType: Any
  
  var useSingleEaseCurve: Any
}
object FlashFrame {
  
  inline def apply(
    actionScript: Any,
    duration: Any,
    elements: js.Array[FlashElement],
    getCustomEase: () => Any,
    hasCustomEase: Any,
    labelType: Any,
    motionTweenOrientToPath: Any,
    motionTweenRotate: Any,
    motionTweenRotateTimes: Any,
    motionTweenScale: Any,
    motionTweenSnap: Any,
    motionTweenSync: Any,
    name: Any,
    setCustomEase: () => Any,
    shapeTweenBlend: Any,
    soundEffect: Any,
    soundLibraryItem: FlashSoundItem,
    soundLoop: Any,
    soundLoopMode: Any,
    soundName: Any,
    soundSync: Any,
    startFrame: Any,
    tweenEasing: Any,
    tweenType: Any,
    useSingleEaseCurve: Any
  ): FlashFrame = {
    val __obj = js.Dynamic.literal(actionScript = actionScript.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], getCustomEase = js.Any.fromFunction0(getCustomEase), hasCustomEase = hasCustomEase.asInstanceOf[js.Any], labelType = labelType.asInstanceOf[js.Any], motionTweenOrientToPath = motionTweenOrientToPath.asInstanceOf[js.Any], motionTweenRotate = motionTweenRotate.asInstanceOf[js.Any], motionTweenRotateTimes = motionTweenRotateTimes.asInstanceOf[js.Any], motionTweenScale = motionTweenScale.asInstanceOf[js.Any], motionTweenSnap = motionTweenSnap.asInstanceOf[js.Any], motionTweenSync = motionTweenSync.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setCustomEase = js.Any.fromFunction0(setCustomEase), shapeTweenBlend = shapeTweenBlend.asInstanceOf[js.Any], soundEffect = soundEffect.asInstanceOf[js.Any], soundLibraryItem = soundLibraryItem.asInstanceOf[js.Any], soundLoop = soundLoop.asInstanceOf[js.Any], soundLoopMode = soundLoopMode.asInstanceOf[js.Any], soundName = soundName.asInstanceOf[js.Any], soundSync = soundSync.asInstanceOf[js.Any], startFrame = startFrame.asInstanceOf[js.Any], tweenEasing = tweenEasing.asInstanceOf[js.Any], tweenType = tweenType.asInstanceOf[js.Any], useSingleEaseCurve = useSingleEaseCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashFrame]
  }
  
  extension [Self <: FlashFrame](x: Self) {
    
    inline def setActionScript(value: Any): Self = StObject.set(x, "actionScript", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setElements(value: js.Array[FlashElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: FlashElement*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setGetCustomEase(value: () => Any): Self = StObject.set(x, "getCustomEase", js.Any.fromFunction0(value))
    
    inline def setHasCustomEase(value: Any): Self = StObject.set(x, "hasCustomEase", value.asInstanceOf[js.Any])
    
    inline def setLabelType(value: Any): Self = StObject.set(x, "labelType", value.asInstanceOf[js.Any])
    
    inline def setMotionTweenOrientToPath(value: Any): Self = StObject.set(x, "motionTweenOrientToPath", value.asInstanceOf[js.Any])
    
    inline def setMotionTweenRotate(value: Any): Self = StObject.set(x, "motionTweenRotate", value.asInstanceOf[js.Any])
    
    inline def setMotionTweenRotateTimes(value: Any): Self = StObject.set(x, "motionTweenRotateTimes", value.asInstanceOf[js.Any])
    
    inline def setMotionTweenScale(value: Any): Self = StObject.set(x, "motionTweenScale", value.asInstanceOf[js.Any])
    
    inline def setMotionTweenSnap(value: Any): Self = StObject.set(x, "motionTweenSnap", value.asInstanceOf[js.Any])
    
    inline def setMotionTweenSync(value: Any): Self = StObject.set(x, "motionTweenSync", value.asInstanceOf[js.Any])
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSetCustomEase(value: () => Any): Self = StObject.set(x, "setCustomEase", js.Any.fromFunction0(value))
    
    inline def setShapeTweenBlend(value: Any): Self = StObject.set(x, "shapeTweenBlend", value.asInstanceOf[js.Any])
    
    inline def setSoundEffect(value: Any): Self = StObject.set(x, "soundEffect", value.asInstanceOf[js.Any])
    
    inline def setSoundLibraryItem(value: FlashSoundItem): Self = StObject.set(x, "soundLibraryItem", value.asInstanceOf[js.Any])
    
    inline def setSoundLoop(value: Any): Self = StObject.set(x, "soundLoop", value.asInstanceOf[js.Any])
    
    inline def setSoundLoopMode(value: Any): Self = StObject.set(x, "soundLoopMode", value.asInstanceOf[js.Any])
    
    inline def setSoundName(value: Any): Self = StObject.set(x, "soundName", value.asInstanceOf[js.Any])
    
    inline def setSoundSync(value: Any): Self = StObject.set(x, "soundSync", value.asInstanceOf[js.Any])
    
    inline def setStartFrame(value: Any): Self = StObject.set(x, "startFrame", value.asInstanceOf[js.Any])
    
    inline def setTweenEasing(value: Any): Self = StObject.set(x, "tweenEasing", value.asInstanceOf[js.Any])
    
    inline def setTweenType(value: Any): Self = StObject.set(x, "tweenType", value.asInstanceOf[js.Any])
    
    inline def setUseSingleEaseCurve(value: Any): Self = StObject.set(x, "useSingleEaseCurve", value.asInstanceOf[js.Any])
  }
}
