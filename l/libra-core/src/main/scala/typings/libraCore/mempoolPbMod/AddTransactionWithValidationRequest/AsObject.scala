package typings.libraCore.mempoolPbMod.AddTransactionWithValidationRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var accountBalance: String = js.native
  var latestSequenceNumber: String = js.native
  var maxGasCost: String = js.native
  var signedTxn: js.UndefOr[typings.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(accountBalance: String, latestSequenceNumber: String, maxGasCost: String): AsObject = {
    val __obj = js.Dynamic.literal(accountBalance = accountBalance.asInstanceOf[js.Any], latestSequenceNumber = latestSequenceNumber.asInstanceOf[js.Any], maxGasCost = maxGasCost.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
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
    def setAccountBalance(value: String): Self = this.set("accountBalance", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatestSequenceNumber(value: String): Self = this.set("latestSequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxGasCost(value: String): Self = this.set("maxGasCost", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignedTxn(value: typings.libraCore.transactionPbMod.SignedTransaction.AsObject): Self = this.set("signedTxn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignedTxn: Self = this.set("signedTxn", js.undefined)
  }
  
}

