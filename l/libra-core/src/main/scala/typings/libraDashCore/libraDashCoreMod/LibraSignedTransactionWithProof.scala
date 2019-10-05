package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraSignedTransactionWithProof extends js.Object {
  var events: js.UndefOr[js.Array[LibraTransactionEvent]] = js.undefined
  var proof: js.UndefOr[js.Object] = js.undefined
  var signedTransaction: LibraSignedTransaction
}

@JSImport("libra-core", "LibraSignedTransactionWithProof")
@js.native
object LibraSignedTransactionWithProof extends js.Object {
  def apply(signedTransaction: LibraSignedTransaction): Unit = js.native
  def apply(signedTransaction: LibraSignedTransaction, proof: js.Object): Unit = js.native
  def apply(
    signedTransaction: LibraSignedTransaction,
    proof: js.Object,
    events: js.Array[LibraTransactionEvent]
  ): Unit = js.native
}

