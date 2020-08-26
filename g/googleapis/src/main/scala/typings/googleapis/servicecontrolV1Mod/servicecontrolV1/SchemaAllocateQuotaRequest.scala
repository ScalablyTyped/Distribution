package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the AllocateQuota method.
  */
@js.native
trait SchemaAllocateQuotaRequest extends js.Object {
  /**
    * Operation that describes the quota allocation.
    */
  var allocateOperation: js.UndefOr[SchemaQuotaOperation] = js.native
  /**
    * Specifies which version of service configuration should be used to
    * process the request. If unspecified or no matching version can be found,
    * the latest one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object SchemaAllocateQuotaRequest {
  @scala.inline
  def apply(): SchemaAllocateQuotaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocateQuotaRequest]
  }
  @scala.inline
  implicit class SchemaAllocateQuotaRequestOps[Self <: SchemaAllocateQuotaRequest] (val x: Self) extends AnyVal {
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
    def setAllocateOperation(value: SchemaQuotaOperation): Self = this.set("allocateOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocateOperation: Self = this.set("allocateOperation", js.undefined)
    @scala.inline
    def setServiceConfigId(value: String): Self = this.set("serviceConfigId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceConfigId: Self = this.set("serviceConfigId", js.undefined)
  }
  
}

