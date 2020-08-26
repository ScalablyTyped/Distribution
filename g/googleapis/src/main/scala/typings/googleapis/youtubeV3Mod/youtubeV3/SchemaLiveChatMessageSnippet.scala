package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatMessageSnippet extends js.Object {
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
  implicit class SchemaLiveChatMessageSnippetOps[Self <: SchemaLiveChatMessageSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthorChannelId(value: String): Self = this.set("authorChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorChannelId: Self = this.set("authorChannelId", js.undefined)
    @scala.inline
    def setDisplayMessage(value: String): Self = this.set("displayMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayMessage: Self = this.set("displayMessage", js.undefined)
    @scala.inline
    def setFanFundingEventDetails(value: SchemaLiveChatFanFundingEventDetails): Self = this.set("fanFundingEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFanFundingEventDetails: Self = this.set("fanFundingEventDetails", js.undefined)
    @scala.inline
    def setHasDisplayContent(value: Boolean): Self = this.set("hasDisplayContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasDisplayContent: Self = this.set("hasDisplayContent", js.undefined)
    @scala.inline
    def setLiveChatId(value: String): Self = this.set("liveChatId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveChatId: Self = this.set("liveChatId", js.undefined)
    @scala.inline
    def setMessageDeletedDetails(value: SchemaLiveChatMessageDeletedDetails): Self = this.set("messageDeletedDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageDeletedDetails: Self = this.set("messageDeletedDetails", js.undefined)
    @scala.inline
    def setMessageRetractedDetails(value: SchemaLiveChatMessageRetractedDetails): Self = this.set("messageRetractedDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageRetractedDetails: Self = this.set("messageRetractedDetails", js.undefined)
    @scala.inline
    def setPollClosedDetails(value: SchemaLiveChatPollClosedDetails): Self = this.set("pollClosedDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollClosedDetails: Self = this.set("pollClosedDetails", js.undefined)
    @scala.inline
    def setPollEditedDetails(value: SchemaLiveChatPollEditedDetails): Self = this.set("pollEditedDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollEditedDetails: Self = this.set("pollEditedDetails", js.undefined)
    @scala.inline
    def setPollOpenedDetails(value: SchemaLiveChatPollOpenedDetails): Self = this.set("pollOpenedDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollOpenedDetails: Self = this.set("pollOpenedDetails", js.undefined)
    @scala.inline
    def setPollVotedDetails(value: SchemaLiveChatPollVotedDetails): Self = this.set("pollVotedDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollVotedDetails: Self = this.set("pollVotedDetails", js.undefined)
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishedAt: Self = this.set("publishedAt", js.undefined)
    @scala.inline
    def setSuperChatDetails(value: SchemaLiveChatSuperChatDetails): Self = this.set("superChatDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperChatDetails: Self = this.set("superChatDetails", js.undefined)
    @scala.inline
    def setSuperStickerDetails(value: SchemaLiveChatSuperStickerDetails): Self = this.set("superStickerDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperStickerDetails: Self = this.set("superStickerDetails", js.undefined)
    @scala.inline
    def setTextMessageDetails(value: SchemaLiveChatTextMessageDetails): Self = this.set("textMessageDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextMessageDetails: Self = this.set("textMessageDetails", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUserBannedDetails(value: SchemaLiveChatUserBannedMessageDetails): Self = this.set("userBannedDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserBannedDetails: Self = this.set("userBannedDetails", js.undefined)
  }
  
}

