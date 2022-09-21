package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatMessageAuthorDetails extends StObject {
  
  /**
    * The YouTube channel ID.
    */
  var channelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The channel's URL.
    */
  var channelUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The channel's display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the author is a moderator of the live chat.
    */
  var isChatModerator: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the author is the owner of the live chat.
    */
  var isChatOwner: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the author is a sponsor of the live chat.
    */
  var isChatSponsor: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the author's identity has been verified by YouTube.
    */
  var isVerified: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The channels's avatar URL.
    */
  var profileImageUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiveChatMessageAuthorDetails {
  
  inline def apply(): SchemaLiveChatMessageAuthorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatMessageAuthorDetails]
  }
  
  extension [Self <: SchemaLiveChatMessageAuthorDetails](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setChannelUrl(value: String): Self = StObject.set(x, "channelUrl", value.asInstanceOf[js.Any])
    
    inline def setChannelUrlNull: Self = StObject.set(x, "channelUrl", null)
    
    inline def setChannelUrlUndefined: Self = StObject.set(x, "channelUrl", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsChatModerator(value: Boolean): Self = StObject.set(x, "isChatModerator", value.asInstanceOf[js.Any])
    
    inline def setIsChatModeratorNull: Self = StObject.set(x, "isChatModerator", null)
    
    inline def setIsChatModeratorUndefined: Self = StObject.set(x, "isChatModerator", js.undefined)
    
    inline def setIsChatOwner(value: Boolean): Self = StObject.set(x, "isChatOwner", value.asInstanceOf[js.Any])
    
    inline def setIsChatOwnerNull: Self = StObject.set(x, "isChatOwner", null)
    
    inline def setIsChatOwnerUndefined: Self = StObject.set(x, "isChatOwner", js.undefined)
    
    inline def setIsChatSponsor(value: Boolean): Self = StObject.set(x, "isChatSponsor", value.asInstanceOf[js.Any])
    
    inline def setIsChatSponsorNull: Self = StObject.set(x, "isChatSponsor", null)
    
    inline def setIsChatSponsorUndefined: Self = StObject.set(x, "isChatSponsor", js.undefined)
    
    inline def setIsVerified(value: Boolean): Self = StObject.set(x, "isVerified", value.asInstanceOf[js.Any])
    
    inline def setIsVerifiedNull: Self = StObject.set(x, "isVerified", null)
    
    inline def setIsVerifiedUndefined: Self = StObject.set(x, "isVerified", js.undefined)
    
    inline def setProfileImageUrl(value: String): Self = StObject.set(x, "profileImageUrl", value.asInstanceOf[js.Any])
    
    inline def setProfileImageUrlNull: Self = StObject.set(x, "profileImageUrl", null)
    
    inline def setProfileImageUrlUndefined: Self = StObject.set(x, "profileImageUrl", js.undefined)
  }
}
