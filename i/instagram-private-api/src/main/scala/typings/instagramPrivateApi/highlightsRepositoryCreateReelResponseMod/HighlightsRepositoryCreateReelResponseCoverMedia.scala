package typings.instagramPrivateApi.highlightsRepositoryCreateReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryCreateReelResponseCoverMedia extends js.Object {
  var crop_rect: Null
  var cropped_image_version: HighlightsRepositoryCreateReelResponseCroppedImageVersion
  var full_image_version: HighlightsRepositoryCreateReelResponseFullImageVersion
  var media_id: String
}

object HighlightsRepositoryCreateReelResponseCoverMedia {
  @scala.inline
  def apply(
    crop_rect: Null,
    cropped_image_version: HighlightsRepositoryCreateReelResponseCroppedImageVersion,
    full_image_version: HighlightsRepositoryCreateReelResponseFullImageVersion,
    media_id: String
  ): HighlightsRepositoryCreateReelResponseCoverMedia = {
    val __obj = js.Dynamic.literal(crop_rect = crop_rect.asInstanceOf[js.Any], cropped_image_version = cropped_image_version.asInstanceOf[js.Any], full_image_version = full_image_version.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseCoverMedia]
  }
}

