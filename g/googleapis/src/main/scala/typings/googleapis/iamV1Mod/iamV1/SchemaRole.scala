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
  def apply(
    deleted: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    etag: String = null,
    includedPermissions: js.Array[String] = null,
    name: String = null,
    stage: String = null,
    title: String = null
  ): SchemaRole = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (includedPermissions != null) __obj.updateDynamic("includedPermissions")(includedPermissions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRole]
  }
}

