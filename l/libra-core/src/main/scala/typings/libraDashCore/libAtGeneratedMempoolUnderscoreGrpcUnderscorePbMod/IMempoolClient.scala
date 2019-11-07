package typings.libraDashCore.libAtGeneratedMempoolUnderscoreGrpcUnderscorePbMod

import typings.grpc.grpcMod.CallOptions
import typings.grpc.grpcMod.ClientUnaryCall
import typings.grpc.grpcMod.Metadata
import typings.grpc.grpcMod.ServiceError
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.AddTransactionWithValidationRequest
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.AddTransactionWithValidationResponse
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.CommitTransactionsRequest
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.CommitTransactionsResponse
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.GetBlockRequest
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.GetBlockResponse
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.HealthCheckRequest
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.HealthCheckResponse
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMempoolClient extends js.Object {
  def addTransactionWithValidation(
    request: AddTransactionWithValidationRequest,
    callback: js.Function2[
      /* error */ ServiceError | Null, 
      /* response */ AddTransactionWithValidationResponse, 
      Unit
    ]
  ): ClientUnaryCall = js.native
  def addTransactionWithValidation(
    request: AddTransactionWithValidationRequest,
    metadata: Metadata,
    callback: js.Function2[
      /* error */ ServiceError | Null, 
      /* response */ AddTransactionWithValidationResponse, 
      Unit
    ]
  ): ClientUnaryCall = js.native
  def addTransactionWithValidation(
    request: AddTransactionWithValidationRequest,
    metadata: Metadata,
    options: Partial[CallOptions],
    callback: js.Function2[
      /* error */ ServiceError | Null, 
      /* response */ AddTransactionWithValidationResponse, 
      Unit
    ]
  ): ClientUnaryCall = js.native
  def commitTransactions(
    request: CommitTransactionsRequest,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ CommitTransactionsResponse, Unit]
  ): ClientUnaryCall = js.native
  def commitTransactions(
    request: CommitTransactionsRequest,
    metadata: Metadata,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ CommitTransactionsResponse, Unit]
  ): ClientUnaryCall = js.native
  def commitTransactions(
    request: CommitTransactionsRequest,
    metadata: Metadata,
    options: Partial[CallOptions],
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ CommitTransactionsResponse, Unit]
  ): ClientUnaryCall = js.native
  def getBlock(
    request: GetBlockRequest,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ GetBlockResponse, Unit]
  ): ClientUnaryCall = js.native
  def getBlock(
    request: GetBlockRequest,
    metadata: Metadata,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ GetBlockResponse, Unit]
  ): ClientUnaryCall = js.native
  def getBlock(
    request: GetBlockRequest,
    metadata: Metadata,
    options: Partial[CallOptions],
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ GetBlockResponse, Unit]
  ): ClientUnaryCall = js.native
  def healthCheck(
    request: HealthCheckRequest,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ HealthCheckResponse, Unit]
  ): ClientUnaryCall = js.native
  def healthCheck(
    request: HealthCheckRequest,
    metadata: Metadata,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ HealthCheckResponse, Unit]
  ): ClientUnaryCall = js.native
  def healthCheck(
    request: HealthCheckRequest,
    metadata: Metadata,
    options: Partial[CallOptions],
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ HealthCheckResponse, Unit]
  ): ClientUnaryCall = js.native
}

