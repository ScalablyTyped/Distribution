package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraTransactionResponse extends js.Object {
  var acStatus: js.UndefOr[LibraAdmissionControlStatus | scala.Double] = js.undefined
  var mempoolStatus: js.UndefOr[LibraMempoolTransactionStatus | scala.Double] = js.undefined
  var signedTransaction: LibraSignedTransaction
  var validatorId: stdLib.Uint8Array
  var vmStatus: js.UndefOr[LibraVMStatusError] = js.undefined
}

object LibraTransactionResponse {
  @scala.inline
  def apply(
    signedTransaction: LibraSignedTransaction,
    validatorId: stdLib.Uint8Array,
    acStatus: LibraAdmissionControlStatus | scala.Double = null,
    mempoolStatus: LibraMempoolTransactionStatus | scala.Double = null,
    vmStatus: LibraVMStatusError = null
  ): LibraTransactionResponse = {
    val __obj = js.Dynamic.literal(signedTransaction = signedTransaction, validatorId = validatorId)
    if (acStatus != null) __obj.updateDynamic("acStatus")(acStatus.asInstanceOf[js.Any])
    if (mempoolStatus != null) __obj.updateDynamic("mempoolStatus")(mempoolStatus.asInstanceOf[js.Any])
    if (vmStatus != null) __obj.updateDynamic("vmStatus")(vmStatus)
    __obj.asInstanceOf[LibraTransactionResponse]
  }
}

