package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response containing a partial list of resources and a page token used to
  * build the next request if the request has been truncated.
  */
@js.native
trait SchemaResourcesListResponse extends js.Object {
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Resources contained in this list response.
    */
  var resources: js.UndefOr[js.Array[SchemaResource]] = js.native
}

object SchemaResourcesListResponse {
  @scala.inline
  def apply(nextPageToken: String = null, resources: js.Array[SchemaResource] = null): SchemaResourcesListResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourcesListResponse]
  }
}

