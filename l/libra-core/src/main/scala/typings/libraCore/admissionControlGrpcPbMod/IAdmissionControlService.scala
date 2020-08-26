package typings.libraCore.admissionControlGrpcPbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent grpc.grpc.ServiceDefinition<grpc.grpc.UntypedServiceImplementation> */
@js.native
trait IAdmissionControlService extends js.Object {
  var submitTransaction: IAdmissionControlServiceISubmitTransaction = js.native
  var updateToLatestLedger: IAdmissionControlServiceIUpdateToLatestLedger = js.native
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
  @scala.inline
  implicit class IAdmissionControlServiceOps[Self <: IAdmissionControlService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSubmitTransaction(value: IAdmissionControlServiceISubmitTransaction): Self = this.set("submitTransaction", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateToLatestLedger(value: IAdmissionControlServiceIUpdateToLatestLedger): Self = this.set("updateToLatestLedger", value.asInstanceOf[js.Any])
  }
  
}

