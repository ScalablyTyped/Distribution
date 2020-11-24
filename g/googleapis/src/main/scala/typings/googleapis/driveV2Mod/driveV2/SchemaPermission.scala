package typings.googleapis.driveV2Mod.driveV2

import typings.googleapis.anon.Inherited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A permission for a file.
  */
@js.native
trait SchemaPermission extends js.Object {
  
  /**
    * Additional roles for this user. Only commenter is currently allowed,
    * though more may be supported in the future.
    */
  var additionalRoles: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Deprecated.
    */
  var authKey: js.UndefOr[String] = js.native
  
  /**
    * Whether the account associated with this permission has been deleted.
    * This field only pertains to user and group permissions.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * The domain name of the entity this permission refers to. This is an
    * output-only field which is present when the permission type is user,
    * group or domain.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * The email address of the user or group this permission refers to. This is
    * an output-only field which is present when the permission type is user or
    * group.
    */
  var emailAddress: js.UndefOr[String] = js.native
  
  /**
    * The ETag of the permission.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The time at which this permission will expire (RFC 3339 date-time).
    * Expiration dates have the following restrictions:   - They can only be
    * set on user and group permissions  - The date must be in the future  -
    * The date cannot be more than a year in the future  - The date can only be
    * set on drive.permissions.update or drive.permissions.patch requests
    */
  var expirationDate: js.UndefOr[String] = js.native
  
  /**
    * The ID of the user this permission refers to, and identical to the
    * permissionId in the About and Files resources. When making a
    * drive.permissions.insert request, exactly one of the id or value fields
    * must be specified unless the permission type is anyone, in which case
    * both id and value are ignored.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * This is always drive#permission.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The name for this permission.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A link to the profile photo, if available.
    */
  var photoLink: js.UndefOr[String] = js.native
  
  /**
    * The primary role for this user. While new values may be supported in the
    * future, the following are currently allowed:   - owner  - organizer  -
    * fileOrganizer  - writer  - reader
    */
  var role: js.UndefOr[String] = js.native
  
  /**
    * A link back to this permission.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Details of whether the permissions on this Team Drive item are inherited
    * or directly on this item. This is an output-only field which is present
    * only for Team Drive items.
    */
  var teamDrivePermissionDetails: js.UndefOr[js.Array[Inherited]] = js.native
  
  /**
    * The account type. Allowed values are:   - user  - group  - domain  -
    * anyone
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The email address or domain name for the entity. This is used during
    * inserts and is not populated in responses. When making a
    * drive.permissions.insert request, exactly one of the id or value fields
    * must be specified unless the permission type is anyone, in which case
    * both id and value are ignored.
    */
  var value: js.UndefOr[String] = js.native
  
  /**
    * Whether the link is required for this permission.
    */
  var withLink: js.UndefOr[Boolean] = js.native
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
    def setAdditionalRolesVarargs(value: String*): Self = this.set("additionalRoles", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalRoles(value: js.Array[String]): Self = this.set("additionalRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalRoles: Self = this.set("additionalRoles", js.undefined)
    
    @scala.inline
    def setAuthKey(value: String): Self = this.set("authKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthKey: Self = this.set("authKey", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPhotoLink(value: String): Self = this.set("photoLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotoLink: Self = this.set("photoLink", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setTeamDrivePermissionDetailsVarargs(value: Inherited*): Self = this.set("teamDrivePermissionDetails", js.Array(value :_*))
    
    @scala.inline
    def setTeamDrivePermissionDetails(value: js.Array[Inherited]): Self = this.set("teamDrivePermissionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamDrivePermissionDetails: Self = this.set("teamDrivePermissionDetails", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWithLink(value: Boolean): Self = this.set("withLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithLink: Self = this.set("withLink", js.undefined)
  }
}
