package typings.googleapis.driveV3Mod.driveV3

import typings.googleapis.anon.InheritedFrom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A permission for a file. A permission grants a user, group, domain or the
  * world access to a file or a folder hierarchy.
  */
trait SchemaPermission extends StObject {
  
  /**
    * Whether the permission allows the file to be discovered through search.
    * This is only applicable for permissions of type domain or anyone.
    */
  var allowFileDiscovery: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the account associated with this permission has been deleted.
    * This field only pertains to user and group permissions.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A displayable name for users, groups or domains.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The domain to which this permission refers.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * The email address of the user or group to which this permission refers.
    */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which this permission will expire (RFC 3339 date-time).
    * Expiration times have the following restrictions:   - They can only be
    * set on user and group permissions  - The time must be in the future  -
    * The time cannot be more than a year in the future
    */
  var expirationTime: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of this permission. This is a unique identifier for the grantee,
    * and is published in User resources as permissionId.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#permission&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A link to the user&#39;s profile photo, if available.
    */
  var photoLink: js.UndefOr[String] = js.undefined
  
  /**
    * The role granted by this permission. While new values may be supported in
    * the future, the following are currently allowed:   - owner  - organizer
    * - fileOrganizer  - writer  - commenter  - reader
    */
  var role: js.UndefOr[String] = js.undefined
  
  /**
    * Details of whether the permissions on this Team Drive item are inherited
    * or directly on this item. This is an output-only field which is present
    * only for Team Drive items.
    */
  var teamDrivePermissionDetails: js.UndefOr[js.Array[InheritedFrom]] = js.undefined
  
  /**
    * The type of the grantee. Valid values are:   - user  - group  - domain  -
    * anyone
    */
  var `type`: js.UndefOr[String] = js.undefined
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
    def setAllowFileDiscovery(value: Boolean): Self = StObject.set(x, "allowFileDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFileDiscoveryUndefined: Self = StObject.set(x, "allowFileDiscovery", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPhotoLink(value: String): Self = StObject.set(x, "photoLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoLinkUndefined: Self = StObject.set(x, "photoLink", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setTeamDrivePermissionDetails(value: js.Array[InheritedFrom]): Self = StObject.set(x, "teamDrivePermissionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDrivePermissionDetailsUndefined: Self = StObject.set(x, "teamDrivePermissionDetails", js.undefined)
    
    @scala.inline
    def setTeamDrivePermissionDetailsVarargs(value: InheritedFrom*): Self = StObject.set(x, "teamDrivePermissionDetails", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
