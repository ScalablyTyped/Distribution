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

@JSImport("libra-core", "LibraTransactionResponse")
@js.native
object LibraTransactionResponse extends js.Object {
  def apply(signedTransaction: LibraSignedTransaction, validatorId: Uint8Array): Unit = js.native
  def apply(signedTransaction: LibraSignedTransaction, validatorId: Uint8Array, acStatus: Double): Unit = js.native
  def apply(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: Double,
    mempoolStatus: Double
  ): Unit = js.native
  def apply(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: Double,
    mempoolStatus: Double,
    vmStatus: LibraVMStatusError
  ): Unit = js.native
  def apply(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: Double,
    mempoolStatus: LibraMempoolTransactionStatus
  ): Unit = js.native
  def apply(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: Double,
    mempoolStatus: LibraMempoolTransactionStatus,
    vmStatus: LibraVMStatusError
  ): Unit = js.native
  def apply(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: LibraAdmissionControlStatus
  ): Unit = js.native
  def apply(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: LibraAdmissionControlStatus,
    mempoolStatus: Double
  ): Unit = js.native
  def apply(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: LibraAdmissionControlStatus,
    mempoolStatus: Double,
    vmStatus: LibraVMStatusError
  ): Unit = js.native
  def apply(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: LibraAdmissionControlStatus,
    mempoolStatus: LibraMempoolTransactionStatus
  ): Unit = js.native
  def apply(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: LibraAdmissionControlStatus,
    mempoolStatus: LibraMempoolTransactionStatus,
    vmStatus: LibraVMStatusError
  ): Unit = js.native
  def awaitConfirmation(client: LibraClient): js.Promise[Unit] = js.native
}

