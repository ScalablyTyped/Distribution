package typings.libraCore.getWithProofPbMod.UpdateToLatestLedgerResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var ledgerInfoWithSigs: js.UndefOr[typings.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject] = js.undefined
  var responseItemsList: js.Array[typings.libraCore.getWithProofPbMod.ResponseItem.AsObject]
  var validatorChangeEventsList: js.Array[typings.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    responseItemsList: js.Array[typings.libraCore.getWithProofPbMod.ResponseItem.AsObject],
    validatorChangeEventsList: js.Array[typings.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof.AsObject],
    ledgerInfoWithSigs: typings.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(responseItemsList = responseItemsList.asInstanceOf[js.Any], validatorChangeEventsList = validatorChangeEventsList.asInstanceOf[js.Any])
    if (ledgerInfoWithSigs != null) __obj.updateDynamic("ledgerInfoWithSigs")(ledgerInfoWithSigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

