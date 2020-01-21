package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response containing a list of auditable services for a resource.
  */
@js.native
trait SchemaQueryAuditableServicesResponse extends js.Object {
  /**
    * The auditable services for a resource.
    */
  var services: js.UndefOr[js.Array[SchemaAuditableService]] = js.native
}

object SchemaQueryAuditableServicesResponse {
  @scala.inline
  def apply(services: js.Array[SchemaAuditableService] = null): SchemaQueryAuditableServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryAuditableServicesResponse]
  }
}

