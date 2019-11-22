package typings.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotConfigureDashSidecarDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRepositoryConfigureSidecarResponseCarouselMediaItem extends js.Object {
  var carousel_parent_id: String
  var fb_user_tags: js.UndefOr[MediaRepositoryConfigureSidecarResponseFb_user_tags] = js.undefined
  var id: String
  var image_versions2: MediaRepositoryConfigureSidecarResponseImage_versions2
  var media_type: Double
  var original_height: Double
  var original_width: Double
  var pk: String
  var usertags: js.UndefOr[MediaRepositoryConfigureSidecarResponseUsertags] = js.undefined
  var video_duration: js.UndefOr[Double] = js.undefined
  var video_versions: js.UndefOr[js.Array[MediaRepositoryConfigureSidecarResponseVideoVersionsItem]] = js.undefined
}

object MediaRepositoryConfigureSidecarResponseCarouselMediaItem {
  @scala.inline
  def apply(
    carousel_parent_id: String,
    id: String,
    image_versions2: MediaRepositoryConfigureSidecarResponseImage_versions2,
    media_type: Double,
    original_height: Double,
    original_width: Double,
    pk: String,
    fb_user_tags: MediaRepositoryConfigureSidecarResponseFb_user_tags = null,
    usertags: MediaRepositoryConfigureSidecarResponseUsertags = null,
    video_duration: Int | Double = null,
    video_versions: js.Array[MediaRepositoryConfigureSidecarResponseVideoVersionsItem] = null
  ): MediaRepositoryConfigureSidecarResponseCarouselMediaItem = {
    val __obj = js.Dynamic.literal(carousel_parent_id = carousel_parent_id, id = id, image_versions2 = image_versions2, media_type = media_type, original_height = original_height, original_width = original_width, pk = pk)
    if (fb_user_tags != null) __obj.updateDynamic("fb_user_tags")(fb_user_tags)
    if (usertags != null) __obj.updateDynamic("usertags")(usertags)
    if (video_duration != null) __obj.updateDynamic("video_duration")(video_duration.asInstanceOf[js.Any])
    if (video_versions != null) __obj.updateDynamic("video_versions")(video_versions)
    __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseCarouselMediaItem]
  }
}

