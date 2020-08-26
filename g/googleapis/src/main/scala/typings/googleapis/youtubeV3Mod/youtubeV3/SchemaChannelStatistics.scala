package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Statistics about a channel: number of subscribers, number of videos in the
  * channel, etc.
  */
@js.native
trait SchemaChannelStatistics extends js.Object {
  /**
    * The number of comments for the channel.
    */
  var commentCount: js.UndefOr[String] = js.native
  /**
    * Whether or not the number of subscribers is shown for this user.
    */
  var hiddenSubscriberCount: js.UndefOr[Boolean] = js.native
  /**
    * The number of subscribers that the channel has.
    */
  var subscriberCount: js.UndefOr[String] = js.native
  /**
    * The number of videos uploaded to the channel.
    */
  var videoCount: js.UndefOr[String] = js.native
  /**
    * The number of times the channel has been viewed.
    */
  var viewCount: js.UndefOr[String] = js.native
}

object SchemaChannelStatistics {
  @scala.inline
  def apply(): SchemaChannelStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelStatistics]
  }
  @scala.inline
  implicit class SchemaChannelStatisticsOps[Self <: SchemaChannelStatistics] (val x: Self) extends AnyVal {
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
    def setCommentCount(value: String): Self = this.set("commentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentCount: Self = this.set("commentCount", js.undefined)
    @scala.inline
    def setHiddenSubscriberCount(value: Boolean): Self = this.set("hiddenSubscriberCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenSubscriberCount: Self = this.set("hiddenSubscriberCount", js.undefined)
    @scala.inline
    def setSubscriberCount(value: String): Self = this.set("subscriberCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriberCount: Self = this.set("subscriberCount", js.undefined)
    @scala.inline
    def setVideoCount(value: String): Self = this.set("videoCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoCount: Self = this.set("videoCount", js.undefined)
    @scala.inline
    def setViewCount(value: String): Self = this.set("viewCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewCount: Self = this.set("viewCount", js.undefined)
  }
  
}

