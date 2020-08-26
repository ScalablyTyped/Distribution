package typings.headroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headroom extends js.Object {
  /** destroy the headroom instance, removing event listeners and any classes added */
  def destroy(): Unit = js.native
  /** freeze the headroom instance's state (pinned or unpinned), and no longer respond to scroll events */
  def freeze(): Unit = js.native
  /** initialise */
  def init(): Unit = js.native
  /** forcibly set the headroom instance's state to pinned */
  def pin(): Unit = js.native
  /** resume responding to scroll events */
  def unfreeze(): Unit = js.native
  /** forcibly set the headroom instance's state to unpinned */
  def unpin(): Unit = js.native
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
  @scala.inline
  implicit class HeadroomOps[Self <: Headroom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setFreeze(value: () => Unit): Self = this.set("freeze", js.Any.fromFunction0(value))
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setPin(value: () => Unit): Self = this.set("pin", js.Any.fromFunction0(value))
    @scala.inline
    def setUnfreeze(value: () => Unit): Self = this.set("unfreeze", js.Any.fromFunction0(value))
    @scala.inline
    def setUnpin(value: () => Unit): Self = this.set("unpin", js.Any.fromFunction0(value))
  }
  
}

