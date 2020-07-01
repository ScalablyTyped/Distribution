package typings.headroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headroom extends js.Object {
  /** destroy the headroom instance, removing event listeners and any classes added */
  def destroy(): Unit
  /** freeze the headroom instance's state (pinned or unpinned), and no longer respond to scroll events */
  def freeze(): Unit
  /** initialise */
  def init(): Unit
  /** forcibly set the headroom instance's state to pinned */
  def pin(): Unit
  /** resume responding to scroll events */
  def unfreeze(): Unit
  /** forcibly set the headroom instance's state to unpinned */
  def unpin(): Unit
}

object Headroom {
  @scala.inline
  def apply(
    destroy: () => Unit,
    freeze: () => Unit,
    init: () => Unit,
    pin: () => Unit,
    unfreeze: () => Unit,
    unpin: () => Unit
  ): Headroom = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), freeze = js.Any.fromFunction0(freeze), init = js.Any.fromFunction0(init), pin = js.Any.fromFunction0(pin), unfreeze = js.Any.fromFunction0(unfreeze), unpin = js.Any.fromFunction0(unpin))
    __obj.asInstanceOf[Headroom]
  }
}

