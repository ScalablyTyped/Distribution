package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A change of the permission setting on an item.
  */
@js.native
trait SchemaPermissionChange extends js.Object {
  /**
    * The set of permissions added by this change.
    */
  var addedPermissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
  /**
    * The set of permissions removed by this change.
    */
  var removedPermissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
}

object SchemaPermissionChange {
  @scala.inline
  def apply(
    addedPermissions: js.Array[SchemaPermission] = null,
    removedPermissions: js.Array[SchemaPermission] = null
  ): SchemaPermissionChange = {
    val __obj = js.Dynamic.literal()
    if (addedPermissions != null) __obj.updateDynamic("addedPermissions")(addedPermissions.asInstanceOf[js.Any])
    if (removedPermissions != null) __obj.updateDynamic("removedPermissions")(removedPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPermissionChange]
  }
}

