package typings.knockout.mod

import org.scalablytyped.runtime.StringDictionary
import typings.knockout.knockoutBooleans.`true`
import typings.knockout.knockoutStrings.always
import typings.knockout.mod.utils.CompareArraysOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent knockout.knockout.AsExtenders<knockout.knockout.ExtendersOptions<T>> */
@js.native
trait Extenders_[T] extends /* name */ StringDictionary[Extender[_, _]] {
  
  @JSName("deferred")
  var deferred_Original: Extender[Subscribable_[_], `true`] = js.native
  @JSName("deferred")
  def deferred_true(target: Subscribable_[_], options: `true`): Subscribable_[_] = js.native
  
  def notify(target: Subscribable_[_], options: js.Any): Subscribable_[_] = js.native
  @JSName("notify")
  var notify_Original: Extender[Subscribable_[_], always | _] = js.native
  @JSName("notify")
  def notify_always(target: Subscribable_[_], options: always): Subscribable_[_] = js.native
  
  def rateLimit(target: Subscribable_[_], options: Double): Subscribable_[_] = js.native
  def rateLimit(target: Subscribable_[_], options: RateLimitOptions): Subscribable_[_] = js.native
  @JSName("rateLimit")
  var rateLimit_Original: Extender[Subscribable_[_], Double | RateLimitOptions] = js.native
  
  def throttle(target: Subscribable_[_], options: Double): Subscribable_[_] = js.native
  @JSName("throttle")
  var throttle_Original: Extender[Subscribable_[_], Double] = js.native
  
  def trackArrayChanges(target: Subscribable_[_], options: CompareArraysOptions): Subscribable_[_] = js.native
  @JSName("trackArrayChanges")
  var trackArrayChanges_Original: Extender[Subscribable_[_], `true` | CompareArraysOptions] = js.native
  @JSName("trackArrayChanges")
  def trackArrayChanges_true(target: Subscribable_[_], options: `true`): Subscribable_[_] = js.native
}
