package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatUserBannedMessageDetails extends js.Object {
  /**
    * The duration of the ban. This property is only present if the banType is
    * temporary.
    */
  var banDurationSeconds: js.UndefOr[String] = js.native
  /**
    * The type of ban.
    */
  var banType: js.UndefOr[String] = js.native
  /**
    * The details of the user that was banned.
    */
  var bannedUserDetails: js.UndefOr[SchemaChannelProfileDetails] = js.native
}

object SchemaLiveChatUserBannedMessageDetails {
  @scala.inline
  def apply(): SchemaLiveChatUserBannedMessageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatUserBannedMessageDetails]
  }
  @scala.inline
  implicit class SchemaLiveChatUserBannedMessageDetailsOps[Self <: SchemaLiveChatUserBannedMessageDetails] (val x: Self) extends AnyVal {
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
    def setBanDurationSeconds(value: String): Self = this.set("banDurationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBanDurationSeconds: Self = this.set("banDurationSeconds", js.undefined)
    @scala.inline
    def setBanType(value: String): Self = this.set("banType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBanType: Self = this.set("banType", js.undefined)
    @scala.inline
    def setBannedUserDetails(value: SchemaChannelProfileDetails): Self = this.set("bannedUserDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBannedUserDetails: Self = this.set("bannedUserDetails", js.undefined)
  }
  
}

