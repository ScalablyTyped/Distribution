package typings.libraDashCore.libraDashCoreMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraTransactionResponse extends js.Object {
  var acStatus: js.UndefOr[LibraAdmissionControlStatus | Double] = js.undefined
  var mempoolStatus: js.UndefOr[LibraMempoolTransactionStatus | Double] = js.undefined
  var signedTransaction: LibraSignedTransaction
  var validatorId: Uint8Array
  var vmStatus: js.UndefOr[LibraVMStatusError] = js.undefined
  def awaitConfirmation(client: LibraClient): js.Promise[Unit]
}

object LibraTransactionResponse {
  @scala.inline
  def apply(
    awaitConfirmation: LibraClient => js.Promise[Unit],
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: LibraAdmissionControlStatus | Double = null,
    mempoolStatus: LibraMempoolTransactionStatus | Double = null,
    vmStatus: LibraVMStatusError = null
  ): LibraTransactionResponse = {
    val __obj = js.Dynamic.literal(awaitConfirmation = js.Any.fromFunction1(awaitConfirmation), signedTransaction = signedTransaction, validatorId = validatorId)
    if (acStatus != null) __obj.updateDynamic("acStatus")(acStatus.asInstanceOf[js.Any])
    if (mempoolStatus != null) __obj.updateDynamic("mempoolStatus")(mempoolStatus.asInstanceOf[js.Any])
    if (vmStatus != null) __obj.updateDynamic("vmStatus")(vmStatus)
    __obj.asInstanceOf[LibraTransactionResponse]
  }
}

