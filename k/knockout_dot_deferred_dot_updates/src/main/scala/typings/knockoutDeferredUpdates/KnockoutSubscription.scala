package typings.knockoutDeferredUpdates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSubscription extends js.Object {
  var deferUpdates: Boolean = js.native
}

object KnockoutSubscription {
  @scala.inline
  def apply(deferUpdates: Boolean): KnockoutSubscription = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutSubscription]
  }
  @scala.inline
  implicit class KnockoutSubscriptionOps[Self <: KnockoutSubscription] (val x: Self) extends AnyVal {
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
    def setDeferUpdates(value: Boolean): Self = this.set("deferUpdates", value.asInstanceOf[js.Any])
  }
  
}

