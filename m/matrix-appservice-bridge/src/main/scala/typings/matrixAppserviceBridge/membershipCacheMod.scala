package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object membershipCacheMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/membership-cache", "MembershipCache")
  @js.native
  open class MembershipCache () extends StObject {
    
    /**
      * Gets the *cached* state of a user's membership for a room.
      * This DOES NOT check to verify the value is correct (i.e the
      * room may have state reset and left the user from the room).
      *
      * This only caches users from the appservice.
      *
      * @param roomId Room id to check the state of.
      * @param userId The userid to check the state of.
      * @returns The membership state of the user, e.g. "joined"
      */
    def getMemberEntry(roomId: String, userId: String): UserMembership = js.native
    
    /**
      * Gets the *cached* state of a user's membership for a room.
      * This DOES NOT check to verify the value is correct (i.e the
      * room may have state reset and left the user from the room).
      *
      * This only caches users from the appservice.
      *
      * @param roomId Room id to check the state of.
      * @param userId The userid to check the state of.
      * @returns The member's profile information.
      */
    def getMemberProfile(roomId: String, userId: String): UserProfile = js.native
    
    def getMembersForRoom(roomId: String): js.Array[String] | Null = js.native
    def getMembersForRoom(roomId: String, filterFor: UserMembership): js.Array[String] | Null = js.native
    
    /**
      * Is a user considered registered with the homeserver.
      * @param userId A Matrix userId
      */
    def isUserRegistered(userId: String): Boolean = js.native
    
    /* private */ var membershipMap: Any = js.native
    
    /* private */ var registeredUsers: Any = js.native
    
    /**
      * Set the *cached* state of a user's membership for a room.
      * Use this to optimise intents so that they do not attempt
      * to join a room if we know they are joined.
      * This DOES NOT set the actual membership of the room.
      *
      * This only caches users from the appservice.
      * @param roomId Room id to set the state of.
      * @param userId The userid to set the state of.
      * @param membership The membership value to set for the user
      *                       e.g joined.
      */
    def setMemberEntry(roomId: String, userId: String, membership: UserMembership, profile: UserProfile): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.join
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.invite
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.leave
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.ban
    - scala.Null
  */
  type UserMembership = _UserMembership | Null
  
  trait UserProfile extends StObject {
    
    var avatar_url: js.UndefOr[String] = js.undefined
    
    var displayname: js.UndefOr[String] = js.undefined
  }
  object UserProfile {
    
    inline def apply(): UserProfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserProfile]
    }
    
    extension [Self <: UserProfile](x: Self) {
      
      inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      inline def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
      
      inline def setDisplayname(value: String): Self = StObject.set(x, "displayname", value.asInstanceOf[js.Any])
      
      inline def setDisplaynameUndefined: Self = StObject.set(x, "displayname", js.undefined)
    }
  }
  
  trait _UserMembership extends StObject
}
