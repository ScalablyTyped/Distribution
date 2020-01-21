package typings.libraCore.admissionControlGrpcPbMod

import typings.grpc.mod.CallOptions
import typings.grpc.mod.ClientUnaryCall
import typings.grpc.mod.Metadata
import typings.grpc.mod.ServiceError
import typings.libraCore.admissionControlPbMod.SubmitTransactionRequest
import typings.libraCore.admissionControlPbMod.SubmitTransactionResponse
import typings.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest
import typings.libraCore.getWithProofPbMod.UpdateToLatestLedgerResponse
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAdmissionControlClient extends js.Object {
  def submitTransaction(
    request: SubmitTransactionRequest,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ SubmitTransactionResponse, Unit]
  ): ClientUnaryCall = js.native
  def submitTransaction(
    request: SubmitTransactionRequest,
    metadata: Metadata,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ SubmitTransactionResponse, Unit]
  ): ClientUnaryCall = js.native
  def submitTransaction(
    request: SubmitTransactionRequest,
    metadata: Metadata,
    options: Partial[CallOptions],
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ SubmitTransactionResponse, Unit]
  ): ClientUnaryCall = js.native
  def updateToLatestLedger(
    request: UpdateToLatestLedgerRequest,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ UpdateToLatestLedgerResponse, Unit]
  ): ClientUnaryCall = js.native
  def updateToLatestLedger(
    request: UpdateToLatestLedgerRequest,
    metadata: Metadata,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ UpdateToLatestLedgerResponse, Unit]
  ): ClientUnaryCall = js.native
  def updateToLatestLedger(
    request: UpdateToLatestLedgerRequest,
    metadata: Metadata,
    options: Partial[CallOptions],
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ UpdateToLatestLedgerResponse, Unit]
  ): ClientUnaryCall = js.native
}

