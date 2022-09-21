package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatGiftMembershipReceivedDetails extends StObject {
  
  /**
    * The ID of the membership gifting message that is related to this gift membership. This ID will always refer to a message whose type is 'membershipGiftingEvent'.
    */
  var associatedMembershipGiftingMessageId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the user that made the membership gifting purchase. This matches the `snippet.authorChannelId` of the associated membership gifting message.
    */
  var gifterChannelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the Level at which the viewer is a member. This matches the `snippet.membershipGiftingDetails.giftMembershipsLevelName` of the associated membership gifting message. The Level names are defined by the YouTube channel offering the Membership. In some situations this field isn't filled.
    */
  var memberLevelName: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiveChatGiftMembershipReceivedDetails {
  
  inline def apply(): SchemaLiveChatGiftMembershipReceivedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatGiftMembershipReceivedDetails]
  }
  
  extension [Self <: SchemaLiveChatGiftMembershipReceivedDetails](x: Self) {
    
    inline def setAssociatedMembershipGiftingMessageId(value: String): Self = StObject.set(x, "associatedMembershipGiftingMessageId", value.asInstanceOf[js.Any])
    
    inline def setAssociatedMembershipGiftingMessageIdNull: Self = StObject.set(x, "associatedMembershipGiftingMessageId", null)
    
    inline def setAssociatedMembershipGiftingMessageIdUndefined: Self = StObject.set(x, "associatedMembershipGiftingMessageId", js.undefined)
    
    inline def setGifterChannelId(value: String): Self = StObject.set(x, "gifterChannelId", value.asInstanceOf[js.Any])
    
    inline def setGifterChannelIdNull: Self = StObject.set(x, "gifterChannelId", null)
    
    inline def setGifterChannelIdUndefined: Self = StObject.set(x, "gifterChannelId", js.undefined)
    
    inline def setMemberLevelName(value: String): Self = StObject.set(x, "memberLevelName", value.asInstanceOf[js.Any])
    
    inline def setMemberLevelNameNull: Self = StObject.set(x, "memberLevelName", null)
    
    inline def setMemberLevelNameUndefined: Self = StObject.set(x, "memberLevelName", js.undefined)
  }
}
