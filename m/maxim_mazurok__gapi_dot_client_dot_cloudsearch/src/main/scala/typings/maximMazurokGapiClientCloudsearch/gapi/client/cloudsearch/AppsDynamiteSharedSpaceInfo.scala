package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedSpaceInfo extends StObject {
  
  var avatarInfo: js.UndefOr[AppsDynamiteSharedAvatarInfo] = js.undefined
  
  var avatarUrl: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var groupId: js.UndefOr[AppsDynamiteGroupId] = js.undefined
  
  /**
    * The email address of the user that invited the calling user to the room, if available. This field will only be populated for direct invites, it will be empty if the user was
    * indirectly invited to the group.
    */
  var inviterEmail: js.UndefOr[String] = js.undefined
  
  /** Whether this is a space that enables guest access */
  var isExternal: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var numMembers: js.UndefOr[Double] = js.undefined
  
  /** searching user's membership state in this space */
  var userMembershipState: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedSpaceInfo {
  
  inline def apply(): AppsDynamiteSharedSpaceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedSpaceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedSpaceInfo] (val x: Self) extends AnyVal {
    
    inline def setAvatarInfo(value: AppsDynamiteSharedAvatarInfo): Self = StObject.set(x, "avatarInfo", value.asInstanceOf[js.Any])
    
    inline def setAvatarInfoUndefined: Self = StObject.set(x, "avatarInfo", js.undefined)
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGroupId(value: AppsDynamiteGroupId): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setInviterEmail(value: String): Self = StObject.set(x, "inviterEmail", value.asInstanceOf[js.Any])
    
    inline def setInviterEmailUndefined: Self = StObject.set(x, "inviterEmail", js.undefined)
    
    inline def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
    
    inline def setIsExternalUndefined: Self = StObject.set(x, "isExternal", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumMembers(value: Double): Self = StObject.set(x, "numMembers", value.asInstanceOf[js.Any])
    
    inline def setNumMembersUndefined: Self = StObject.set(x, "numMembers", js.undefined)
    
    inline def setUserMembershipState(value: String): Self = StObject.set(x, "userMembershipState", value.asInstanceOf[js.Any])
    
    inline def setUserMembershipStateUndefined: Self = StObject.set(x, "userMembershipState", js.undefined)
  }
}
