package typings.googleapis.driveV2Mod.driveV2

import typings.googleapis.anon.Inherited
import typings.googleapis.anon.InheritedFrom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPermission extends StObject {
  
  /**
    * Additional roles for this user. Only commenter is currently allowed, though more may be supported in the future.
    */
  var additionalRoles: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Deprecated.
    */
  var authKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the account associated with this permission has been deleted. This field only pertains to user and group permissions.
    */
  var deleted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The domain name of the entity this permission refers to. This is an output-only field which is present when the permission type is user, group or domain.
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email address of the user or group this permission refers to. This is an output-only field which is present when the permission type is user or group.
    */
  var emailAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ETag of the permission.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which this permission will expire (RFC 3339 date-time). Expiration dates have the following restrictions:
    * - They cannot be set on shared drive items
    * - They can only be set on user and group permissions
    * - The date must be in the future
    * - The date cannot be more than a year in the future
    * - The date can only be set on drive.permissions.update or drive.permissions.patch requests
    */
  var expirationDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the user this permission refers to, and identical to the permissionId in the About and Files resources. When making a drive.permissions.insert request, exactly one of the id or value fields must be specified unless the permission type is anyone, in which case both id and value are ignored.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always drive#permission.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name for this permission.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the account associated with this permission is a pending owner. Only populated for user type permissions for files that are not in a shared drive.
    */
  var pendingOwner: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Details of whether the permissions on this shared drive item are inherited or directly on this item. This is an output-only field which is present only for shared drive items.
    */
  var permissionDetails: js.UndefOr[js.Array[Inherited] | Null] = js.undefined
  
  /**
    * A link to the profile photo, if available.
    */
  var photoLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The primary role for this user. While new values may be supported in the future, the following are currently allowed:
    * - owner
    * - organizer
    * - fileOrganizer
    * - writer
    * - reader
    */
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link back to this permission.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated - use permissionDetails instead.
    */
  var teamDrivePermissionDetails: js.UndefOr[js.Array[InheritedFrom] | Null] = js.undefined
  
  /**
    * The account type. Allowed values are:
    * - user
    * - group
    * - domain
    * - anyone
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email address or domain name for the entity. This is used during inserts and is not populated in responses. When making a drive.permissions.insert request, exactly one of the id or value fields must be specified unless the permission type is anyone, in which case both id and value are ignored.
    */
  var value: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates the view for this permission. Only populated for permissions that belong to a view. published is the only supported value.
    */
  var view: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the link is required for this permission.
    */
  var withLink: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaPermission {
  
  inline def apply(): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermission]
  }
  
  extension [Self <: SchemaPermission](x: Self) {
    
    inline def setAdditionalRoles(value: js.Array[String]): Self = StObject.set(x, "additionalRoles", value.asInstanceOf[js.Any])
    
    inline def setAdditionalRolesNull: Self = StObject.set(x, "additionalRoles", null)
    
    inline def setAdditionalRolesUndefined: Self = StObject.set(x, "additionalRoles", js.undefined)
    
    inline def setAdditionalRolesVarargs(value: String*): Self = StObject.set(x, "additionalRoles", js.Array(value*))
    
    inline def setAuthKey(value: String): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
    
    inline def setAuthKeyNull: Self = StObject.set(x, "authKey", null)
    
    inline def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateNull: Self = StObject.set(x, "expirationDate", null)
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPendingOwner(value: Boolean): Self = StObject.set(x, "pendingOwner", value.asInstanceOf[js.Any])
    
    inline def setPendingOwnerNull: Self = StObject.set(x, "pendingOwner", null)
    
    inline def setPendingOwnerUndefined: Self = StObject.set(x, "pendingOwner", js.undefined)
    
    inline def setPermissionDetails(value: js.Array[Inherited]): Self = StObject.set(x, "permissionDetails", value.asInstanceOf[js.Any])
    
    inline def setPermissionDetailsNull: Self = StObject.set(x, "permissionDetails", null)
    
    inline def setPermissionDetailsUndefined: Self = StObject.set(x, "permissionDetails", js.undefined)
    
    inline def setPermissionDetailsVarargs(value: Inherited*): Self = StObject.set(x, "permissionDetails", js.Array(value*))
    
    inline def setPhotoLink(value: String): Self = StObject.set(x, "photoLink", value.asInstanceOf[js.Any])
    
    inline def setPhotoLinkNull: Self = StObject.set(x, "photoLink", null)
    
    inline def setPhotoLinkUndefined: Self = StObject.set(x, "photoLink", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTeamDrivePermissionDetails(value: js.Array[InheritedFrom]): Self = StObject.set(x, "teamDrivePermissionDetails", value.asInstanceOf[js.Any])
    
    inline def setTeamDrivePermissionDetailsNull: Self = StObject.set(x, "teamDrivePermissionDetails", null)
    
    inline def setTeamDrivePermissionDetailsUndefined: Self = StObject.set(x, "teamDrivePermissionDetails", js.undefined)
    
    inline def setTeamDrivePermissionDetailsVarargs(value: InheritedFrom*): Self = StObject.set(x, "teamDrivePermissionDetails", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewNull: Self = StObject.set(x, "view", null)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWithLink(value: Boolean): Self = StObject.set(x, "withLink", value.asInstanceOf[js.Any])
    
    inline def setWithLinkNull: Self = StObject.set(x, "withLink", null)
    
    inline def setWithLinkUndefined: Self = StObject.set(x, "withLink", js.undefined)
  }
}
