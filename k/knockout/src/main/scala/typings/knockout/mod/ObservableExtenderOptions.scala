package typings.knockout.mod

import typings.knockout.knockoutBooleans.`true`
import typings.knockout.knockoutStrings.always
import typings.knockout.mod.utils.CompareArraysOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<knockout.knockout.ExtendersOptions<T>> */
@js.native
trait ObservableExtenderOptions[T] extends StObject {
  
  var deferred: js.UndefOr[`true`] = js.native
  
  @JSName("notify")
  var notify_FObservableExtenderOptions: js.UndefOr[always | js.Any] = js.native
  
  var rateLimit: js.UndefOr[Double | RateLimitOptions] = js.native
  
  var throttle: js.UndefOr[Double] = js.native
  
  var trackArrayChanges: js.UndefOr[`true` | CompareArraysOptions] = js.native
}
object ObservableExtenderOptions {
  
  @scala.inline
  def apply[T](): ObservableExtenderOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservableExtenderOptions[T]]
  }
  
  @scala.inline
  implicit class ObservableExtenderOptionsMutableBuilder[Self <: ObservableExtenderOptions[_], T] (val x: Self with ObservableExtenderOptions[T]) extends AnyVal {
    
    @scala.inline
    def setDeferred(value: `true`): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
    
    @scala.inline
    def setNotify_(value: always | js.Any): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
    
    @scala.inline
    def setRateLimit(value: Double | RateLimitOptions): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
    
    @scala.inline
    def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    
    @scala.inline
    def setTrackArrayChanges(value: `true` | CompareArraysOptions): Self = StObject.set(x, "trackArrayChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackArrayChangesUndefined: Self = StObject.set(x, "trackArrayChanges", js.undefined)
  }
}
