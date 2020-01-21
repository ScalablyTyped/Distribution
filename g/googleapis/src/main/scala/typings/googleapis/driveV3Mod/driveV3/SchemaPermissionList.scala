package typings.googleapis.driveV3Mod.driveV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of permissions for a file.
  */
@js.native
trait SchemaPermissionList extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#permissionList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of permissions. This field will be
    * absent if the end of the permissions list has been reached. If the token
    * is rejected for any reason, it should be discarded, and pagination should
    * be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of permissions. If nextPageToken is populated, then this list
    * may be incomplete and an additional page of results should be fetched.
    */
  var permissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
}

object SchemaPermissionList {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, permissions: js.Array[SchemaPermission] = null): SchemaPermissionList = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPermissionList]
  }
}

