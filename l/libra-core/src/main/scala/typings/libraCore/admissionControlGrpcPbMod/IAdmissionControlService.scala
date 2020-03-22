package typings.libraCore.admissionControlGrpcPbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent grpc.grpc.ServiceDefinition<grpc.grpc.UntypedServiceImplementation> */
trait IAdmissionControlService extends js.Object {
  var submitTransaction: IAdmissionControlServiceISubmitTransaction
  var updateToLatestLedger: IAdmissionControlServiceIUpdateToLatestLedger
}

object IAdmissionControlService {
  @scala.inline
  def apply(
    submitTransaction: IAdmissionControlServiceISubmitTransaction,
    updateToLatestLedger: IAdmissionControlServiceIUpdateToLatestLedger
  ): IAdmissionControlService = {
    val __obj = js.Dynamic.literal(submitTransaction = submitTransaction.asInstanceOf[js.Any], updateToLatestLedger = updateToLatestLedger.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAdmissionControlService]
  }
}

