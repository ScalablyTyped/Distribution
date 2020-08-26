package typings.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var ledgerInfo: js.UndefOr[typings.libraCore.ledgerInfoPbMod.LedgerInfo.AsObject] = js.native
  var signaturesList: js.Array[typings.libraCore.ledgerInfoPbMod.ValidatorSignature.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(signaturesList: js.Array[typings.libraCore.ledgerInfoPbMod.ValidatorSignature.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(signaturesList = signaturesList.asInstanceOf[js.Any])
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
    def setSignaturesListVarargs(value: typings.libraCore.ledgerInfoPbMod.ValidatorSignature.AsObject*): Self = this.set("signaturesList", js.Array(value :_*))
    @scala.inline
    def setSignaturesList(value: js.Array[typings.libraCore.ledgerInfoPbMod.ValidatorSignature.AsObject]): Self = this.set("signaturesList", value.asInstanceOf[js.Any])
    @scala.inline
    def setLedgerInfo(value: typings.libraCore.ledgerInfoPbMod.LedgerInfo.AsObject): Self = this.set("ledgerInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLedgerInfo: Self = this.set("ledgerInfo", js.undefined)
  }
  
}

