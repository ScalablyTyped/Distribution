package typings.inDashAppDashPurchase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreCanceled extends js.Object {
  var ignoreCanceled: Boolean
  var ignoreExpired: Boolean
}

object Anon_IgnoreCanceled {
  @scala.inline
  def apply(ignoreCanceled: Boolean, ignoreExpired: Boolean): Anon_IgnoreCanceled = {
    val __obj = js.Dynamic.literal(ignoreCanceled = ignoreCanceled.asInstanceOf[js.Any], ignoreExpired = ignoreExpired.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IgnoreCanceled]
  }
}

