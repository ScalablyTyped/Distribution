package typings.libraDashCore.libAtGeneratedValidatorUnderscoreChangeUnderscorePbMod.ValidatorChangeEventWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var eventWithProof: js.UndefOr[
    typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod.EventWithProof.AsObject
  ] = js.undefined
  var ledgerInfoWithSigs: js.UndefOr[
    typings.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.LedgerInfoWithSignatures.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    eventWithProof: typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod.EventWithProof.AsObject = null,
    ledgerInfoWithSigs: typings.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.LedgerInfoWithSignatures.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (eventWithProof != null) __obj.updateDynamic("eventWithProof")(eventWithProof)
    if (ledgerInfoWithSigs != null) __obj.updateDynamic("ledgerInfoWithSigs")(ledgerInfoWithSigs)
    __obj.asInstanceOf[AsObject]
  }
}

