package typings.instagramPrivateApi.mediaRepositoryConfigureSidecarResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRepositoryConfigureSidecarResponseCarouselMediaItem extends js.Object {
  var carousel_parent_id: String
  var fb_user_tags: js.UndefOr[MediaRepositoryConfigureSidecarResponseFbUserTags] = js.undefined
  var id: String
  var image_versions2: MediaRepositoryConfigureSidecarResponseImageVersions2
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
    image_versions2: MediaRepositoryConfigureSidecarResponseImageVersions2,
    media_type: Double,
    original_height: Double,
    original_width: Double,
    pk: String,
    fb_user_tags: MediaRepositoryConfigureSidecarResponseFbUserTags = null,
    usertags: MediaRepositoryConfigureSidecarResponseUsertags = null,
    video_duration: Int | Double = null,
    video_versions: js.Array[MediaRepositoryConfigureSidecarResponseVideoVersionsItem] = null
  ): MediaRepositoryConfigureSidecarResponseCarouselMediaItem = {
    val __obj = js.Dynamic.literal(carousel_parent_id = carousel_parent_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any])
    if (fb_user_tags != null) __obj.updateDynamic("fb_user_tags")(fb_user_tags.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    if (video_duration != null) __obj.updateDynamic("video_duration")(video_duration.asInstanceOf[js.Any])
    if (video_versions != null) __obj.updateDynamic("video_versions")(video_versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseCarouselMediaItem]
  }
}

