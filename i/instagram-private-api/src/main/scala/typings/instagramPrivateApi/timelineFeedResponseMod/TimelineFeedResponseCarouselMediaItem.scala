package typings.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponseCarouselMediaItem extends js.Object {
  var ad_action: js.UndefOr[String] = js.undefined
  var ad_link_type: js.UndefOr[Double] = js.undefined
  var ad_metadata: js.UndefOr[js.Array[TimelineFeedResponseAdMetadataItem]] = js.undefined
  var android_links: js.UndefOr[js.Array[TimelineFeedResponseAndroidLinksItem]] = js.undefined
  var carousel_parent_id: String
  var dominant_color: js.UndefOr[String] = js.undefined
  var force_overlay: js.UndefOr[Boolean] = js.undefined
  var headline: js.UndefOr[TimelineFeedResponseHeadline] = js.undefined
  var hide_nux_text: js.UndefOr[Boolean] = js.undefined
  var id: String
  var image_versions2: TimelineFeedResponseImageVersions2
  var link: js.UndefOr[String] = js.undefined
  var link_hint_text: js.UndefOr[String] = js.undefined
  var link_text: js.UndefOr[String] = js.undefined
  var media_type: Double
  var original_height: Double
  var original_width: Double
  var overlay_subtitle: js.UndefOr[String] = js.undefined
  var overlay_text: js.UndefOr[String] = js.undefined
  var overlay_title: js.UndefOr[String] = js.undefined
  var pk: String
  var usertags: js.UndefOr[TimelineFeedResponseUsertags] = js.undefined
  var video_subtitles_uri: js.UndefOr[Null] = js.undefined
}

object TimelineFeedResponseCarouselMediaItem {
  @scala.inline
  def apply(
    carousel_parent_id: String,
    id: String,
    image_versions2: TimelineFeedResponseImageVersions2,
    media_type: Double,
    original_height: Double,
    original_width: Double,
    pk: String,
    ad_action: String = null,
    ad_link_type: js.UndefOr[Double] = js.undefined,
    ad_metadata: js.Array[TimelineFeedResponseAdMetadataItem] = null,
    android_links: js.Array[TimelineFeedResponseAndroidLinksItem] = null,
    dominant_color: String = null,
    force_overlay: js.UndefOr[Boolean] = js.undefined,
    headline: TimelineFeedResponseHeadline = null,
    hide_nux_text: js.UndefOr[Boolean] = js.undefined,
    link: String = null,
    link_hint_text: String = null,
    link_text: String = null,
    overlay_subtitle: String = null,
    overlay_text: String = null,
    overlay_title: String = null,
    usertags: TimelineFeedResponseUsertags = null
  ): TimelineFeedResponseCarouselMediaItem = {
    val __obj = js.Dynamic.literal(carousel_parent_id = carousel_parent_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any])
    if (ad_action != null) __obj.updateDynamic("ad_action")(ad_action.asInstanceOf[js.Any])
    if (!js.isUndefined(ad_link_type)) __obj.updateDynamic("ad_link_type")(ad_link_type.get.asInstanceOf[js.Any])
    if (ad_metadata != null) __obj.updateDynamic("ad_metadata")(ad_metadata.asInstanceOf[js.Any])
    if (android_links != null) __obj.updateDynamic("android_links")(android_links.asInstanceOf[js.Any])
    if (dominant_color != null) __obj.updateDynamic("dominant_color")(dominant_color.asInstanceOf[js.Any])
    if (!js.isUndefined(force_overlay)) __obj.updateDynamic("force_overlay")(force_overlay.get.asInstanceOf[js.Any])
    if (headline != null) __obj.updateDynamic("headline")(headline.asInstanceOf[js.Any])
    if (!js.isUndefined(hide_nux_text)) __obj.updateDynamic("hide_nux_text")(hide_nux_text.get.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (link_hint_text != null) __obj.updateDynamic("link_hint_text")(link_hint_text.asInstanceOf[js.Any])
    if (link_text != null) __obj.updateDynamic("link_text")(link_text.asInstanceOf[js.Any])
    if (overlay_subtitle != null) __obj.updateDynamic("overlay_subtitle")(overlay_subtitle.asInstanceOf[js.Any])
    if (overlay_text != null) __obj.updateDynamic("overlay_text")(overlay_text.asInstanceOf[js.Any])
    if (overlay_title != null) __obj.updateDynamic("overlay_title")(overlay_title.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseCarouselMediaItem]
  }
}

