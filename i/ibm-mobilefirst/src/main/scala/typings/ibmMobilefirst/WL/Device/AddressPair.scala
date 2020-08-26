package typings.ibmMobilefirst.WL.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressPair extends js.Object {
  var `3GAddress`: String = js.native
  var wifiAddress: String = js.native
}

object AddressPair {
  @scala.inline
  def apply(`3GAddress`: String, wifiAddress: String): AddressPair = {
    val __obj = js.Dynamic.literal(wifiAddress = wifiAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("3GAddress")(`3GAddress`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressPair]
  }
  @scala.inline
  implicit class AddressPairOps[Self <: AddressPair] (val x: Self) extends AnyVal {
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
    def set3GAddress(value: String): Self = this.set("3GAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setWifiAddress(value: String): Self = this.set("wifiAddress", value.asInstanceOf[js.Any])
  }
  
}

