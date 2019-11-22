package typings.instagramDashPrivateDashApi.distResponsesNewsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewsFeedResponseArgs extends js.Object {
  var comment_id: js.UndefOr[String] = js.undefined
  var comment_ids: js.UndefOr[js.Array[String]] = js.undefined
  var links: js.Array[NewsFeedResponseLinksItem]
  var media: js.UndefOr[js.Array[NewsFeedResponseMediaItem]] = js.undefined
  var profile_id: Double
  var profile_image: String
  var profile_image_destination: js.UndefOr[String] = js.undefined
  var second_profile_id: js.UndefOr[Double] = js.undefined
  var second_profile_image: js.UndefOr[String] = js.undefined
  var text: String
  var timestamp: Double
  var tuuid: String
}

object NewsFeedResponseArgs {
  @scala.inline
  def apply(
    links: js.Array[NewsFeedResponseLinksItem],
    profile_id: Double,
    profile_image: String,
    text: String,
    timestamp: Double,
    tuuid: String,
    comment_id: String = null,
    comment_ids: js.Array[String] = null,
    media: js.Array[NewsFeedResponseMediaItem] = null,
    profile_image_destination: String = null,
    second_profile_id: Int | Double = null,
    second_profile_image: String = null
  ): NewsFeedResponseArgs = {
    val __obj = js.Dynamic.literal(links = links, profile_id = profile_id, profile_image = profile_image, text = text, timestamp = timestamp, tuuid = tuuid)
    if (comment_id != null) __obj.updateDynamic("comment_id")(comment_id)
    if (comment_ids != null) __obj.updateDynamic("comment_ids")(comment_ids)
    if (media != null) __obj.updateDynamic("media")(media)
    if (profile_image_destination != null) __obj.updateDynamic("profile_image_destination")(profile_image_destination)
    if (second_profile_id != null) __obj.updateDynamic("second_profile_id")(second_profile_id.asInstanceOf[js.Any])
    if (second_profile_image != null) __obj.updateDynamic("second_profile_image")(second_profile_image)
    __obj.asInstanceOf[NewsFeedResponseArgs]
  }
}

