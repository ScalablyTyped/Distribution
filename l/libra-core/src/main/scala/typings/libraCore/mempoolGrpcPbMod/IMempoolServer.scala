package typings.libraCore.mempoolGrpcPbMod

import typings.grpc.mod.ServerUnaryCall
import typings.grpc.mod.handleUnaryCall
import typings.grpc.mod.sendUnaryData
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

