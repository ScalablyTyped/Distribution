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
  def apply(allocateOperation: SchemaQuotaOperation = null, serviceConfigId: String = null): SchemaAllocateQuotaRequest = {
    val __obj = js.Dynamic.literal()
    if (allocateOperation != null) __obj.updateDynamic("allocateOperation")(allocateOperation.asInstanceOf[js.Any])
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAllocateQuotaRequest]
  }
}

