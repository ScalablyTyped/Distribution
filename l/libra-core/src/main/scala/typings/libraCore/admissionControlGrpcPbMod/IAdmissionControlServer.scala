package typings.libraCore.admissionControlGrpcPbMod

import typings.grpc.mod.ServerUnaryCall
import typings.grpc.mod.handleUnaryCall
import typings.grpc.mod.sendUnaryData
import typings.libraCore.admissionControlPbMod.SubmitTransactionRequest
import typings.libraCore.admissionControlPbMod.SubmitTransactionResponse
import typings.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest
import typings.libraCore.getWithProofPbMod.UpdateToLatestLedgerResponse
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

