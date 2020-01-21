package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for `ListServices` method.
  */
@js.native
trait SchemaListServicesResponse extends js.Object {
  /**
    * Token that can be passed to `ListServices` to resume a paginated query.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The returned services will only have the name field set.
    */
  var services: js.UndefOr[js.Array[SchemaManagedService]] = js.native
}

object SchemaListServicesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, services: js.Array[SchemaManagedService] = null): SchemaListServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListServicesResponse]
  }
}

