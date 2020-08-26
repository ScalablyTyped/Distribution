package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.address.AddressData
import typings.mangopay2NodejsSdk.mod.models.Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingData extends js.Object {
  var Address: typings.mangopay2NodejsSdk.mod.models.Address | AddressData | String = js.native
}

object BillingData {
  @scala.inline
  def apply(Address: Address | AddressData | String): BillingData = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingData]
  }
  @scala.inline
  implicit class BillingDataOps[Self <: BillingData] (val x: Self) extends AnyVal {
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
    def setAddress(value: Address | AddressData | String): Self = this.set("Address", value.asInstanceOf[js.Any])
  }
  
}

