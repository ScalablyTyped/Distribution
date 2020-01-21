package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to create a new role.
  */
@js.native
trait SchemaCreateRoleRequest extends js.Object {
  /**
    * The Role resource to create.
    */
  var role: js.UndefOr[SchemaRole] = js.native
  /**
    * The role id to use for this role.
    */
  var roleId: js.UndefOr[String] = js.native
}

object SchemaCreateRoleRequest {
  @scala.inline
  def apply(role: SchemaRole = null, roleId: String = null): SchemaCreateRoleRequest = {
    val __obj = js.Dynamic.literal()
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (roleId != null) __obj.updateDynamic("roleId")(roleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateRoleRequest]
  }
}

