package typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotHighlightsDashTrayDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryHighlightsTrayResponseThumbnails extends js.Object {
  var max_thumbnails_per_sprite: Double
  var rendered_width: Double
  var sprite_height: Double
  var sprite_urls: js.Array[String]
  var sprite_width: Double
  var thumbnail_duration: String
  var thumbnail_height: Double
  var thumbnail_width: Double
  var thumbnails_per_row: Double
  var video_length: Double
}

object HighlightsRepositoryHighlightsTrayResponseThumbnails {
  @scala.inline
  def apply(
    max_thumbnails_per_sprite: Double,
    rendered_width: Double,
    sprite_height: Double,
    sprite_urls: js.Array[String],
    sprite_width: Double,
    thumbnail_duration: String,
    thumbnail_height: Double,
    thumbnail_width: Double,
    thumbnails_per_row: Double,
    video_length: Double
  ): HighlightsRepositoryHighlightsTrayResponseThumbnails = {
    val __obj = js.Dynamic.literal(max_thumbnails_per_sprite = max_thumbnails_per_sprite.asInstanceOf[js.Any], rendered_width = rendered_width.asInstanceOf[js.Any], sprite_height = sprite_height.asInstanceOf[js.Any], sprite_urls = sprite_urls.asInstanceOf[js.Any], sprite_width = sprite_width.asInstanceOf[js.Any], thumbnail_duration = thumbnail_duration.asInstanceOf[js.Any], thumbnail_height = thumbnail_height.asInstanceOf[js.Any], thumbnail_width = thumbnail_width.asInstanceOf[js.Any], thumbnails_per_row = thumbnails_per_row.asInstanceOf[js.Any], video_length = video_length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseThumbnails]
  }
}

