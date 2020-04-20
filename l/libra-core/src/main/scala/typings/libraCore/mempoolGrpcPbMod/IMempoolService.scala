package typings.libraCore.mempoolGrpcPbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent grpc.grpc.ServiceDefinition<grpc.grpc.UntypedServiceImplementation> */
trait IMempoolService extends js.Object {
  var addTransactionWithValidation: IMempoolServiceIAddTransactionWithValidation
  var commitTransactions: IMempoolServiceICommitTransactions
  var getBlock: IMempoolServiceIGetBlock
  var healthCheck: IMempoolServiceIHealthCheck
}

object IMempoolService {
  @scala.inline
  def apply(
    addTransactionWithValidation: IMempoolServiceIAddTransactionWithValidation,
    commitTransactions: IMempoolServiceICommitTransactions,
    getBlock: IMempoolServiceIGetBlock,
    healthCheck: IMempoolServiceIHealthCheck
  ): IMempoolService = {
    val __obj = js.Dynamic.literal(addTransactionWithValidation = addTransactionWithValidation.asInstanceOf[js.Any], commitTransactions = commitTransactions.asInstanceOf[js.Any], getBlock = getBlock.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMempoolService]
  }
}

