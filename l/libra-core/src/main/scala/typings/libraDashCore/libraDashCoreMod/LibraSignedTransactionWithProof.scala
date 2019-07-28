package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraSignedTransactionWithProof extends js.Object {
  var events: js.UndefOr[js.Array[LibraTransactionEvent]] = js.undefined
  var proof: js.UndefOr[js.Object] = js.undefined
  var signedTransaction: LibraSignedTransaction
}

object LibraSignedTransactionWithProof {
  @scala.inline
  def apply(
    signedTransaction: LibraSignedTransaction,
    events: js.Array[LibraTransactionEvent] = null,
    proof: js.Object = null
  ): LibraSignedTransactionWithProof = {
    val __obj = js.Dynamic.literal(signedTransaction = signedTransaction)
    if (events != null) __obj.updateDynamic("events")(events)
    if (proof != null) __obj.updateDynamic("proof")(proof)
    __obj.asInstanceOf[LibraSignedTransactionWithProof]
  }
}

