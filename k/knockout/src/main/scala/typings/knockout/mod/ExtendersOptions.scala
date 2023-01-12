package typings.knockout.mod

import typings.knockout.knockoutBooleans.`true`
import typings.knockout.knockoutStrings.always
import typings.knockout.mod.utils.CompareArraysOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendersOptions[T] extends StObject {
  
  var deferred: `true`
  
  @JSName("notify")
  var notify_FExtendersOptions: always | Any
  
  var rateLimit: Double | RateLimitOptions
  
  var throttle: Double
  
  var trackArrayChanges: `true` | CompareArraysOptions
}
object ExtendersOptions {
  
  inline def apply[T](
    notify_ : always | Any,
    rateLimit: Double | RateLimitOptions,
    throttle: Double,
    trackArrayChanges: `true` | CompareArraysOptions
  ): ExtendersOptions[T] = {
    val __obj = js.Dynamic.literal(deferred = true, rateLimit = rateLimit.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], trackArrayChanges = trackArrayChanges.asInstanceOf[js.Any])
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendersOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendersOptions[?], T] (val x: Self & ExtendersOptions[T]) extends AnyVal {
    
    inline def setDeferred(value: `true`): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    inline def setNotify_(value: always | Any): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setRateLimit(value: Double | RateLimitOptions): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
    
    inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setTrackArrayChanges(value: `true` | CompareArraysOptions): Self = StObject.set(x, "trackArrayChanges", value.asInstanceOf[js.Any])
  }
}
