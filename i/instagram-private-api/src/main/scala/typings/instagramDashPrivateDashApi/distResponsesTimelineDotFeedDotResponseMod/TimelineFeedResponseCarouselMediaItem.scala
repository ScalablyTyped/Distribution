package typings.instagramDashPrivateDashApi.distResponsesTimelineDotFeedDotResponseMod

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
  var image_versions2: TimelineFeedResponseImage_versions2
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
    image_versions2: TimelineFeedResponseImage_versions2,
    media_type: Double,
    original_height: Double,
    original_width: Double,
    pk: String,
    ad_action: String = null,
    ad_link_type: Int | Double = null,
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
    usertags: TimelineFeedResponseUsertags = null,
    video_subtitles_uri: Null = null
  ): TimelineFeedResponseCarouselMediaItem = {
    val __obj = js.Dynamic.literal(carousel_parent_id = carousel_parent_id, id = id, image_versions2 = image_versions2, media_type = media_type, original_height = original_height, original_width = original_width, pk = pk)
    if (ad_action != null) __obj.updateDynamic("ad_action")(ad_action)
    if (ad_link_type != null) __obj.updateDynamic("ad_link_type")(ad_link_type.asInstanceOf[js.Any])
    if (ad_metadata != null) __obj.updateDynamic("ad_metadata")(ad_metadata)
    if (android_links != null) __obj.updateDynamic("android_links")(android_links)
    if (dominant_color != null) __obj.updateDynamic("dominant_color")(dominant_color)
    if (!js.isUndefined(force_overlay)) __obj.updateDynamic("force_overlay")(force_overlay)
    if (headline != null) __obj.updateDynamic("headline")(headline)
    if (!js.isUndefined(hide_nux_text)) __obj.updateDynamic("hide_nux_text")(hide_nux_text)
    if (link != null) __obj.updateDynamic("link")(link)
    if (link_hint_text != null) __obj.updateDynamic("link_hint_text")(link_hint_text)
    if (link_text != null) __obj.updateDynamic("link_text")(link_text)
    if (overlay_subtitle != null) __obj.updateDynamic("overlay_subtitle")(overlay_subtitle)
    if (overlay_text != null) __obj.updateDynamic("overlay_text")(overlay_text)
    if (overlay_title != null) __obj.updateDynamic("overlay_title")(overlay_title)
    if (usertags != null) __obj.updateDynamic("usertags")(usertags)
    if (video_subtitles_uri != null) __obj.updateDynamic("video_subtitles_uri")(video_subtitles_uri)
    __obj.asInstanceOf[TimelineFeedResponseCarouselMediaItem]
  }
}

