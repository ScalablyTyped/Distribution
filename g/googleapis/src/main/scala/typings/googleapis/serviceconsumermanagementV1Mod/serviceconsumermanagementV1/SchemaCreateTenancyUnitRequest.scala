package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create a tenancy unit for a service consumer of a managed
  * service.
  */
@js.native
trait SchemaCreateTenancyUnitRequest extends js.Object {
  /**
    * Optional service producer-provided identifier of the tenancy unit. Must
    * be no longer than 40 characters and preferably URI friendly. If it
    * isn&#39;t provided, a UID for the tenancy unit is automatically
    * generated. The identifier must be unique across a managed service. If the
    * tenancy unit already exists for the managed service and service consumer
    * pair, calling `CreateTenancyUnit` returns the existing tenancy unit if
    * the provided identifier is identical or empty, otherwise the call fails.
    */
  var tenancyUnitId: js.UndefOr[String] = js.native
}

object SchemaCreateTenancyUnitRequest {
  @scala.inline
  def apply(tenancyUnitId: String = null): SchemaCreateTenancyUnitRequest = {
    val __obj = js.Dynamic.literal()
    if (tenancyUnitId != null) __obj.updateDynamic("tenancyUnitId")(tenancyUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateTenancyUnitRequest]
  }
}

