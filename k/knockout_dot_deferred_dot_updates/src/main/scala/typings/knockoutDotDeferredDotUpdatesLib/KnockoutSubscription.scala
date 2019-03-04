package typings
package knockoutDotDeferredDotUpdatesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutSubscription extends js.Object {
  var deferUpdates: scala.Boolean
}

object KnockoutSubscription {
  @scala.inline
  def apply(deferUpdates: scala.Boolean): KnockoutSubscription = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates)
  
    __obj.asInstanceOf[KnockoutSubscription]
  }
}

