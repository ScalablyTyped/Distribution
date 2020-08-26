package typings.inAppPurchase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreCanceled extends js.Object {
  var ignoreCanceled: Boolean = js.native
  var ignoreExpired: Boolean = js.native
}

object IgnoreCanceled {
  @scala.inline
  def apply(ignoreCanceled: Boolean, ignoreExpired: Boolean): IgnoreCanceled = {
    val __obj = js.Dynamic.literal(ignoreCanceled = ignoreCanceled.asInstanceOf[js.Any], ignoreExpired = ignoreExpired.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreCanceled]
  }
  @scala.inline
  implicit class IgnoreCanceledOps[Self <: IgnoreCanceled] (val x: Self) extends AnyVal {
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
    def setIgnoreCanceled(value: Boolean): Self = this.set("ignoreCanceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreExpired(value: Boolean): Self = this.set("ignoreExpired", value.asInstanceOf[js.Any])
  }
  
}

