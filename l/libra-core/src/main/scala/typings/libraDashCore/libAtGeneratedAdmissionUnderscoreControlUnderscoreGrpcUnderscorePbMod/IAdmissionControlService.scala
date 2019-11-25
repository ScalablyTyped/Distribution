package typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscoreGrpcUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ I in keyof grpc.grpc.UntypedServiceImplementation ]: grpc.grpc.MethodDefinition<any, any>} */ trait IAdmissionControlService extends js.Object {
  var submitTransaction: IAdmissionControlService_ISubmitTransaction
  var updateToLatestLedger: IAdmissionControlService_IUpdateToLatestLedger
}

object IAdmissionControlService {
  @scala.inline
  def apply(
    submitTransaction: IAdmissionControlService_ISubmitTransaction,
    updateToLatestLedger: IAdmissionControlService_IUpdateToLatestLedger
  ): IAdmissionControlService = {
    val __obj = js.Dynamic.literal(submitTransaction = submitTransaction.asInstanceOf[js.Any], updateToLatestLedger = updateToLatestLedger.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAdmissionControlService]
  }
}

