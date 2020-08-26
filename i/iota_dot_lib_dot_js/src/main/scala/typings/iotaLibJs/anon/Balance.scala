package typings.iotaLibJs.anon

import typings.iotaLibJs.mod.InputObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Balance extends js.Object {
  var addresses: js.Array[String] = js.native
  var balance: Double = js.native
  var inputs: js.Array[InputObject] = js.native
  var latestAddress: String = js.native
  var transfers: js.Array[String] = js.native
}

object Balance {
  @scala.inline
  def apply(
    addresses: js.Array[String],
    balance: Double,
    inputs: js.Array[InputObject],
    latestAddress: String,
    transfers: js.Array[String]
  ): Balance = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], latestAddress = latestAddress.asInstanceOf[js.Any], transfers = transfers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Balance]
  }
  @scala.inline
  implicit class BalanceOps[Self <: Balance] (val x: Self) extends AnyVal {
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
    def setAddressesVarargs(value: String*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalance(value: Double): Self = this.set("balance", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputsVarargs(value: InputObject*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[InputObject]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatestAddress(value: String): Self = this.set("latestAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransfersVarargs(value: String*): Self = this.set("transfers", js.Array(value :_*))
    @scala.inline
    def setTransfers(value: js.Array[String]): Self = this.set("transfers", value.asInstanceOf[js.Any])
  }
  
}

