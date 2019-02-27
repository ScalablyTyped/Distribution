package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSubscribable[T] extends KnockoutSubscribableFunctions[T] {
  /**
    * Customizes observables basic functionality.
    * @param requestedExtenders Name of the extender feature and its value, e.g. { notify: 'always' }, { rateLimit: 50 }
    */
  def extend(requestedExtenders: org.scalablytyped.runtime.StringDictionary[js.Any]): KnockoutSubscribable[T] = js.native
  /**
    * Gets total number of subscribers.
    */
  def getSubscriptionsCount(): scala.Double = js.native
  /**
    * Gets number of subscribers of a particular event.
    * @param event Event name.
    */
  def getSubscriptionsCount(event: java.lang.String): scala.Double = js.native
  /**
    * Registers to be notified after the observable's value changes.
    * @param callback Function that is called whenever the notification happens.
    * @param target Defines the value of 'this' in the callback function.
    * @param event The knockout event name.
    */
  def subscribe(callback: js.Function1[/* newValue */ T, scala.Unit]): KnockoutSubscription = js.native
  def subscribe(callback: js.Function1[/* newValue */ T, scala.Unit], target: js.Any): KnockoutSubscription = js.native
  /**
    * Registers to be notified when a knockout or user defined event happens.
    * @param callback Function that is called whenever the notification happens. eventValue can be anything. No relation to underlying observable.
    * @param target Defines the value of 'this' in the callback function.
    * @param event The knockout or user defined event name.
    */
  def subscribe[U](callback: js.Function1[/* eventValue */ U, scala.Unit], target: js.Any, event: java.lang.String): KnockoutSubscription = js.native
  /**
    * Registers to be notified before the observable's value changes.
    * @param callback Function that is called whenever the notification happens.
    * @param target Defines the value of 'this' in the callback function.
    * @param event The knockout event name.
    */
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

