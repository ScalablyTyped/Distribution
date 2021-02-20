package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiveChatMessageSnippet extends StObject {
  
  /**
    * The ID of the user that authored this message, this field is not always
    * filled. textMessageEvent - the user that wrote the message
    * fanFundingEvent - the user that funded the broadcast newSponsorEvent -
    * the user that just became a sponsor messageDeletedEvent - the moderator
    * that took the action messageRetractedEvent - the author that retracted
    * their message userBannedEvent - the moderator that took the action
    * superChatEvent - the user that made the purchase
    */
  var authorChannelId: js.UndefOr[String] = js.native
  
  /**
    * Contains a string that can be displayed to the user. If this field is not
    * present the message is silent, at the moment only messages of type
    * TOMBSTONE and CHAT_ENDED_EVENT are silent.
    */
  var displayMessage: js.UndefOr[String] = js.native
  
  /**
    * Details about the funding event, this is only set if the type is
    * &#39;fanFundingEvent&#39;.
    */
  var fanFundingEventDetails: js.UndefOr[SchemaLiveChatFanFundingEventDetails] = js.native
  
  /**
    * Whether the message has display content that should be displayed to
    * users.
    */
  var hasDisplayContent: js.UndefOr[Boolean] = js.native
  
  var liveChatId: js.UndefOr[String] = js.native
  
  var messageDeletedDetails: js.UndefOr[SchemaLiveChatMessageDeletedDetails] = js.native
  
  var messageRetractedDetails: js.UndefOr[SchemaLiveChatMessageRetractedDetails] = js.native
  
  var pollClosedDetails: js.UndefOr[SchemaLiveChatPollClosedDetails] = js.native
  
  var pollEditedDetails: js.UndefOr[SchemaLiveChatPollEditedDetails] = js.native
  
  var pollOpenedDetails: js.UndefOr[SchemaLiveChatPollOpenedDetails] = js.native
  
  var pollVotedDetails: js.UndefOr[SchemaLiveChatPollVotedDetails] = js.native
  
  /**
    * The date and time when the message was orignally published. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  
  /**
    * Details about the Super Chat event, this is only set if the type is
    * &#39;superChatEvent&#39;.
    */
  var superChatDetails: js.UndefOr[SchemaLiveChatSuperChatDetails] = js.native
  
  /**
    * Details about the Super Sticker event, this is only set if the type is
    * &#39;superStickerEvent&#39;.
    */
  var superStickerDetails: js.UndefOr[SchemaLiveChatSuperStickerDetails] = js.native
  
  /**
    * Details about the text message, this is only set if the type is
    * &#39;textMessageEvent&#39;.
    */
  var textMessageDetails: js.UndefOr[SchemaLiveChatTextMessageDetails] = js.native
  
  /**
    * The type of message, this will always be present, it determines the
    * contents of the message as well as which fields will be present.
    */
  var `type`: js.UndefOr[String] = js.native
  
  var userBannedDetails: js.UndefOr[SchemaLiveChatUserBannedMessageDetails] = js.native
}
object SchemaLiveChatMessageSnippet {
  
  @scala.inline
  def apply(): SchemaLiveChatMessageSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatMessageSnippet]
  }
  
  @scala.inline
  implicit class SchemaLiveChatMessageSnippetMutableBuilder[Self <: SchemaLiveChatMessageSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorChannelId(value: String): Self = StObject.set(x, "authorChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorChannelIdUndefined: Self = StObject.set(x, "authorChannelId", js.undefined)
    
    @scala.inline
    def setDisplayMessage(value: String): Self = StObject.set(x, "displayMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayMessageUndefined: Self = StObject.set(x, "displayMessage", js.undefined)
    
    @scala.inline
    def setFanFundingEventDetails(value: SchemaLiveChatFanFundingEventDetails): Self = StObject.set(x, "fanFundingEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFanFundingEventDetailsUndefined: Self = StObject.set(x, "fanFundingEventDetails", js.undefined)
    
    @scala.inline
    def setHasDisplayContent(value: Boolean): Self = StObject.set(x, "hasDisplayContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDisplayContentUndefined: Self = StObject.set(x, "hasDisplayContent", js.undefined)
    
    @scala.inline
    def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
    
    @scala.inline
    def setMessageDeletedDetails(value: SchemaLiveChatMessageDeletedDetails): Self = StObject.set(x, "messageDeletedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageDeletedDetailsUndefined: Self = StObject.set(x, "messageDeletedDetails", js.undefined)
    
    @scala.inline
    def setMessageRetractedDetails(value: SchemaLiveChatMessageRetractedDetails): Self = StObject.set(x, "messageRetractedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageRetractedDetailsUndefined: Self = StObject.set(x, "messageRetractedDetails", js.undefined)
    
    @scala.inline
    def setPollClosedDetails(value: SchemaLiveChatPollClosedDetails): Self = StObject.set(x, "pollClosedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollClosedDetailsUndefined: Self = StObject.set(x, "pollClosedDetails", js.undefined)
    
    @scala.inline
    def setPollEditedDetails(value: SchemaLiveChatPollEditedDetails): Self = StObject.set(x, "pollEditedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollEditedDetailsUndefined: Self = StObject.set(x, "pollEditedDetails", js.undefined)
    
    @scala.inline
    def setPollOpenedDetails(value: SchemaLiveChatPollOpenedDetails): Self = StObject.set(x, "pollOpenedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollOpenedDetailsUndefined: Self = StObject.set(x, "pollOpenedDetails", js.undefined)
    
    @scala.inline
    def setPollVotedDetails(value: SchemaLiveChatPollVotedDetails): Self = StObject.set(x, "pollVotedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollVotedDetailsUndefined: Self = StObject.set(x, "pollVotedDetails", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    @scala.inline
    def setSuperChatDetails(value: SchemaLiveChatSuperChatDetails): Self = StObject.set(x, "superChatDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperChatDetailsUndefined: Self = StObject.set(x, "superChatDetails", js.undefined)
    
    @scala.inline
    def setSuperStickerDetails(value: SchemaLiveChatSuperStickerDetails): Self = StObject.set(x, "superStickerDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperStickerDetailsUndefined: Self = StObject.set(x, "superStickerDetails", js.undefined)
    
    @scala.inline
    def setTextMessageDetails(value: SchemaLiveChatTextMessageDetails): Self = StObject.set(x, "textMessageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMessageDetailsUndefined: Self = StObject.set(x, "textMessageDetails", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUserBannedDetails(value: SchemaLiveChatUserBannedMessageDetails): Self = StObject.set(x, "userBannedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserBannedDetailsUndefined: Self = StObject.set(x, "userBannedDetails", js.undefined)
  }
}
