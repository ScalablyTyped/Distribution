package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response containing permissions which can be tested on a resource.
  */
@js.native
trait SchemaQueryTestablePermissionsResponse extends js.Object {
  /**
    * To retrieve the next page of results, set
    * `QueryTestableRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The Permissions testable on the requested resource.
    */
  var permissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
}

object SchemaQueryTestablePermissionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, permissions: js.Array[SchemaPermission] = null): SchemaQueryTestablePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryTestablePermissionsResponse]
  }
}

