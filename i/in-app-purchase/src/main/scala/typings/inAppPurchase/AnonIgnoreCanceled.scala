package typings.inAppPurchase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIgnoreCanceled extends js.Object {
  var ignoreCanceled: Boolean
  var ignoreExpired: Boolean
}

object AnonIgnoreCanceled {
  @scala.inline
  def apply(ignoreCanceled: Boolean, ignoreExpired: Boolean): AnonIgnoreCanceled = {
    val __obj = js.Dynamic.literal(ignoreCanceled = ignoreCanceled.asInstanceOf[js.Any], ignoreExpired = ignoreExpired.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoreCanceled]
  }
}

