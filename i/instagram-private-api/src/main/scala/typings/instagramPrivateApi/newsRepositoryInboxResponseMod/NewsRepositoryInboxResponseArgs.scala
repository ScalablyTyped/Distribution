package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewsRepositoryInboxResponseArgs extends js.Object {
  var actions: js.UndefOr[js.Array[String]] = js.undefined
  var aymt_channel_id: js.UndefOr[String] = js.undefined
  var aymt_notif_id: js.UndefOr[String] = js.undefined
  var aymt_notif_type: js.UndefOr[String] = js.undefined
  var clicked: Boolean
  var comment_id: js.UndefOr[String] = js.undefined
  var comment_ids: js.UndefOr[js.Array[String]] = js.undefined
  var comment_notif_type: js.UndefOr[String] = js.undefined
  var destination: js.UndefOr[String] = js.undefined
  var hashtag_follow: js.UndefOr[NewsRepositoryInboxResponseHashtagFollow] = js.undefined
  var icon_url: js.UndefOr[String] = js.undefined
  var latest_reel_media: js.UndefOr[Double] = js.undefined
  var links: js.UndefOr[js.Array[NewsRepositoryInboxResponseLinksItem]] = js.undefined
  var media: js.UndefOr[js.Array[NewsRepositoryInboxResponseMediaItem]] = js.undefined
  var profile_id: js.UndefOr[Double] = js.undefined
  var profile_image: js.UndefOr[String] = js.undefined
  var profile_image_destination: js.UndefOr[String] = js.undefined
  var profile_name: js.UndefOr[String] = js.undefined
  var rich_text: js.UndefOr[String] = js.undefined
  var second_profile_id: js.UndefOr[Double] = js.undefined
  var second_profile_image: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var timestamp: String
  var tuuid: String
}

object NewsRepositoryInboxResponseArgs {
  @scala.inline
  def apply(
    clicked: Boolean,
    timestamp: String,
    tuuid: String,
    actions: js.Array[String] = null,
    aymt_channel_id: String = null,
    aymt_notif_id: String = null,
    aymt_notif_type: String = null,
    comment_id: String = null,
    comment_ids: js.Array[String] = null,
    comment_notif_type: String = null,
    destination: String = null,
    hashtag_follow: NewsRepositoryInboxResponseHashtagFollow = null,
    icon_url: String = null,
    latest_reel_media: js.UndefOr[Double] = js.undefined,
    links: js.Array[NewsRepositoryInboxResponseLinksItem] = null,
    media: js.Array[NewsRepositoryInboxResponseMediaItem] = null,
    profile_id: js.UndefOr[Double] = js.undefined,
    profile_image: String = null,
    profile_image_destination: String = null,
    profile_name: String = null,
    rich_text: String = null,
    second_profile_id: js.UndefOr[Double] = js.undefined,
    second_profile_image: String = null,
    text: String = null
  ): NewsRepositoryInboxResponseArgs = {
    val __obj = js.Dynamic.literal(clicked = clicked.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tuuid = tuuid.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (aymt_channel_id != null) __obj.updateDynamic("aymt_channel_id")(aymt_channel_id.asInstanceOf[js.Any])
    if (aymt_notif_id != null) __obj.updateDynamic("aymt_notif_id")(aymt_notif_id.asInstanceOf[js.Any])
    if (aymt_notif_type != null) __obj.updateDynamic("aymt_notif_type")(aymt_notif_type.asInstanceOf[js.Any])
    if (comment_id != null) __obj.updateDynamic("comment_id")(comment_id.asInstanceOf[js.Any])
    if (comment_ids != null) __obj.updateDynamic("comment_ids")(comment_ids.asInstanceOf[js.Any])
    if (comment_notif_type != null) __obj.updateDynamic("comment_notif_type")(comment_notif_type.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (hashtag_follow != null) __obj.updateDynamic("hashtag_follow")(hashtag_follow.asInstanceOf[js.Any])
    if (icon_url != null) __obj.updateDynamic("icon_url")(icon_url.asInstanceOf[js.Any])
    if (!js.isUndefined(latest_reel_media)) __obj.updateDynamic("latest_reel_media")(latest_reel_media.get.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (!js.isUndefined(profile_id)) __obj.updateDynamic("profile_id")(profile_id.get.asInstanceOf[js.Any])
    if (profile_image != null) __obj.updateDynamic("profile_image")(profile_image.asInstanceOf[js.Any])
    if (profile_image_destination != null) __obj.updateDynamic("profile_image_destination")(profile_image_destination.asInstanceOf[js.Any])
    if (profile_name != null) __obj.updateDynamic("profile_name")(profile_name.asInstanceOf[js.Any])
    if (rich_text != null) __obj.updateDynamic("rich_text")(rich_text.asInstanceOf[js.Any])
    if (!js.isUndefined(second_profile_id)) __obj.updateDynamic("second_profile_id")(second_profile_id.get.asInstanceOf[js.Any])
    if (second_profile_image != null) __obj.updateDynamic("second_profile_image")(second_profile_image.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseArgs]
  }
}

