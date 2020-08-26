package typings.libraCore.proofPbMod.SignedTransactionProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var ledgerInfoToTransactionInfoProof: js.UndefOr[typings.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.native
  var transactionInfo: js.UndefOr[typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(): AsObject = {
    val __obj = js.Dynamic.literal()
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
    def setLedgerInfoToTransactionInfoProof(value: typings.libraCore.proofPbMod.AccumulatorProof.AsObject): Self = this.set("ledgerInfoToTransactionInfoProof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLedgerInfoToTransactionInfoProof: Self = this.set("ledgerInfoToTransactionInfoProof", js.undefined)
    @scala.inline
    def setTransactionInfo(value: typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject): Self = this.set("transactionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionInfo: Self = this.set("transactionInfo", js.undefined)
  }
  
}

