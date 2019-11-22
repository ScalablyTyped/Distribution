package typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotCreateDashReelDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryCreateReelResponseCover_media extends js.Object {
  var crop_rect: Null
  var cropped_image_version: HighlightsRepositoryCreateReelResponseCropped_image_version
  var full_image_version: HighlightsRepositoryCreateReelResponseFull_image_version
  var media_id: String
}

object HighlightsRepositoryCreateReelResponseCover_media {
  @scala.inline
  def apply(
    crop_rect: Null,
    cropped_image_version: HighlightsRepositoryCreateReelResponseCropped_image_version,
    full_image_version: HighlightsRepositoryCreateReelResponseFull_image_version,
    media_id: String
  ): HighlightsRepositoryCreateReelResponseCover_media = {
    val __obj = js.Dynamic.literal(crop_rect = crop_rect, cropped_image_version = cropped_image_version, full_image_version = full_image_version, media_id = media_id)
  
    __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseCover_media]
  }
}

