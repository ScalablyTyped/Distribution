package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response containing the roles defined under a resource.
  */
@js.native
trait SchemaListRolesResponse extends js.Object {
  /**
    * To retrieve the next page of results, set `ListRolesRequest.page_token`
    * to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The Roles defined on this resource.
    */
  var roles: js.UndefOr[js.Array[SchemaRole]] = js.native
}

object SchemaListRolesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, roles: js.Array[SchemaRole] = null): SchemaListRolesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListRolesResponse]
  }
}

