package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryAnimationOptions extends StObject {
  
  /**
    * A function to be called when the animation completes or stops without completing (its Promise object is either resolved or rejected). (version added: 1.8)
    */
  var always: js.UndefOr[js.Function2[/* animation */ JQueryPromise[Any], /* jumpedToEnd */ Boolean, Any]] = js.undefined
  
  /**
    * A function to call once the animation is complete.
    */
  var complete: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function to be called when the animation completes (its Promise object is resolved). (version added: 1.8)
    */
  var done: js.UndefOr[js.Function2[/* animation */ JQueryPromise[Any], /* jumpedToEnd */ Boolean, Any]] = js.undefined
  
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: js.UndefOr[Any] = js.undefined
  
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: js.UndefOr[String] = js.undefined
  
  /**
    * A function to be called when the animation fails to complete (its Promise object is rejected). (version added: 1.8)
    */
  var fail: js.UndefOr[js.Function2[/* animation */ JQueryPromise[Any], /* jumpedToEnd */ Boolean, Any]] = js.undefined
  
  /**
    * A function to be called after each step of the animation, only once per animated element regardless of the number of animated properties. (version added: 1.8)
    */
  var progress: js.UndefOr[
    js.Function3[
      /* animation */ JQueryPromise[Any], 
      /* progress */ Double, 
      /* remainingMs */ Double, 
      Any
    ]
  ] = js.undefined
  
  /**
    * A Boolean indicating whether to place the animation in the effects queue. If false, the animation will begin immediately. As of jQuery 1.7, the queue option can also accept a string, in which case the animation is added to the queue represented by that string. When a custom queue name is used the animation does not automatically start; you must call .dequeue("queuename") to start it.
    */
  var queue: js.UndefOr[Any] = js.undefined
  
  /**
    * A map of one or more of the CSS properties defined by the properties argument and their corresponding easing functions. (version added: 1.4)
    */
  var specialEasing: js.UndefOr[Object] = js.undefined
  
  /**
    * A function to call when the animation begins. (version added: 1.8)
    */
  var start: js.UndefOr[js.Function1[/* animation */ JQueryPromise[Any], Any]] = js.undefined
  
  /**
    * A function to be called for each animated property of each animated element. This function provides an opportunity to modify the Tween object to change the value of the property before it is set.
    */
  var step: js.UndefOr[js.Function2[/* now */ Double, /* tween */ Any, Any]] = js.undefined
}
object JQueryAnimationOptions {
  
  inline def apply(): JQueryAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryAnimationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryAnimationOptions] (val x: Self) extends AnyVal {
    
    inline def setAlways(value: (/* animation */ JQueryPromise[Any], /* jumpedToEnd */ Boolean) => Any): Self = StObject.set(x, "always", js.Any.fromFunction2(value))
    
    inline def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
    
    inline def setComplete(value: js.Function): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDone(value: (/* animation */ JQueryPromise[Any], /* jumpedToEnd */ Boolean) => Any): Self = StObject.set(x, "done", js.Any.fromFunction2(value))
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setDuration(value: Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setFail(value: (/* animation */ JQueryPromise[Any], /* jumpedToEnd */ Boolean) => Any): Self = StObject.set(x, "fail", js.Any.fromFunction2(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setProgress(
      value: (/* animation */ JQueryPromise[Any], /* progress */ Double, /* remainingMs */ Double) => Any
    ): Self = StObject.set(x, "progress", js.Any.fromFunction3(value))
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setQueue(value: Any): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    inline def setSpecialEasing(value: Object): Self = StObject.set(x, "specialEasing", value.asInstanceOf[js.Any])
    
    inline def setSpecialEasingUndefined: Self = StObject.set(x, "specialEasing", js.undefined)
    
    inline def setStart(value: /* animation */ JQueryPromise[Any] => Any): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStep(value: (/* now */ Double, /* tween */ Any) => Any): Self = StObject.set(x, "step", js.Any.fromFunction2(value))
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
