package typings.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var proofOfCurrentSequenceNumber: js.UndefOr[typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject] = js.native
  var signedTransactionWithProof: js.UndefOr[typings.libraCore.transactionPbMod.SignedTransactionWithProof.AsObject] = js.native
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
    def setProofOfCurrentSequenceNumber(value: typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject): Self = this.set("proofOfCurrentSequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProofOfCurrentSequenceNumber: Self = this.set("proofOfCurrentSequenceNumber", js.undefined)
    @scala.inline
    def setSignedTransactionWithProof(value: typings.libraCore.transactionPbMod.SignedTransactionWithProof.AsObject): Self = this.set("signedTransactionWithProof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignedTransactionWithProof: Self = this.set("signedTransactionWithProof", js.undefined)
  }
  
}

