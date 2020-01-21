package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a user role permission.
  */
@js.native
trait SchemaUserRolePermission extends js.Object {
  /**
    * Levels of availability for a user role permission.
    */
  var availability: js.UndefOr[String] = js.native
  /**
    * ID of this user role permission.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolePermission&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this user role permission.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * ID of the permission group that this user role permission belongs to.
    */
  var permissionGroupId: js.UndefOr[String] = js.native
}

object SchemaUserRolePermission {
  @scala.inline
  def apply(
    availability: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    permissionGroupId: String = null
  ): SchemaUserRolePermission = {
    val __obj = js.Dynamic.literal()
    if (availability != null) __obj.updateDynamic("availability")(availability.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissionGroupId != null) __obj.updateDynamic("permissionGroupId")(permissionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserRolePermission]
  }
}

