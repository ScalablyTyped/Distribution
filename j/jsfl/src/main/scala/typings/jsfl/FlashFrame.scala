package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashFrame extends StObject {
  
  var actionScript: js.Any
  
  var duration: js.Any
  
  var elements: js.Array[FlashElement]
  
  def getCustomEase(): js.Any
  
  var hasCustomEase: js.Any
  
  var labelType: js.Any
  
  var motionTweenOrientToPath: js.Any
  
  var motionTweenRotate: js.Any
  
  var motionTweenRotateTimes: js.Any
  
  var motionTweenScale: js.Any
  
  var motionTweenSnap: js.Any
  
  var motionTweenSync: js.Any
  
  var name: js.Any
  
  def setCustomEase(): js.Any
  
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
}
object FlashFrame {
  
  inline def apply(
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
  
  extension [Self <: FlashFrame](x: Self) {
    
    inline def setActionScript(value: js.Any): Self = StObject.set(x, "actionScript", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: js.Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setElements(value: js.Array[FlashElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: FlashElement*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    inline def setGetCustomEase(value: () => js.Any): Self = StObject.set(x, "getCustomEase", js.Any.fromFunction0(value))
    
    inline def setHasCustomEase(value: js.Any): Self = StObject.set(x, "hasCustomEase", value.asInstanceOf[js.Any])
    
    inline def setLabelType(value: js.Any): Self = StObject.set(x, "labelType", value.asInstanceOf[js.Any])
    
    inline def setMotionTweenOrientToPath(value: js.Any): Self = StObject.set(x, "motionTweenOrientToPath", value.asInstanceOf[js.Any])
    
    inline def setMotionTweenRotate(value: js.Any): Self = StObject.set(x, "motionTweenRotate", value.asInstanceOf[js.Any])
    
    inline def setMotionTweenRotateTimes(value: js.Any): Self = StObject.set(x, "motionTweenRotateTimes", value.asInstanceOf[js.Any])
    
    inline def setMotionTweenScale(value: js.Any): Self = StObject.set(x, "motionTweenScale", value.asInstanceOf[js.Any])
    
    inline def setMotionTweenSnap(value: js.Any): Self = StObject.set(x, "motionTweenSnap", value.asInstanceOf[js.Any])
    
    inline def setMotionTweenSync(value: js.Any): Self = StObject.set(x, "motionTweenSync", value.asInstanceOf[js.Any])
    
    inline def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSetCustomEase(value: () => js.Any): Self = StObject.set(x, "setCustomEase", js.Any.fromFunction0(value))
    
    inline def setShapeTweenBlend(value: js.Any): Self = StObject.set(x, "shapeTweenBlend", value.asInstanceOf[js.Any])
    
    inline def setSoundEffect(value: js.Any): Self = StObject.set(x, "soundEffect", value.asInstanceOf[js.Any])
    
    inline def setSoundLibraryItem(value: FlashSoundItem): Self = StObject.set(x, "soundLibraryItem", value.asInstanceOf[js.Any])
    
    inline def setSoundLoop(value: js.Any): Self = StObject.set(x, "soundLoop", value.asInstanceOf[js.Any])
    
    inline def setSoundLoopMode(value: js.Any): Self = StObject.set(x, "soundLoopMode", value.asInstanceOf[js.Any])
    
    inline def setSoundName(value: js.Any): Self = StObject.set(x, "soundName", value.asInstanceOf[js.Any])
    
    inline def setSoundSync(value: js.Any): Self = StObject.set(x, "soundSync", value.asInstanceOf[js.Any])
    
    inline def setStartFrame(value: js.Any): Self = StObject.set(x, "startFrame", value.asInstanceOf[js.Any])
    
    inline def setTweenEasing(value: js.Any): Self = StObject.set(x, "tweenEasing", value.asInstanceOf[js.Any])
    
    inline def setTweenType(value: js.Any): Self = StObject.set(x, "tweenType", value.asInstanceOf[js.Any])
    
    inline def setUseSingleEaseCurve(value: js.Any): Self = StObject.set(x, "useSingleEaseCurve", value.asInstanceOf[js.Any])
  }
}
