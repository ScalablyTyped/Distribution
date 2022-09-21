package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatMessageSnippet extends StObject {
  
  /**
    * The ID of the user that authored this message, this field is not always filled. textMessageEvent - the user that wrote the message fanFundingEvent - the user that funded the broadcast newSponsorEvent - the user that just became a sponsor memberMilestoneChatEvent - the member that sent the message membershipGiftingEvent - the user that made the purchase giftMembershipReceivedEvent - the user that received the gift membership messageDeletedEvent - the moderator that took the action messageRetractedEvent - the author that retracted their message userBannedEvent - the moderator that took the action superChatEvent - the user that made the purchase superStickerEvent - the user that made the purchase
    */
  var authorChannelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contains a string that can be displayed to the user. If this field is not present the message is silent, at the moment only messages of type TOMBSTONE and CHAT_ENDED_EVENT are silent.
    */
  var displayMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details about the funding event, this is only set if the type is 'fanFundingEvent'.
    */
  var fanFundingEventDetails: js.UndefOr[SchemaLiveChatFanFundingEventDetails] = js.undefined
  
  /**
    * Details about the Gift Membership Received event, this is only set if the type is 'giftMembershipReceivedEvent'.
    */
  var giftMembershipReceivedDetails: js.UndefOr[SchemaLiveChatGiftMembershipReceivedDetails] = js.undefined
  
  /**
    * Whether the message has display content that should be displayed to users.
    */
  var hasDisplayContent: js.UndefOr[Boolean | Null] = js.undefined
  
  var liveChatId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details about the Member Milestone Chat event, this is only set if the type is 'memberMilestoneChatEvent'.
    */
  var memberMilestoneChatDetails: js.UndefOr[SchemaLiveChatMemberMilestoneChatDetails] = js.undefined
  
  /**
    * Details about the Membership Gifting event, this is only set if the type is 'membershipGiftingEvent'.
    */
  var membershipGiftingDetails: js.UndefOr[SchemaLiveChatMembershipGiftingDetails] = js.undefined
  
  var messageDeletedDetails: js.UndefOr[SchemaLiveChatMessageDeletedDetails] = js.undefined
  
  var messageRetractedDetails: js.UndefOr[SchemaLiveChatMessageRetractedDetails] = js.undefined
  
  /**
    * Details about the New Member Announcement event, this is only set if the type is 'newSponsorEvent'. Please note that "member" is the new term for "sponsor".
    */
  var newSponsorDetails: js.UndefOr[SchemaLiveChatNewSponsorDetails] = js.undefined
  
  /**
    * The date and time when the message was orignally published.
    */
  var publishedAt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details about the Super Chat event, this is only set if the type is 'superChatEvent'.
    */
  var superChatDetails: js.UndefOr[SchemaLiveChatSuperChatDetails] = js.undefined
  
  /**
    * Details about the Super Sticker event, this is only set if the type is 'superStickerEvent'.
    */
  var superStickerDetails: js.UndefOr[SchemaLiveChatSuperStickerDetails] = js.undefined
  
  /**
    * Details about the text message, this is only set if the type is 'textMessageEvent'.
    */
  var textMessageDetails: js.UndefOr[SchemaLiveChatTextMessageDetails] = js.undefined
  
  /**
    * The type of message, this will always be present, it determines the contents of the message as well as which fields will be present.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  var userBannedDetails: js.UndefOr[SchemaLiveChatUserBannedMessageDetails] = js.undefined
}
object SchemaLiveChatMessageSnippet {
  
  inline def apply(): SchemaLiveChatMessageSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatMessageSnippet]
  }
  
  extension [Self <: SchemaLiveChatMessageSnippet](x: Self) {
    
    inline def setAuthorChannelId(value: String): Self = StObject.set(x, "authorChannelId", value.asInstanceOf[js.Any])
    
    inline def setAuthorChannelIdNull: Self = StObject.set(x, "authorChannelId", null)
    
    inline def setAuthorChannelIdUndefined: Self = StObject.set(x, "authorChannelId", js.undefined)
    
    inline def setDisplayMessage(value: String): Self = StObject.set(x, "displayMessage", value.asInstanceOf[js.Any])
    
    inline def setDisplayMessageNull: Self = StObject.set(x, "displayMessage", null)
    
    inline def setDisplayMessageUndefined: Self = StObject.set(x, "displayMessage", js.undefined)
    
    inline def setFanFundingEventDetails(value: SchemaLiveChatFanFundingEventDetails): Self = StObject.set(x, "fanFundingEventDetails", value.asInstanceOf[js.Any])
    
    inline def setFanFundingEventDetailsUndefined: Self = StObject.set(x, "fanFundingEventDetails", js.undefined)
    
    inline def setGiftMembershipReceivedDetails(value: SchemaLiveChatGiftMembershipReceivedDetails): Self = StObject.set(x, "giftMembershipReceivedDetails", value.asInstanceOf[js.Any])
    
    inline def setGiftMembershipReceivedDetailsUndefined: Self = StObject.set(x, "giftMembershipReceivedDetails", js.undefined)
    
    inline def setHasDisplayContent(value: Boolean): Self = StObject.set(x, "hasDisplayContent", value.asInstanceOf[js.Any])
    
    inline def setHasDisplayContentNull: Self = StObject.set(x, "hasDisplayContent", null)
    
    inline def setHasDisplayContentUndefined: Self = StObject.set(x, "hasDisplayContent", js.undefined)
    
    inline def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
    
    inline def setLiveChatIdNull: Self = StObject.set(x, "liveChatId", null)
    
    inline def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
    
    inline def setMemberMilestoneChatDetails(value: SchemaLiveChatMemberMilestoneChatDetails): Self = StObject.set(x, "memberMilestoneChatDetails", value.asInstanceOf[js.Any])
    
    inline def setMemberMilestoneChatDetailsUndefined: Self = StObject.set(x, "memberMilestoneChatDetails", js.undefined)
    
    inline def setMembershipGiftingDetails(value: SchemaLiveChatMembershipGiftingDetails): Self = StObject.set(x, "membershipGiftingDetails", value.asInstanceOf[js.Any])
    
    inline def setMembershipGiftingDetailsUndefined: Self = StObject.set(x, "membershipGiftingDetails", js.undefined)
    
    inline def setMessageDeletedDetails(value: SchemaLiveChatMessageDeletedDetails): Self = StObject.set(x, "messageDeletedDetails", value.asInstanceOf[js.Any])
    
    inline def setMessageDeletedDetailsUndefined: Self = StObject.set(x, "messageDeletedDetails", js.undefined)
    
    inline def setMessageRetractedDetails(value: SchemaLiveChatMessageRetractedDetails): Self = StObject.set(x, "messageRetractedDetails", value.asInstanceOf[js.Any])
    
    inline def setMessageRetractedDetailsUndefined: Self = StObject.set(x, "messageRetractedDetails", js.undefined)
    
    inline def setNewSponsorDetails(value: SchemaLiveChatNewSponsorDetails): Self = StObject.set(x, "newSponsorDetails", value.asInstanceOf[js.Any])
    
    inline def setNewSponsorDetailsUndefined: Self = StObject.set(x, "newSponsorDetails", js.undefined)
    
    inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    inline def setPublishedAtNull: Self = StObject.set(x, "publishedAt", null)
    
    inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    inline def setSuperChatDetails(value: SchemaLiveChatSuperChatDetails): Self = StObject.set(x, "superChatDetails", value.asInstanceOf[js.Any])
    
    inline def setSuperChatDetailsUndefined: Self = StObject.set(x, "superChatDetails", js.undefined)
    
    inline def setSuperStickerDetails(value: SchemaLiveChatSuperStickerDetails): Self = StObject.set(x, "superStickerDetails", value.asInstanceOf[js.Any])
    
    inline def setSuperStickerDetailsUndefined: Self = StObject.set(x, "superStickerDetails", js.undefined)
    
    inline def setTextMessageDetails(value: SchemaLiveChatTextMessageDetails): Self = StObject.set(x, "textMessageDetails", value.asInstanceOf[js.Any])
    
    inline def setTextMessageDetailsUndefined: Self = StObject.set(x, "textMessageDetails", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserBannedDetails(value: SchemaLiveChatUserBannedMessageDetails): Self = StObject.set(x, "userBannedDetails", value.asInstanceOf[js.Any])
    
    inline def setUserBannedDetailsUndefined: Self = StObject.set(x, "userBannedDetails", js.undefined)
  }
}
