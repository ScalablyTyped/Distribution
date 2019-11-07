package typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscoreGrpcUnderscorePbMod

import typings.grpc.grpcMod.ServerUnaryCall
import typings.grpc.grpcMod.handleUnaryCall
import typings.grpc.grpcMod.sendUnaryData
import typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.SubmitTransactionRequest
import typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.SubmitTransactionResponse
import typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.UpdateToLatestLedgerRequest
import typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.UpdateToLatestLedgerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAdmissionControlServer extends js.Object {
  @JSName("submitTransaction")
  var submitTransaction_Original: handleUnaryCall[SubmitTransactionRequest, SubmitTransactionResponse] = js.native
  @JSName("updateToLatestLedger")
  var updateToLatestLedger_Original: handleUnaryCall[UpdateToLatestLedgerRequest, UpdateToLatestLedgerResponse] = js.native
  def submitTransaction(
    call: ServerUnaryCall[SubmitTransactionRequest],
    callback: sendUnaryData[SubmitTransactionResponse]
  ): Unit = js.native
  def updateToLatestLedger(
    call: ServerUnaryCall[UpdateToLatestLedgerRequest],
    callback: sendUnaryData[UpdateToLatestLedgerResponse]
  ): Unit = js.native
}

