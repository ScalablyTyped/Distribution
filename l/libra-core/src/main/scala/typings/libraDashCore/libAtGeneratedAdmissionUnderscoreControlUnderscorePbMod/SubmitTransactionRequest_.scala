package typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionRequest")
@js.native
class SubmitTransactionRequest_ () extends Message {
  def clearSignedTxn(): Unit = js.native
  def getSignedTxn(): js.UndefOr[SignedTransaction] = js.native
  def hasSignedTxn(): Boolean = js.native
  def setSignedTxn(): Unit = js.native
  def setSignedTxn(value: SignedTransaction): Unit = js.native
}

