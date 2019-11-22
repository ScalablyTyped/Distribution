package typings.instagramDashPrivateDashApi.distResponsesTagsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsFeedResponseCarouselMediaItem extends js.Object {
  var carousel_parent_id: String
  var id: String
  var image_versions2: TagsFeedResponseImage_versions2
  var is_dash_eligible: js.UndefOr[Double] = js.undefined
  var media_type: Double
  var number_of_qualities: js.UndefOr[Double] = js.undefined
  var original_height: Double
  var original_width: Double
  var pk: String
  var usertags: js.UndefOr[TagsFeedResponseUsertags] = js.undefined
  var video_codec: js.UndefOr[String] = js.undefined
  var video_dash_manifest: js.UndefOr[String] = js.undefined
  var video_duration: js.UndefOr[Double] = js.undefined
  var video_versions: js.UndefOr[js.Array[TagsFeedResponseVideoVersionsItem]] = js.undefined
}

object TagsFeedResponseCarouselMediaItem {
  @scala.inline
  def apply(
    carousel_parent_id: String,
    id: String,
    image_versions2: TagsFeedResponseImage_versions2,
    media_type: Double,
    original_height: Double,
    original_width: Double,
    pk: String,
    is_dash_eligible: Int | Double = null,
    number_of_qualities: Int | Double = null,
    usertags: TagsFeedResponseUsertags = null,
    video_codec: String = null,
    video_dash_manifest: String = null,
    video_duration: Int | Double = null,
    video_versions: js.Array[TagsFeedResponseVideoVersionsItem] = null
  ): TagsFeedResponseCarouselMediaItem = {
    val __obj = js.Dynamic.literal(carousel_parent_id = carousel_parent_id, id = id, image_versions2 = image_versions2, media_type = media_type, original_height = original_height, original_width = original_width, pk = pk)
    if (is_dash_eligible != null) __obj.updateDynamic("is_dash_eligible")(is_dash_eligible.asInstanceOf[js.Any])
    if (number_of_qualities != null) __obj.updateDynamic("number_of_qualities")(number_of_qualities.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags)
    if (video_codec != null) __obj.updateDynamic("video_codec")(video_codec)
    if (video_dash_manifest != null) __obj.updateDynamic("video_dash_manifest")(video_dash_manifest)
    if (video_duration != null) __obj.updateDynamic("video_duration")(video_duration.asInstanceOf[js.Any])
    if (video_versions != null) __obj.updateDynamic("video_versions")(video_versions)
    __obj.asInstanceOf[TagsFeedResponseCarouselMediaItem]
  }
}

