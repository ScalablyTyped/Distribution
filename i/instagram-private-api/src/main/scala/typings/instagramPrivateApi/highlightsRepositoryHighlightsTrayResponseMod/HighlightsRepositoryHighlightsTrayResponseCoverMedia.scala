package typings.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryHighlightsTrayResponseCoverMedia extends js.Object {
  var crop_rect: js.Array[Double | String]
  var cropped_image_version: HighlightsRepositoryHighlightsTrayResponseCroppedImageVersion
  var media_id: String
}

object HighlightsRepositoryHighlightsTrayResponseCoverMedia {
  @scala.inline
  def apply(
    crop_rect: js.Array[Double | String],
    cropped_image_version: HighlightsRepositoryHighlightsTrayResponseCroppedImageVersion,
    media_id: String
  ): HighlightsRepositoryHighlightsTrayResponseCoverMedia = {
    val __obj = js.Dynamic.literal(crop_rect = crop_rect.asInstanceOf[js.Any], cropped_image_version = cropped_image_version.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseCoverMedia]
  }
}

