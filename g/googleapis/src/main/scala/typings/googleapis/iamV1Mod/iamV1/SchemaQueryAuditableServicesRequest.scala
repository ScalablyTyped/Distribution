package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to get the list of auditable services for a resource.
  */
@js.native
trait SchemaQueryAuditableServicesRequest extends js.Object {
  /**
    * Required. The full resource name to query from the list of auditable
    * services.  The name follows the Google Cloud Platform resource format.
    * For example, a Cloud Platform project with id `my-project` will be named
    * `//cloudresourcemanager.googleapis.com/projects/my-project`.
    */
  var fullResourceName: js.UndefOr[String] = js.native
}

object SchemaQueryAuditableServicesRequest {
  @scala.inline
  def apply(fullResourceName: String = null): SchemaQueryAuditableServicesRequest = {
    val __obj = js.Dynamic.literal()
    if (fullResourceName != null) __obj.updateDynamic("fullResourceName")(fullResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryAuditableServicesRequest]
  }
}

