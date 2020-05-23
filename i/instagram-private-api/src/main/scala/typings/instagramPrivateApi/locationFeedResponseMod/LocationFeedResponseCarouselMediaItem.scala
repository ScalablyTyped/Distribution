package typings.instagramPrivateApi.locationFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationFeedResponseCarouselMediaItem extends js.Object {
  var carousel_parent_id: String
  var id: String
  var image_versions2: LocationFeedResponseImageVersions2
  var is_dash_eligible: js.UndefOr[Double] = js.undefined
  var media_type: Double
  var number_of_qualities: js.UndefOr[Double] = js.undefined
  var original_height: Double
  var original_width: Double
  var pk: String
  var usertags: js.UndefOr[LocationFeedResponseUsertags] = js.undefined
  var video_codec: js.UndefOr[String] = js.undefined
  var video_dash_manifest: js.UndefOr[String] = js.undefined
  var video_duration: js.UndefOr[Double] = js.undefined
  var video_versions: js.UndefOr[js.Array[LocationFeedResponseVideoVersionsItem]] = js.undefined
}

object LocationFeedResponseCarouselMediaItem {
  @scala.inline
  def apply(
    carousel_parent_id: String,
    id: String,
    image_versions2: LocationFeedResponseImageVersions2,
    media_type: Double,
    original_height: Double,
    original_width: Double,
    pk: String,
    is_dash_eligible: js.UndefOr[Double] = js.undefined,
    number_of_qualities: js.UndefOr[Double] = js.undefined,
    usertags: LocationFeedResponseUsertags = null,
    video_codec: String = null,
    video_dash_manifest: String = null,
    video_duration: js.UndefOr[Double] = js.undefined,
    video_versions: js.Array[LocationFeedResponseVideoVersionsItem] = null
  ): LocationFeedResponseCarouselMediaItem = {
    val __obj = js.Dynamic.literal(carousel_parent_id = carousel_parent_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any])
    if (!js.isUndefined(is_dash_eligible)) __obj.updateDynamic("is_dash_eligible")(is_dash_eligible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(number_of_qualities)) __obj.updateDynamic("number_of_qualities")(number_of_qualities.get.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    if (video_codec != null) __obj.updateDynamic("video_codec")(video_codec.asInstanceOf[js.Any])
    if (video_dash_manifest != null) __obj.updateDynamic("video_dash_manifest")(video_dash_manifest.asInstanceOf[js.Any])
    if (!js.isUndefined(video_duration)) __obj.updateDynamic("video_duration")(video_duration.get.asInstanceOf[js.Any])
    if (video_versions != null) __obj.updateDynamic("video_versions")(video_versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseCarouselMediaItem]
  }
}

