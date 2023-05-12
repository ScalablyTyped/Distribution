package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.FillColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.gorillaEngine.GorillaEngine.UI.Common because var conflicts: id. Inlined visible, enabled, wantsKeyboardFocus, clickGrabsKeyboardFocus, alpha, alwaysOnTop
- typings.gorillaEngine.GorillaEngine.UI.LottieAnimationProps because var conflicts: id. Inlined filePath, autoplay, loop, totalFrames, duration, currentFrame, play, stop, pause, setFrame, setFrameFromLinearTransform, setProperties */ trait LottieAnimation
  extends StObject
     with Component
     with Bounds {
  
  var alpha: Double
  
  var alwaysOnTop: Boolean
  
  var autoplay: Boolean
  
  var clickGrabsKeyboardFocus: Boolean
  
  val currentFrame: js.UndefOr[Double] = js.undefined
  
  val duration: js.UndefOr[Double] = js.undefined
  
  var enabled: Boolean
  
  var filePath: String
  
  var loop: Boolean
  
  def pause(): Unit
  
  def play(): Unit
  
  def setFrame(frame: Double): Unit
  
  def setFrameFromLinearTransform(value: Double, min: Double, max: Double): Unit
  
  def setProperties(selector: String, settings: FillColor): Unit
  
  def stop(): Unit
  
  val totalFrames: js.UndefOr[Double] = js.undefined
  
  var visible: Boolean
  
  var wantsKeyboardFocus: Boolean
}
object LottieAnimation {
  
  inline def apply(
    alpha: Double,
    alwaysOnTop: Boolean,
    appendChild: Component => Unit,
    autoplay: Boolean,
    children: js.Array[Component],
    clickGrabsKeyboardFocus: Boolean,
    enabled: Boolean,
    filePath: String,
    height: Double,
    id: String,
    insertBefore: (Component, Component) => Unit,
    loop: Boolean,
    on: (String, Any) => Unit,
    parent: Component,
    pause: () => Unit,
    play: () => Unit,
    removeChild: Component => Unit,
    setFrame: Double => Unit,
    setFrameFromLinearTransform: (Double, Double, Double) => Unit,
    setProperties: (String, FillColor) => Unit,
    stop: () => Unit,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): LottieAnimation = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], appendChild = js.Any.fromFunction1(appendChild), autoplay = autoplay.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), loop = loop.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), parent = parent.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), removeChild = js.Any.fromFunction1(removeChild), setFrame = js.Any.fromFunction1(setFrame), setFrameFromLinearTransform = js.Any.fromFunction3(setFrameFromLinearTransform), setProperties = js.Any.fromFunction2(setProperties), stop = js.Any.fromFunction0(stop), visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LottieAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LottieAnimation] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setClickGrabsKeyboardFocus(value: Boolean): Self = StObject.set(x, "clickGrabsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setCurrentFrame(value: Double): Self = StObject.set(x, "currentFrame", value.asInstanceOf[js.Any])
    
    inline def setCurrentFrameUndefined: Self = StObject.set(x, "currentFrame", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    inline def setSetFrame(value: Double => Unit): Self = StObject.set(x, "setFrame", js.Any.fromFunction1(value))
    
    inline def setSetFrameFromLinearTransform(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setFrameFromLinearTransform", js.Any.fromFunction3(value))
    
    inline def setSetProperties(value: (String, FillColor) => Unit): Self = StObject.set(x, "setProperties", js.Any.fromFunction2(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setTotalFrames(value: Double): Self = StObject.set(x, "totalFrames", value.asInstanceOf[js.Any])
    
    inline def setTotalFramesUndefined: Self = StObject.set(x, "totalFrames", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWantsKeyboardFocus(value: Boolean): Self = StObject.set(x, "wantsKeyboardFocus", value.asInstanceOf[js.Any])
  }
}
