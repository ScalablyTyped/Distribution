package typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotEditDashReelDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryEditReelResponseCover_media extends js.Object {
  var crop_rect: js.Array[Double]
  var cropped_image_version: HighlightsRepositoryEditReelResponseCropped_image_version
  var full_image_version: HighlightsRepositoryEditReelResponseFull_image_version
  var media_id: String
}

object HighlightsRepositoryEditReelResponseCover_media {
  @scala.inline
  def apply(
    crop_rect: js.Array[Double],
    cropped_image_version: HighlightsRepositoryEditReelResponseCropped_image_version,
    full_image_version: HighlightsRepositoryEditReelResponseFull_image_version,
    media_id: String
  ): HighlightsRepositoryEditReelResponseCover_media = {
    val __obj = js.Dynamic.literal(crop_rect = crop_rect, cropped_image_version = cropped_image_version, full_image_version = full_image_version, media_id = media_id)
  
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseCover_media]
  }
}

