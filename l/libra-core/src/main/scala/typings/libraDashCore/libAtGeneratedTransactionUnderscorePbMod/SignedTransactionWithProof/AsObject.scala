package typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransactionWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var events: js.UndefOr[typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod.EventsList.AsObject] = js.undefined
  var proof: js.UndefOr[
    typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.SignedTransactionProof.AsObject
  ] = js.undefined
  var signedTransaction: js.UndefOr[
    typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject
  ] = js.undefined
  var version: String
}

object AsObject {
  @scala.inline
  def apply(
    version: String,
    events: typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod.EventsList.AsObject = null,
    proof: typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.SignedTransactionProof.AsObject = null,
    signedTransaction: typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (proof != null) __obj.updateDynamic("proof")(proof.asInstanceOf[js.Any])
    if (signedTransaction != null) __obj.updateDynamic("signedTransaction")(signedTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

