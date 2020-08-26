package typings.iotaLibJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputObject extends js.Object {
  var address: String = js.native
  var balance: Double = js.native
  var keyIndex: Double = js.native
  var security: Security = js.native
}

object InputObject {
  @scala.inline
  def apply(address: String, balance: Double, keyIndex: Double, security: Security): InputObject = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], keyIndex = keyIndex.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputObject]
  }
  @scala.inline
  implicit class InputObjectOps[Self <: InputObject] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalance(value: Double): Self = this.set("balance", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyIndex(value: Double): Self = this.set("keyIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurity(value: Security): Self = this.set("security", value.asInstanceOf[js.Any])
  }
  
}

