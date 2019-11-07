package typings.libraDashCore.libAtGeneratedMempoolUnderscoreGrpcUnderscorePbMod

import typings.grpc.grpcMod.ServerUnaryCall
import typings.grpc.grpcMod.handleUnaryCall
import typings.grpc.grpcMod.sendUnaryData
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.AddTransactionWithValidationRequest
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.AddTransactionWithValidationResponse
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.CommitTransactionsRequest
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.CommitTransactionsResponse
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.GetBlockRequest
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.GetBlockResponse
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.HealthCheckRequest
import typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.HealthCheckResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMempoolServer extends js.Object {
  @JSName("addTransactionWithValidation")
  var addTransactionWithValidation_Original: handleUnaryCall[AddTransactionWithValidationRequest, AddTransactionWithValidationResponse] = js.native
  @JSName("commitTransactions")
  var commitTransactions_Original: handleUnaryCall[CommitTransactionsRequest, CommitTransactionsResponse] = js.native
  @JSName("getBlock")
  var getBlock_Original: handleUnaryCall[GetBlockRequest, GetBlockResponse] = js.native
  @JSName("healthCheck")
  var healthCheck_Original: handleUnaryCall[HealthCheckRequest, HealthCheckResponse] = js.native
  def addTransactionWithValidation(
    call: ServerUnaryCall[AddTransactionWithValidationRequest],
    callback: sendUnaryData[AddTransactionWithValidationResponse]
  ): Unit = js.native
  def commitTransactions(
    call: ServerUnaryCall[CommitTransactionsRequest],
    callback: sendUnaryData[CommitTransactionsResponse]
  ): Unit = js.native
  def getBlock(call: ServerUnaryCall[GetBlockRequest], callback: sendUnaryData[GetBlockResponse]): Unit = js.native
  def healthCheck(call: ServerUnaryCall[HealthCheckRequest], callback: sendUnaryData[HealthCheckResponse]): Unit = js.native
}

