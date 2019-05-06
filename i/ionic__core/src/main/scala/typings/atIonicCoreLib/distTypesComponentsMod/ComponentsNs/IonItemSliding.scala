package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonItemSliding extends js.Object {
  /**
    * If `true`, the user cannot interact with the sliding-item.
    */
  var disabled: scala.Boolean
  /**
    * Close the sliding item. Items can also be closed from the [List](../../list/List).
    */
  def close(): js.Promise[scala.Unit]
  /**
    * Close all of the sliding items in the list. Items can also be closed from the [List](../../list/List).
    */
  def closeOpened(): js.Promise[scala.Boolean]
  /**
    * Get the amount the item is open in pixels.
    */
  def getOpenAmount(): js.Promise[scala.Double]
  /**
    * Get the ratio of the open amount of the item compared to the width of the options. If the number returned is positive, then the options on the right side are open. If the number returned is negative, then the options on the left side are open. If the absolute value of the number is greater than 1, the item is open more than the width of the options.
    */
  def getSlidingRatio(): js.Promise[scala.Double]
}

object IonItemSliding {
  @scala.inline
  def apply(
    close: () => js.Promise[scala.Unit],
    closeOpened: () => js.Promise[scala.Boolean],
    disabled: scala.Boolean,
    getOpenAmount: () => js.Promise[scala.Double],
    getSlidingRatio: () => js.Promise[scala.Double]
  ): IonItemSliding = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), closeOpened = js.Any.fromFunction0(closeOpened), disabled = disabled, getOpenAmount = js.Any.fromFunction0(getOpenAmount), getSlidingRatio = js.Any.fromFunction0(getSlidingRatio))
  
    __obj.asInstanceOf[IonItemSliding]
  }
}

