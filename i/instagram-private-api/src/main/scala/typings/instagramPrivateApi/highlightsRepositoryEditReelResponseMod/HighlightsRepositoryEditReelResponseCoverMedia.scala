package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryEditReelResponseCoverMedia extends js.Object {
  var crop_rect: js.Array[Double]
  var cropped_image_version: HighlightsRepositoryEditReelResponseCroppedImageVersion
  var full_image_version: HighlightsRepositoryEditReelResponseFullImageVersion
  var media_id: String
}

object HighlightsRepositoryEditReelResponseCoverMedia {
  @scala.inline
  def apply(
    crop_rect: js.Array[Double],
    cropped_image_version: HighlightsRepositoryEditReelResponseCroppedImageVersion,
    full_image_version: HighlightsRepositoryEditReelResponseFullImageVersion,
    media_id: String
  ): HighlightsRepositoryEditReelResponseCoverMedia = {
    val __obj = js.Dynamic.literal(crop_rect = crop_rect.asInstanceOf[js.Any], cropped_image_version = cropped_image_version.asInstanceOf[js.Any], full_image_version = full_image_version.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseCoverMedia]
  }
}

