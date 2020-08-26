package typings.libraCore.getWithProofPbMod.UpdateToLatestLedgerResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var ledgerInfoWithSigs: js.UndefOr[typings.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject] = js.native
  var responseItemsList: js.Array[typings.libraCore.getWithProofPbMod.ResponseItem.AsObject] = js.native
  var validatorChangeEventsList: js.Array[typings.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    responseItemsList: js.Array[typings.libraCore.getWithProofPbMod.ResponseItem.AsObject],
    validatorChangeEventsList: js.Array[typings.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(responseItemsList = responseItemsList.asInstanceOf[js.Any], validatorChangeEventsList = validatorChangeEventsList.asInstanceOf[js.Any])
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
    def setResponseItemsListVarargs(value: typings.libraCore.getWithProofPbMod.ResponseItem.AsObject*): Self = this.set("responseItemsList", js.Array(value :_*))
    @scala.inline
    def setResponseItemsList(value: js.Array[typings.libraCore.getWithProofPbMod.ResponseItem.AsObject]): Self = this.set("responseItemsList", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidatorChangeEventsListVarargs(value: typings.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof.AsObject*): Self = this.set("validatorChangeEventsList", js.Array(value :_*))
    @scala.inline
    def setValidatorChangeEventsList(value: js.Array[typings.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof.AsObject]): Self = this.set("validatorChangeEventsList", value.asInstanceOf[js.Any])
    @scala.inline
    def setLedgerInfoWithSigs(value: typings.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject): Self = this.set("ledgerInfoWithSigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLedgerInfoWithSigs: Self = this.set("ledgerInfoWithSigs", js.undefined)
  }
  
}

