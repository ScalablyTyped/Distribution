package typings.googleapis.v33Mod.dfareportingV33

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
  def apply(): SchemaUserRolePermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRolePermissionsListResponse]
  }
  @scala.inline
  implicit class SchemaUserRolePermissionsListResponseOps[Self <: SchemaUserRolePermissionsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setUserRolePermissionsVarargs(value: SchemaUserRolePermission*): Self = this.set("userRolePermissions", js.Array(value :_*))
    @scala.inline
    def setUserRolePermissions(value: js.Array[SchemaUserRolePermission]): Self = this.set("userRolePermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserRolePermissions: Self = this.set("userRolePermissions", js.undefined)
  }
  
}

