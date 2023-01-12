package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  var animationId: Double
  
  def destroy(): Unit
  
  var onAnimationCancel: js.UndefOr[js.Function1[/* cb */ AnimationCallback, Unit]] = js.undefined
  
  var onAnimationEnd: js.UndefOr[js.Function1[/* cb */ AnimationCallback, Unit]] = js.undefined
  
  var onAnimationRepeat: js.UndefOr[js.Function1[/* cb */ AnimationCallback, Unit]] = js.undefined
  
  var onAnimationStart: js.UndefOr[js.Function1[/* cb */ AnimationCallback, Unit]] = js.undefined
  
  def pause(): Unit
  
  def resume(): Unit
  
  def start(): Unit
  
  def updateAnimation(options: AnimationOptions): Unit
}
object Animation {
  
  inline def apply(
    animationId: Double,
    destroy: () => Unit,
    pause: () => Unit,
    resume: () => Unit,
    start: () => Unit,
    updateAnimation: AnimationOptions => Unit
  ): Animation = {
    val __obj = js.Dynamic.literal(animationId = animationId.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), start = js.Any.fromFunction0(start), updateAnimation = js.Any.fromFunction1(updateAnimation))
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    inline def setAnimationId(value: Double): Self = StObject.set(x, "animationId", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setOnAnimationCancel(value: /* cb */ AnimationCallback => Unit): Self = StObject.set(x, "onAnimationCancel", js.Any.fromFunction1(value))
    
    inline def setOnAnimationCancelUndefined: Self = StObject.set(x, "onAnimationCancel", js.undefined)
    
    inline def setOnAnimationEnd(value: /* cb */ AnimationCallback => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationRepeat(value: /* cb */ AnimationCallback => Unit): Self = StObject.set(x, "onAnimationRepeat", js.Any.fromFunction1(value))
    
    inline def setOnAnimationRepeatUndefined: Self = StObject.set(x, "onAnimationRepeat", js.undefined)
    
    inline def setOnAnimationStart(value: /* cb */ AnimationCallback => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setUpdateAnimation(value: AnimationOptions => Unit): Self = StObject.set(x, "updateAnimation", js.Any.fromFunction1(value))
  }
}
