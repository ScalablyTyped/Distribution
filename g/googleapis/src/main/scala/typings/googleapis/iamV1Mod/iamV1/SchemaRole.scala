package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A role in the Identity and Access Management API.
  */
@js.native
trait SchemaRole extends js.Object {
  /**
    * The current deleted state of the role. This field is read only. It will
    * be ignored in calls to CreateRole and UpdateRole.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  A human-readable description for the role.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Used to perform a consistent read-modify-write.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The names of the permissions this role grants when bound in an IAM
    * policy.
    */
  var includedPermissions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the role.  When Role is used in CreateRole, the role name
    * must not be set.  When Role is used in output and other input such as
    * UpdateRole, the role name is the complete path, e.g.,
    * roles/logging.viewer for curated roles and
    * organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The current launch stage of the role. If the `ALPHA` launch stage has
    * been selected for a role, the `stage` field will not be included in the
    * returned definition for the role.
    */
  var stage: js.UndefOr[String] = js.native
  /**
    * Optional.  A human-readable title for the role.  Typically this is
    * limited to 100 UTF-8 bytes.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaRole {
  @scala.inline
  def apply(): SchemaRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRole]
  }
  @scala.inline
  implicit class SchemaRoleOps[Self <: SchemaRole] (val x: Self) extends AnyVal {
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
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setIncludedPermissionsVarargs(value: String*): Self = this.set("includedPermissions", js.Array(value :_*))
    @scala.inline
    def setIncludedPermissions(value: js.Array[String]): Self = this.set("includedPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludedPermissions: Self = this.set("includedPermissions", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

