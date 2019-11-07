package typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscoreGrpcUnderscorePbMod

import typings.grpc.grpcMod.CallOptions
import typings.grpc.grpcMod.ClientUnaryCall
import typings.grpc.grpcMod.Metadata
import typings.grpc.grpcMod.ServiceError
import typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.SubmitTransactionRequest
import typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.SubmitTransactionResponse
import typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.UpdateToLatestLedgerRequest
import typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.UpdateToLatestLedgerResponse
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

