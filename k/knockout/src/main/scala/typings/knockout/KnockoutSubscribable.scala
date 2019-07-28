package typings.knockout

import org.scalablytyped.runtime.StringDictionary
import typings.knockout.knockoutStrings.beforeChange
import typings.knockout.knockoutStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSubscribable[T] extends KnockoutSubscribableFunctions[T] {
  /**
    * Customizes observables basic functionality.
    * @param requestedExtenders Name of the extender feature and its value, e.g. { notify: 'always' }, { rateLimit: 50 }
    */
  def extend(requestedExtenders: StringDictionary[js.Any]): KnockoutSubscribable[T] = js.native
  /**
    * Gets total number of subscribers.
    */
  def getSubscriptionsCount(): Double = js.native
  /**
    * Gets number of subscribers of a particular event.
    * @param event Event name.
    */
  def getSubscriptionsCount(event: String): Double = js.native
  /**
    * Registers to be notified after the observable's value changes.
    * @param callback Function that is called whenever the notification happens.
    * @param target Defines the value of 'this' in the callback function.
    * @param event The knockout event name.
    */
  def subscribe(callback: js.Function1[/* newValue */ T, Unit]): KnockoutSubscription = js.native
  def subscribe(callback: js.Function1[/* newValue */ T, Unit], target: js.Any): KnockoutSubscription = js.native
  /**
    * Registers to be notified when a knockout or user defined event happens.
    * @param callback Function that is called whenever the notification happens. eventValue can be anything. No relation to underlying observable.
    * @param target Defines the value of 'this' in the callback function.
    * @param event The knockout or user defined event name.
    */
  def subscribe[U](callback: js.Function1[/* eventValue */ U, Unit], target: js.Any, event: String): KnockoutSubscription = js.native
  /**
    * Registers to be notified before the observable's value changes.
    * @param callback Function that is called whenever the notification happens.
    * @param target Defines the value of 'this' in the callback function.
    * @param event The knockout event name.
    */
  @JSName("subscribe")
  def subscribe_beforeChange(callback: js.Function1[/* newValue */ T, Unit], target: js.Any, event: beforeChange): KnockoutSubscription = js.native
  @JSName("subscribe")
  def subscribe_change(callback: js.Function1[/* newValue */ T, Unit], target: js.Any, event: change): KnockoutSubscription = js.native
}

