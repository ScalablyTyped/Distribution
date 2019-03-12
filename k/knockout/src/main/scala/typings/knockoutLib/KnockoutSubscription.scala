package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutSubscription extends js.Object {
  /**
    * Terminates a subscription.
    */
  def dispose(): scala.Unit
}

object KnockoutSubscription {
  @scala.inline
  def apply(dispose: () => scala.Unit): KnockoutSubscription = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
  
    __obj.asInstanceOf[KnockoutSubscription]
  }
}

