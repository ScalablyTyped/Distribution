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
     with /* name */ StringDictionary[Extender[Any, Any]] {
  
  @JSName("deferred")
  var deferred_Original: Extender[Subscribable_[Any], `true`]
  @JSName("deferred")
  def deferred_true(target: Subscribable_[Any], options: `true`): Subscribable_[Any]
  
  def notify(target: Subscribable_[Any], options: Any): Subscribable_[Any]
  @JSName("notify")
  var notify_Original: Extender[Subscribable_[Any], always | Any]
  @JSName("notify")
  def notify_always(target: Subscribable_[Any], options: always): Subscribable_[Any]
  
  def rateLimit(target: Subscribable_[Any], options: Double): Subscribable_[Any]
  def rateLimit(target: Subscribable_[Any], options: RateLimitOptions): Subscribable_[Any]
  @JSName("rateLimit")
  var rateLimit_Original: Extender[Subscribable_[Any], Double | RateLimitOptions]
  
  def throttle(target: Subscribable_[Any], options: Double): Subscribable_[Any]
  @JSName("throttle")
  var throttle_Original: Extender[Subscribable_[Any], Double]
  
  def trackArrayChanges(target: Subscribable_[Any], options: CompareArraysOptions): Subscribable_[Any]
  @JSName("trackArrayChanges")
  var trackArrayChanges_Original: Extender[Subscribable_[Any], `true` | CompareArraysOptions]
  @JSName("trackArrayChanges")
  def trackArrayChanges_true(target: Subscribable_[Any], options: `true`): Subscribable_[Any]
}
object Extenders_ {
  
  inline def apply[T](
    deferred: (Subscribable_[Any], `true`) => Subscribable_[Any],
    notify_ : (Subscribable_[Any], always | Any) => Subscribable_[Any],
    rateLimit: (Subscribable_[Any], Double | RateLimitOptions) => Subscribable_[Any],
    throttle: (Subscribable_[Any], Double) => Subscribable_[Any],
    trackArrayChanges: (Subscribable_[Any], `true` | CompareArraysOptions) => Subscribable_[Any]
  ): Extenders_[T] = {
    val __obj = js.Dynamic.literal(deferred = js.Any.fromFunction2(deferred), rateLimit = js.Any.fromFunction2(rateLimit), throttle = js.Any.fromFunction2(throttle), trackArrayChanges = js.Any.fromFunction2(trackArrayChanges))
    __obj.updateDynamic("notify")(js.Any.fromFunction2(notify_))
    __obj.asInstanceOf[Extenders_[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Extenders_[?], T] (val x: Self & Extenders_[T]) extends AnyVal {
    
    inline def setDeferred(value: (Subscribable_[Any], `true`) => Subscribable_[Any]): Self = StObject.set(x, "deferred", js.Any.fromFunction2(value))
    
    inline def setNotify_(value: (Subscribable_[Any], always | Any) => Subscribable_[Any]): Self = StObject.set(x, "notify", js.Any.fromFunction2(value))
    
    inline def setRateLimit(value: (Subscribable_[Any], Double | RateLimitOptions) => Subscribable_[Any]): Self = StObject.set(x, "rateLimit", js.Any.fromFunction2(value))
    
    inline def setThrottle(value: (Subscribable_[Any], Double) => Subscribable_[Any]): Self = StObject.set(x, "throttle", js.Any.fromFunction2(value))
    
    inline def setTrackArrayChanges(value: (Subscribable_[Any], `true` | CompareArraysOptions) => Subscribable_[Any]): Self = StObject.set(x, "trackArrayChanges", js.Any.fromFunction2(value))
  }
}
