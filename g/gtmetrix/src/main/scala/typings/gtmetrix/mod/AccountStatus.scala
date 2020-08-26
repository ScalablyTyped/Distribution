package typings.gtmetrix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountStatus extends js.Object {
  var api_credits: Double = js.native
  var api_refill: Double = js.native
}

object AccountStatus {
  @scala.inline
  def apply(api_credits: Double, api_refill: Double): AccountStatus = {
    val __obj = js.Dynamic.literal(api_credits = api_credits.asInstanceOf[js.Any], api_refill = api_refill.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountStatus]
  }
  @scala.inline
  implicit class AccountStatusOps[Self <: AccountStatus] (val x: Self) extends AnyVal {
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
    def setApi_credits(value: Double): Self = this.set("api_credits", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi_refill(value: Double): Self = this.set("api_refill", value.asInstanceOf[js.Any])
  }
  
}

