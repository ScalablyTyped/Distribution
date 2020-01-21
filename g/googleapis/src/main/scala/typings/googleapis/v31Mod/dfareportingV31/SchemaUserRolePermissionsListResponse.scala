package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User Role Permission List Response
  */
@js.native
trait SchemaUserRolePermissionsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolePermissionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * User role permission collection.
    */
  var userRolePermissions: js.UndefOr[js.Array[SchemaUserRolePermission]] = js.native
}

object SchemaUserRolePermissionsListResponse {
  @scala.inline
  def apply(kind: String = null, userRolePermissions: js.Array[SchemaUserRolePermission] = null): SchemaUserRolePermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (userRolePermissions != null) __obj.updateDynamic("userRolePermissions")(userRolePermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserRolePermissionsListResponse]
  }
}

