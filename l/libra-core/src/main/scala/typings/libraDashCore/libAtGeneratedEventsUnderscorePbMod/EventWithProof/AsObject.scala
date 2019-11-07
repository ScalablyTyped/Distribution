package typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod.EventWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var event: js.UndefOr[typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod.Event.AsObject] = js.undefined
  var eventIndex: String
  var proof: js.UndefOr[typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.EventProof.AsObject] = js.undefined
  var transactionVersion: String
}

object AsObject {
  @scala.inline
  def apply(
    eventIndex: String,
    transactionVersion: String,
    event: typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod.Event.AsObject = null,
    proof: typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.EventProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(eventIndex = eventIndex, transactionVersion = transactionVersion)
    if (event != null) __obj.updateDynamic("event")(event)
    if (proof != null) __obj.updateDynamic("proof")(proof)
    __obj.asInstanceOf[AsObject]
  }
}

