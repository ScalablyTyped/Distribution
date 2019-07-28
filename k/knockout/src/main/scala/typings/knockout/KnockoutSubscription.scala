package typings.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutSubscription extends js.Object {
  /**
    * Terminates a subscription.
    */
  def dispose(): Unit
}

object KnockoutSubscription {
  @scala.inline
  def apply(dispose: () => Unit): KnockoutSubscription = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
  
    __obj.asInstanceOf[KnockoutSubscription]
  }
}

