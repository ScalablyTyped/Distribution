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
  def apply(): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermission]
  }
  @scala.inline
  implicit class SchemaPermissionOps[Self <: SchemaPermission] (val x: Self) extends AnyVal {
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
    def setAllowFileDiscovery(value: Boolean): Self = this.set("allowFileDiscovery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFileDiscovery: Self = this.set("allowFileDiscovery", js.undefined)
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    @scala.inline
    def setExpirationTime(value: String): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationTime: Self = this.set("expirationTime", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPhotoLink(value: String): Self = this.set("photoLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotoLink: Self = this.set("photoLink", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setTeamDrivePermissionDetailsVarargs(value: InheritedFrom*): Self = this.set("teamDrivePermissionDetails", js.Array(value :_*))
    @scala.inline
    def setTeamDrivePermissionDetails(value: js.Array[InheritedFrom]): Self = this.set("teamDrivePermissionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamDrivePermissionDetails: Self = this.set("teamDrivePermissionDetails", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

