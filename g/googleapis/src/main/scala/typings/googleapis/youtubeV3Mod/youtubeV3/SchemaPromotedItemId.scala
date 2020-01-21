package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a single promoted item id. It is a union of various possible
  * types.
  */
@js.native
trait SchemaPromotedItemId extends js.Object {
  /**
    * If type is recentUpload, this field identifies the channel from which to
    * take the recent upload. If missing, the channel is assumed to be the same
    * channel for which the invideoPromotion is set.
    */
  var recentlyUploadedBy: js.UndefOr[String] = js.native
  /**
    * Describes the type of the promoted item.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * If the promoted item represents a video, this field represents the unique
    * YouTube ID identifying it. This field will be present only if type has
    * the value video.
    */
  var videoId: js.UndefOr[String] = js.native
  /**
    * If the promoted item represents a website, this field represents the url
    * pointing to the website. This field will be present only if type has the
    * value website.
    */
  var websiteUrl: js.UndefOr[String] = js.native
}

object SchemaPromotedItemId {
  @scala.inline
  def apply(
    recentlyUploadedBy: String = null,
    `type`: String = null,
    videoId: String = null,
    websiteUrl: String = null
  ): SchemaPromotedItemId = {
    val __obj = js.Dynamic.literal()
    if (recentlyUploadedBy != null) __obj.updateDynamic("recentlyUploadedBy")(recentlyUploadedBy.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPromotedItemId]
  }
}

