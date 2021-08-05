package typings.knockout.mod

import org.scalablytyped.runtime.StringDictionary
import typings.knockout.knockoutBooleans.`true`
import typings.knockout.knockoutStrings.always
import typings.knockout.mod.utils.CompareArraysOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent knockout.knockout.AsExtenders<knockout.knockout.ExtendersOptions<T>> */
trait Extenders_[T]
  extends StObject
     with /* name */ StringDictionary[Extender[js.Any, js.Any]] {
  
  @JSName("deferred")
  var deferred_Original: Extender[Subscribable_[js.Any], `true`]
  @JSName("deferred")
  def deferred_true(target: Subscribable_[js.Any], options: `true`): Subscribable_[js.Any]
  
  def notify(target: Subscribable_[js.Any], options: js.Any): Subscribable_[js.Any]
  @JSName("notify")
  var notify_Original: Extender[Subscribable_[js.Any], always | js.Any]
  @JSName("notify")
  def notify_always(target: Subscribable_[js.Any], options: always): Subscribable_[js.Any]
  
  def rateLimit(target: Subscribable_[js.Any], options: Double): Subscribable_[js.Any]
  def rateLimit(target: Subscribable_[js.Any], options: RateLimitOptions): Subscribable_[js.Any]
  @JSName("rateLimit")
  var rateLimit_Original: Extender[Subscribable_[js.Any], Double | RateLimitOptions]
  
  def throttle(target: Subscribable_[js.Any], options: Double): Subscribable_[js.Any]
  @JSName("throttle")
  var throttle_Original: Extender[Subscribable_[js.Any], Double]
  
  def trackArrayChanges(target: Subscribable_[js.Any], options: CompareArraysOptions): Subscribable_[js.Any]
  @JSName("trackArrayChanges")
  var trackArrayChanges_Original: Extender[Subscribable_[js.Any], `true` | CompareArraysOptions]
  @JSName("trackArrayChanges")
  def trackArrayChanges_true(target: Subscribable_[js.Any], options: `true`): Subscribable_[js.Any]
}
object Extenders_ {
  
  inline def apply[T](
    deferred: (Subscribable_[js.Any], `true`) => Subscribable_[js.Any],
    notify_ : (Subscribable_[js.Any], always | js.Any) => Subscribable_[js.Any],
    rateLimit: (Subscribable_[js.Any], Double | RateLimitOptions) => Subscribable_[js.Any],
    throttle: (Subscribable_[js.Any], Double) => Subscribable_[js.Any],
    trackArrayChanges: (Subscribable_[js.Any], `true` | CompareArraysOptions) => Subscribable_[js.Any]
  ): Extenders_[T] = {
    val __obj = js.Dynamic.literal(deferred = js.Any.fromFunction2(deferred), rateLimit = js.Any.fromFunction2(rateLimit), throttle = js.Any.fromFunction2(throttle), trackArrayChanges = js.Any.fromFunction2(trackArrayChanges))
    __obj.updateDynamic("notify")(js.Any.fromFunction2(notify_))
    __obj.asInstanceOf[Extenders_[T]]
  }
  
  extension [Self <: Extenders_[?], T](x: Self & Extenders_[T]) {
    
    inline def setDeferred(value: (Subscribable_[js.Any], `true`) => Subscribable_[js.Any]): Self = StObject.set(x, "deferred", js.Any.fromFunction2(value))
    
    inline def setNotify_(value: (Subscribable_[js.Any], always | js.Any) => Subscribable_[js.Any]): Self = StObject.set(x, "notify", js.Any.fromFunction2(value))
    
    inline def setRateLimit(value: (Subscribable_[js.Any], Double | RateLimitOptions) => Subscribable_[js.Any]): Self = StObject.set(x, "rateLimit", js.Any.fromFunction2(value))
    
    inline def setThrottle(value: (Subscribable_[js.Any], Double) => Subscribable_[js.Any]): Self = StObject.set(x, "throttle", js.Any.fromFunction2(value))
    
    inline def setTrackArrayChanges(value: (Subscribable_[js.Any], `true` | CompareArraysOptions) => Subscribable_[js.Any]): Self = StObject.set(x, "trackArrayChanges", js.Any.fromFunction2(value))
  }
}
