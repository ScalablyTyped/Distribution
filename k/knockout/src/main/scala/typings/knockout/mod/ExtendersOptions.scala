package typings.knockout.mod

import typings.knockout.knockoutBooleans.`true`
import typings.knockout.knockoutStrings.always
import typings.knockout.mod.utils.CompareArraysOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendersOptions[T] extends StObject {
  
  var deferred: `true` = js.native
  
  @JSName("notify")
  var notify_FExtendersOptions: always | js.Any = js.native
  
  var rateLimit: Double | RateLimitOptions = js.native
  
  var throttle: Double = js.native
  
  var trackArrayChanges: `true` | CompareArraysOptions = js.native
}
object ExtendersOptions {
  
  @scala.inline
  def apply[T](
    deferred: `true`,
    notify_ : always | js.Any,
    rateLimit: Double | RateLimitOptions,
    throttle: Double,
    trackArrayChanges: `true` | CompareArraysOptions
  ): ExtendersOptions[T] = {
    val __obj = js.Dynamic.literal(deferred = deferred.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], trackArrayChanges = trackArrayChanges.asInstanceOf[js.Any])
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendersOptions[T]]
  }
  
  @scala.inline
  implicit class ExtendersOptionsMutableBuilder[Self <: ExtendersOptions[_], T] (val x: Self with ExtendersOptions[T]) extends AnyVal {
    
    @scala.inline
    def setDeferred(value: `true`): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotify_(value: always | js.Any): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateLimit(value: Double | RateLimitOptions): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackArrayChanges(value: `true` | CompareArraysOptions): Self = StObject.set(x, "trackArrayChanges", value.asInstanceOf[js.Any])
  }
}
