package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for roleAssignment resource in Directory API.
  */
@js.native
trait SchemaRoleAssignment extends js.Object {
  /**
    * The unique ID of the user this role is assigned to.
    */
  var assignedTo: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The type of the API resource. This is always
    * admin#directory#roleAssignment.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * If the role is restricted to an organization unit, this contains the ID
    * for the organization unit the exercise of this role is restricted to.
    */
  var orgUnitId: js.UndefOr[String] = js.native
  /**
    * ID of this roleAssignment.
    */
  var roleAssignmentId: js.UndefOr[String] = js.native
  /**
    * The ID of the role that is assigned.
    */
  var roleId: js.UndefOr[String] = js.native
  /**
    * The scope in which this role is assigned. Possible values are:  -
    * CUSTOMER - ORG_UNIT
    */
  var scopeType: js.UndefOr[String] = js.native
}

object SchemaRoleAssignment {
  @scala.inline
  def apply(
    assignedTo: String = null,
    etag: String = null,
    kind: String = null,
    orgUnitId: String = null,
    roleAssignmentId: String = null,
    roleId: String = null,
    scopeType: String = null
  ): SchemaRoleAssignment = {
    val __obj = js.Dynamic.literal()
    if (assignedTo != null) __obj.updateDynamic("assignedTo")(assignedTo.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (orgUnitId != null) __obj.updateDynamic("orgUnitId")(orgUnitId.asInstanceOf[js.Any])
    if (roleAssignmentId != null) __obj.updateDynamic("roleAssignmentId")(roleAssignmentId.asInstanceOf[js.Any])
    if (roleId != null) __obj.updateDynamic("roleId")(roleId.asInstanceOf[js.Any])
    if (scopeType != null) __obj.updateDynamic("scopeType")(scopeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRoleAssignment]
  }
}

