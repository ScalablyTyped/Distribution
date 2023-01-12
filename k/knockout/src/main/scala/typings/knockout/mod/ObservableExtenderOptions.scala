package typings.knockout.mod

import typings.knockout.knockoutBooleans.`true`
import typings.knockout.knockoutStrings.always
import typings.knockout.mod.utils.CompareArraysOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<knockout.knockout.ExtendersOptions<T>> */
trait ObservableExtenderOptions[T] extends StObject {
  
  var deferred: js.UndefOr[`true`] = js.undefined
  
  @JSName("notify")
  var notify_FObservableExtenderOptions: js.UndefOr[always | Any] = js.undefined
  
  var rateLimit: js.UndefOr[Double | RateLimitOptions] = js.undefined
  
  var throttle: js.UndefOr[Double] = js.undefined
  
  var trackArrayChanges: js.UndefOr[`true` | CompareArraysOptions] = js.undefined
}
object ObservableExtenderOptions {
  
  inline def apply[T](): ObservableExtenderOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservableExtenderOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObservableExtenderOptions[?], T] (val x: Self & ObservableExtenderOptions[T]) extends AnyVal {
    
    inline def setDeferred(value: `true`): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    inline def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
    
    inline def setNotify_(value: always | Any): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
    
    inline def setRateLimit(value: Double | RateLimitOptions): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
    
    inline def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
    
    inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    
    inline def setTrackArrayChanges(value: `true` | CompareArraysOptions): Self = StObject.set(x, "trackArrayChanges", value.asInstanceOf[js.Any])
    
    inline def setTrackArrayChangesUndefined: Self = StObject.set(x, "trackArrayChanges", js.undefined)
  }
}
