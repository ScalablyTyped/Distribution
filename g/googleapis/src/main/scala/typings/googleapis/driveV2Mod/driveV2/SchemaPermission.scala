package typings.googleapis.driveV2Mod.driveV2

import typings.googleapis.anon.Inherited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A permission for a file.
  */
trait SchemaPermission extends StObject {
  
  /**
    * Additional roles for this user. Only commenter is currently allowed,
    * though more may be supported in the future.
    */
  var additionalRoles: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Deprecated.
    */
  var authKey: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the account associated with this permission has been deleted.
    * This field only pertains to user and group permissions.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The domain name of the entity this permission refers to. This is an
    * output-only field which is present when the permission type is user,
    * group or domain.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * The email address of the user or group this permission refers to. This is
    * an output-only field which is present when the permission type is user or
    * group.
    */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The ETag of the permission.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which this permission will expire (RFC 3339 date-time).
    * Expiration dates have the following restrictions:   - They can only be
    * set on user and group permissions  - The date must be in the future  -
    * The date cannot be more than a year in the future  - The date can only be
    * set on drive.permissions.update or drive.permissions.patch requests
    */
  var expirationDate: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the user this permission refers to, and identical to the
    * permissionId in the About and Files resources. When making a
    * drive.permissions.insert request, exactly one of the id or value fields
    * must be specified unless the permission type is anyone, in which case
    * both id and value are ignored.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * This is always drive#permission.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The name for this permission.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A link to the profile photo, if available.
    */
  var photoLink: js.UndefOr[String] = js.undefined
  
  /**
    * The primary role for this user. While new values may be supported in the
    * future, the following are currently allowed:   - owner  - organizer  -
    * fileOrganizer  - writer  - reader
    */
  var role: js.UndefOr[String] = js.undefined
  
  /**
    * A link back to this permission.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Details of whether the permissions on this Team Drive item are inherited
    * or directly on this item. This is an output-only field which is present
    * only for Team Drive items.
    */
  var teamDrivePermissionDetails: js.UndefOr[js.Array[Inherited]] = js.undefined
  
  /**
    * The account type. Allowed values are:   - user  - group  - domain  -
    * anyone
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The email address or domain name for the entity. This is used during
    * inserts and is not populated in responses. When making a
    * drive.permissions.insert request, exactly one of the id or value fields
    * must be specified unless the permission type is anyone, in which case
    * both id and value are ignored.
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the link is required for this permission.
    */
  var withLink: js.UndefOr[Boolean] = js.undefined
}
object SchemaPermission {
  
  @scala.inline
  def apply(): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermission]
  }
  
  @scala.inline
  implicit class SchemaPermissionMutableBuilder[Self <: SchemaPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalRoles(value: js.Array[String]): Self = StObject.set(x, "additionalRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalRolesUndefined: Self = StObject.set(x, "additionalRoles", js.undefined)
    
    @scala.inline
    def setAdditionalRolesVarargs(value: String*): Self = StObject.set(x, "additionalRoles", js.Array(value :_*))
    
    @scala.inline
    def setAuthKey(value: String): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhotoLink(value: String): Self = StObject.set(x, "photoLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoLinkUndefined: Self = StObject.set(x, "photoLink", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setTeamDrivePermissionDetails(value: js.Array[Inherited]): Self = StObject.set(x, "teamDrivePermissionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDrivePermissionDetailsUndefined: Self = StObject.set(x, "teamDrivePermissionDetails", js.undefined)
    
    @scala.inline
    def setTeamDrivePermissionDetailsVarargs(value: Inherited*): Self = StObject.set(x, "teamDrivePermissionDetails", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWithLink(value: Boolean): Self = StObject.set(x, "withLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithLinkUndefined: Self = StObject.set(x, "withLink", js.undefined)
  }
}
