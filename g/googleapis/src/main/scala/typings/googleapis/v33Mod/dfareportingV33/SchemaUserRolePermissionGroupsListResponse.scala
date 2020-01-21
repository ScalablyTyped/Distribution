package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User Role Permission Group List Response
  */
@js.native
trait SchemaUserRolePermissionGroupsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolePermissionGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * User role permission group collection.
    */
  var userRolePermissionGroups: js.UndefOr[js.Array[SchemaUserRolePermissionGroup]] = js.native
}

object SchemaUserRolePermissionGroupsListResponse {
  @scala.inline
  def apply(kind: String = null, userRolePermissionGroups: js.Array[SchemaUserRolePermissionGroup] = null): SchemaUserRolePermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (userRolePermissionGroups != null) __obj.updateDynamic("userRolePermissionGroups")(userRolePermissionGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserRolePermissionGroupsListResponse]
  }
}

