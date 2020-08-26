package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPayOutPaymentType extends js.Object {
  var BankWire: BANK_WIRE = js.native
}

object IPayOutPaymentType {
  @scala.inline
  def apply(BankWire: BANK_WIRE): IPayOutPaymentType = {
    val __obj = js.Dynamic.literal(BankWire = BankWire.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPayOutPaymentType]
  }
  @scala.inline
  implicit class IPayOutPaymentTypeOps[Self <: IPayOutPaymentType] (val x: Self) extends AnyVal {
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
    def setBankWire(value: BANK_WIRE): Self = this.set("BankWire", value.asInstanceOf[js.Any])
  }
  
}

