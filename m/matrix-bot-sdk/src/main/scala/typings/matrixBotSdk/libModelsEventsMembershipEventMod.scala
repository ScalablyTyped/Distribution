package typings.matrixBotSdk

import typings.matrixBotSdk.anon.Displayname
import typings.matrixBotSdk.libModelsEventsRoomEventMod.StateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsMembershipEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/MembershipEvent", "MembershipEvent")
  @js.native
  open class MembershipEvent protected () extends StateEvent[MembershipEventContent] {
    def this(event: Any) = this()
    
    /**
      * The user's effective membership.
      */
    def effectiveMembership: EffectiveMembership = js.native
    
    /**
      * The user's membership.
      */
    def membership: Membership = js.native
    
    /**
      * The user ID the membership affects.
      */
    def membershipFor: String = js.native
    
    /**
      * True if the membership event targets the sender. False otherwise.
      *
      * This will typically by false for kicks and bans.
      */
    def ownMembership: Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixBotSdk.matrixBotSdkStrings.join
    - typings.matrixBotSdk.matrixBotSdkStrings.leave
    - typings.matrixBotSdk.matrixBotSdkStrings.invite
  */
  trait EffectiveMembership extends StObject
  object EffectiveMembership {
    
    inline def invite: typings.matrixBotSdk.matrixBotSdkStrings.invite = "invite".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.invite]
    
    inline def join: typings.matrixBotSdk.matrixBotSdkStrings.join = "join".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.join]
    
    inline def leave: typings.matrixBotSdk.matrixBotSdkStrings.leave = "leave".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.leave]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixBotSdk.matrixBotSdkStrings.join
    - typings.matrixBotSdk.matrixBotSdkStrings.leave
    - typings.matrixBotSdk.matrixBotSdkStrings.ban
    - typings.matrixBotSdk.matrixBotSdkStrings.invite
  */
  trait Membership extends StObject
  object Membership {
    
    inline def ban: typings.matrixBotSdk.matrixBotSdkStrings.ban = "ban".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.ban]
    
    inline def invite: typings.matrixBotSdk.matrixBotSdkStrings.invite = "invite".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.invite]
    
    inline def join: typings.matrixBotSdk.matrixBotSdkStrings.join = "join".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.join]
    
    inline def leave: typings.matrixBotSdk.matrixBotSdkStrings.leave = "leave".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.leave]
  }
  
  trait MembershipEventContent extends StObject {
    
    var avatar_url: js.UndefOr[String] = js.undefined
    
    var displayname: js.UndefOr[String] = js.undefined
    
    var is_direct: js.UndefOr[Boolean] = js.undefined
    
    var membership: Membership
    
    var third_party_invite: js.UndefOr[Displayname] = js.undefined
    
    var unsigned: js.UndefOr[Any] = js.undefined
  }
  object MembershipEventContent {
    
    inline def apply(membership: Membership): MembershipEventContent = {
      val __obj = js.Dynamic.literal(membership = membership.asInstanceOf[js.Any])
      __obj.asInstanceOf[MembershipEventContent]
    }
    
    extension [Self <: MembershipEventContent](x: Self) {
      
      inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      inline def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
      
      inline def setDisplayname(value: String): Self = StObject.set(x, "displayname", value.asInstanceOf[js.Any])
      
      inline def setDisplaynameUndefined: Self = StObject.set(x, "displayname", js.undefined)
      
      inline def setIs_direct(value: Boolean): Self = StObject.set(x, "is_direct", value.asInstanceOf[js.Any])
      
      inline def setIs_directUndefined: Self = StObject.set(x, "is_direct", js.undefined)
      
      inline def setMembership(value: Membership): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
      
      inline def setThird_party_invite(value: Displayname): Self = StObject.set(x, "third_party_invite", value.asInstanceOf[js.Any])
      
      inline def setThird_party_inviteUndefined: Self = StObject.set(x, "third_party_invite", js.undefined)
      
      inline def setUnsigned(value: Any): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
      
      inline def setUnsignedUndefined: Self = StObject.set(x, "unsigned", js.undefined)
    }
  }
}
