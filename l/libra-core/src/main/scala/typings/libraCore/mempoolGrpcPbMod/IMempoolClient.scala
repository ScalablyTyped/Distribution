package typings.libraCore.mempoolGrpcPbMod

import typings.grpc.mod.ClientUnaryCall
import typings.grpc.mod.Metadata
import typings.grpc.mod.ServiceError
import typings.libraCore.anon.PartialCallOptions
import typings.libraCore.mempoolPbMod.AddTransactionWithValidationRequest
import typings.libraCore.mempoolPbMod.AddTransactionWithValidationResponse
import typings.libraCore.mempoolPbMod.CommitTransactionsRequest
import typings.libraCore.mempoolPbMod.CommitTransactionsResponse
import typings.libraCore.mempoolPbMod.GetBlockRequest
import typings.libraCore.mempoolPbMod.GetBlockResponse
import typings.libraCore.mempoolPbMod.HealthCheckRequest
import typings.libraCore.mempoolPbMod.HealthCheckResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    options: PartialCallOptions,
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
    options: PartialCallOptions,
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
    options: PartialCallOptions,
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
    options: PartialCallOptions,
    callback: js.Function2[/* error */ ServiceError | Null, /* response */ HealthCheckResponse, Unit]
  ): ClientUnaryCall = js.native
}
