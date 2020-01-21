package typings.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var eventWithProof: js.UndefOr[typings.libraCore.eventsPbMod.EventWithProof.AsObject] = js.undefined
  var ledgerInfoWithSigs: js.UndefOr[typings.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    eventWithProof: typings.libraCore.eventsPbMod.EventWithProof.AsObject = null,
    ledgerInfoWithSigs: typings.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (eventWithProof != null) __obj.updateDynamic("eventWithProof")(eventWithProof.asInstanceOf[js.Any])
    if (ledgerInfoWithSigs != null) __obj.updateDynamic("ledgerInfoWithSigs")(ledgerInfoWithSigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

