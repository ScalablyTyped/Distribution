package typings.inAppPurchase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreCanceled extends js.Object {
  var ignoreCanceled: Boolean
  var ignoreExpired: Boolean
}

object IgnoreCanceled {
  @scala.inline
  def apply(ignoreCanceled: Boolean, ignoreExpired: Boolean): IgnoreCanceled = {
    val __obj = js.Dynamic.literal(ignoreCanceled = ignoreCanceled.asInstanceOf[js.Any], ignoreExpired = ignoreExpired.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreCanceled]
  }
}

