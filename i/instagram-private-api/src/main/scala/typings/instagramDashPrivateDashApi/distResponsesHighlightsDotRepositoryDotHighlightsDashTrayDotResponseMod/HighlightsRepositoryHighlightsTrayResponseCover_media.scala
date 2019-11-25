package typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotHighlightsDashTrayDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryHighlightsTrayResponseCover_media extends js.Object {
  var crop_rect: js.Array[Double | String]
  var cropped_image_version: HighlightsRepositoryHighlightsTrayResponseCropped_image_version
  var media_id: String
}

object HighlightsRepositoryHighlightsTrayResponseCover_media {
  @scala.inline
  def apply(
    crop_rect: js.Array[Double | String],
    cropped_image_version: HighlightsRepositoryHighlightsTrayResponseCropped_image_version,
    media_id: String
  ): HighlightsRepositoryHighlightsTrayResponseCover_media = {
    val __obj = js.Dynamic.literal(crop_rect = crop_rect.asInstanceOf[js.Any], cropped_image_version = cropped_image_version.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseCover_media]
  }
}

