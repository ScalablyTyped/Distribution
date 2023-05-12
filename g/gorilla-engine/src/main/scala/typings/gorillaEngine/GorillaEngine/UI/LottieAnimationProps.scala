package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.FillColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LottieAnimationProps
  extends StObject
     with Common
     with Bounds {
  
  var autoplay: Boolean
  
  val currentFrame: js.UndefOr[Double] = js.undefined
  
  val duration: js.UndefOr[Double] = js.undefined
  
  var filePath: String
  
  var loop: Boolean
  
  def pause(): Unit
  
  def play(): Unit
  
  def setFrame(frame: Double): Unit
  
  def setFrameFromLinearTransform(value: Double, min: Double, max: Double): Unit
  
  def setProperties(selector: String, settings: FillColor): Unit
  
  def stop(): Unit
  
  val totalFrames: js.UndefOr[Double] = js.undefined
}
object LottieAnimationProps {
  
  inline def apply(
    alpha: Double,
    alwaysOnTop: Boolean,
    autoplay: Boolean,
    clickGrabsKeyboardFocus: Boolean,
    enabled: Boolean,
    filePath: String,
    height: Double,
    id: String,
    loop: Boolean,
    pause: () => Unit,
    play: () => Unit,
    setFrame: Double => Unit,
    setFrameFromLinearTransform: (Double, Double, Double) => Unit,
    setProperties: (String, FillColor) => Unit,
    stop: () => Unit,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): LottieAnimationProps = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), setFrame = js.Any.fromFunction1(setFrame), setFrameFromLinearTransform = js.Any.fromFunction3(setFrameFromLinearTransform), setProperties = js.Any.fromFunction2(setProperties), stop = js.Any.fromFunction0(stop), visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LottieAnimationProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LottieAnimationProps] (val x: Self) extends AnyVal {
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setCurrentFrame(value: Double): Self = StObject.set(x, "currentFrame", value.asInstanceOf[js.Any])
    
    inline def setCurrentFrameUndefined: Self = StObject.set(x, "currentFrame", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
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
  }
}
