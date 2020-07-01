package typings.googleapis.driveV3Mod.driveV3

import typings.googleapis.anon.InheritedFrom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A permission for a file. A permission grants a user, group, domain or the
  * world access to a file or a folder hierarchy.
  */
@js.native
trait SchemaPermission extends js.Object {
  /**
    * Whether the permission allows the file to be discovered through search.
    * This is only applicable for permissions of type domain or anyone.
    */
  var allowFileDiscovery: js.UndefOr[Boolean] = js.native
  /**
    * Whether the account associated with this permission has been deleted.
    * This field only pertains to user and group permissions.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * A displayable name for users, groups or domains.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The domain to which this permission refers.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * The email address of the user or group to which this permission refers.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * The time at which this permission will expire (RFC 3339 date-time).
    * Expiration times have the following restrictions:   - They can only be
    * set on user and group permissions  - The time must be in the future  -
    * The time cannot be more than a year in the future
    */
  var expirationTime: js.UndefOr[String] = js.native
  /**
    * The ID of this permission. This is a unique identifier for the grantee,
    * and is published in User resources as permissionId.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#permission&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A link to the user&#39;s profile photo, if available.
    */
  var photoLink: js.UndefOr[String] = js.native
  /**
    * The role granted by this permission. While new values may be supported in
    * the future, the following are currently allowed:   - owner  - organizer
    * - fileOrganizer  - writer  - commenter  - reader
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Details of whether the permissions on this Team Drive item are inherited
    * or directly on this item. This is an output-only field which is present
    * only for Team Drive items.
    */
  var teamDrivePermissionDetails: js.UndefOr[js.Array[InheritedFrom]] = js.native
  /**
    * The type of the grantee. Valid values are:   - user  - group  - domain  -
    * anyone
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaPermission {
  @scala.inline
  def apply(
    allowFileDiscovery: js.UndefOr[Boolean] = js.undefined,
    deleted: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    domain: String = null,
    emailAddress: String = null,
    expirationTime: String = null,
    id: String = null,
    kind: String = null,
    photoLink: String = null,
    role: String = null,
    teamDrivePermissionDetails: js.Array[InheritedFrom] = null,
    `type`: String = null
  ): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFileDiscovery)) __obj.updateDynamic("allowFileDiscovery")(allowFileDiscovery.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (photoLink != null) __obj.updateDynamic("photoLink")(photoLink.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (teamDrivePermissionDetails != null) __obj.updateDynamic("teamDrivePermissionDetails")(teamDrivePermissionDetails.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPermission]
  }
}

