package typings.knockoutDeferredUpdates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutSubscription extends js.Object {
  var deferUpdates: Boolean
}

object KnockoutSubscription {
  @scala.inline
  def apply(deferUpdates: Boolean): KnockoutSubscription = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutSubscription]
  }
}

