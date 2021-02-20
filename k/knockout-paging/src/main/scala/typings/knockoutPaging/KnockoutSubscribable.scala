package typings.knockoutPaging

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutSubscribable[T] extends KnockoutSubscribableFunctions[T] {
  
  def extend(requestedExtenders: StringDictionary[js.Any]): KnockoutSubscribable[T] = js.native
  
  def getSubscriptionsCount(): Double = js.native
  
  def subscribe(callback: js.Function1[/* newValue */ T, Unit]): KnockoutSubscription = js.native
  def subscribe(callback: js.Function1[/* newValue */ T, Unit], target: js.UndefOr[scala.Nothing], event: String): KnockoutSubscription = js.native
  def subscribe(callback: js.Function1[/* newValue */ T, Unit], target: js.Any): KnockoutSubscription = js.native
  def subscribe(callback: js.Function1[/* newValue */ T, Unit], target: js.Any, event: String): KnockoutSubscription = js.native
  @JSName("subscribe")
  def subscribe_TEvent[TEvent](callback: js.Function1[/* newValue */ TEvent, Unit], target: js.Any, event: String): KnockoutSubscription = js.native
}
