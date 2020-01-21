package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for UndeleteService method.
  */
@js.native
trait SchemaUndeleteServiceResponse extends js.Object {
  /**
    * Revived service resource.
    */
  var service: js.UndefOr[SchemaManagedService] = js.native
}

object SchemaUndeleteServiceResponse {
  @scala.inline
  def apply(service: SchemaManagedService = null): SchemaUndeleteServiceResponse = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUndeleteServiceResponse]
  }
}

