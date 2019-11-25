package typings.libraDashCore.libAtGeneratedMempoolUnderscoreGrpcUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ I in keyof grpc.grpc.UntypedServiceImplementation ]: grpc.grpc.MethodDefinition<any, any>} */ trait IMempoolService extends js.Object {
  var addTransactionWithValidation: IMempoolService_IAddTransactionWithValidation
  var commitTransactions: IMempoolService_ICommitTransactions
  var getBlock: IMempoolService_IGetBlock
  var healthCheck: IMempoolService_IHealthCheck
}

object IMempoolService {
  @scala.inline
  def apply(
    addTransactionWithValidation: IMempoolService_IAddTransactionWithValidation,
    commitTransactions: IMempoolService_ICommitTransactions,
    getBlock: IMempoolService_IGetBlock,
    healthCheck: IMempoolService_IHealthCheck
  ): IMempoolService = {
    val __obj = js.Dynamic.literal(addTransactionWithValidation = addTransactionWithValidation.asInstanceOf[js.Any], commitTransactions = commitTransactions.asInstanceOf[js.Any], getBlock = getBlock.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMempoolService]
  }
}

