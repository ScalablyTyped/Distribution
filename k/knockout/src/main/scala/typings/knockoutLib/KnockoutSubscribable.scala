package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSubscribable[T] extends KnockoutSubscribableFunctions[T] {
  def extend(requestedExtenders: ScalablyTyped.runtime.StringDictionary[js.Any]): KnockoutSubscribable[T] = js.native
  def getSubscriptionsCount(): scala.Double = js.native
  def subscribe(callback: js.Function1[/* newValue */ T, scala.Unit]): KnockoutSubscription = js.native
  def subscribe(callback: js.Function1[/* newValue */ T, scala.Unit], target: js.Any): KnockoutSubscription = js.native
  def subscribe[TEvent](callback: js.Function1[/* newValue */ TEvent, scala.Unit], target: js.Any, event: java.lang.String): KnockoutSubscription = js.native
  @JSName("subscribe")
  def subscribe_beforeChange(
    callback: js.Function1[/* newValue */ T, scala.Unit],
    target: js.Any,
    event: knockoutLib.knockoutLibStrings.beforeChange
  ): KnockoutSubscription = js.native
  @JSName("subscribe")
  def subscribe_change(
    callback: js.Function1[/* newValue */ T, scala.Unit],
    target: js.Any,
    event: knockoutLib.knockoutLibStrings.change
  ): KnockoutSubscription = js.native
}

