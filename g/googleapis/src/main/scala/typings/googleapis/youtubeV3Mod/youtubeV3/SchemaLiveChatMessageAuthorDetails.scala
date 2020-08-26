package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatMessageAuthorDetails extends js.Object {
  /**
    * The YouTube channel ID.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The channel&#39;s URL.
    */
  var channelUrl: js.UndefOr[String] = js.native
  /**
    * The channel&#39;s display name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Whether the author is a moderator of the live chat.
    */
  var isChatModerator: js.UndefOr[Boolean] = js.native
  /**
    * Whether the author is the owner of the live chat.
    */
  var isChatOwner: js.UndefOr[Boolean] = js.native
  /**
    * Whether the author is a sponsor of the live chat.
    */
  var isChatSponsor: js.UndefOr[Boolean] = js.native
  /**
    * Whether the author&#39;s identity has been verified by YouTube.
    */
  var isVerified: js.UndefOr[Boolean] = js.native
  /**
    * The channels&#39;s avatar URL.
    */
  var profileImageUrl: js.UndefOr[String] = js.native
}

object SchemaLiveChatMessageAuthorDetails {
  @scala.inline
  def apply(): SchemaLiveChatMessageAuthorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatMessageAuthorDetails]
  }
  @scala.inline
  implicit class SchemaLiveChatMessageAuthorDetailsOps[Self <: SchemaLiveChatMessageAuthorDetails] (val x: Self) extends AnyVal {
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setChannelUrl(value: String): Self = this.set("channelUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelUrl: Self = this.set("channelUrl", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setIsChatModerator(value: Boolean): Self = this.set("isChatModerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChatModerator: Self = this.set("isChatModerator", js.undefined)
    @scala.inline
    def setIsChatOwner(value: Boolean): Self = this.set("isChatOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChatOwner: Self = this.set("isChatOwner", js.undefined)
    @scala.inline
    def setIsChatSponsor(value: Boolean): Self = this.set("isChatSponsor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChatSponsor: Self = this.set("isChatSponsor", js.undefined)
    @scala.inline
    def setIsVerified(value: Boolean): Self = this.set("isVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVerified: Self = this.set("isVerified", js.undefined)
    @scala.inline
    def setProfileImageUrl(value: String): Self = this.set("profileImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileImageUrl: Self = this.set("profileImageUrl", js.undefined)
  }
  
}

