package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListServiceConfigs method.
  */
@js.native
trait SchemaListServiceConfigsResponse extends js.Object {
  /**
    * The token of the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of service configuration resources.
    */
  var serviceConfigs: js.UndefOr[js.Array[SchemaService]] = js.native
}

object SchemaListServiceConfigsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, serviceConfigs: js.Array[SchemaService] = null): SchemaListServiceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (serviceConfigs != null) __obj.updateDynamic("serviceConfigs")(serviceConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListServiceConfigsResponse]
  }
}

