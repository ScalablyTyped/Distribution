package typings.instagramPrivateApi.newsFeedResponseMod

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
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], profile_id = profile_id.asInstanceOf[js.Any], profile_image = profile_image.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tuuid = tuuid.asInstanceOf[js.Any])
    if (comment_id != null) __obj.updateDynamic("comment_id")(comment_id.asInstanceOf[js.Any])
    if (comment_ids != null) __obj.updateDynamic("comment_ids")(comment_ids.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (profile_image_destination != null) __obj.updateDynamic("profile_image_destination")(profile_image_destination.asInstanceOf[js.Any])
    if (second_profile_id != null) __obj.updateDynamic("second_profile_id")(second_profile_id.asInstanceOf[js.Any])
    if (second_profile_image != null) __obj.updateDynamic("second_profile_image")(second_profile_image.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsFeedResponseArgs]
  }
}

