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
    val __obj = js.Dynamic.literal(max_thumbnails_per_sprite = max_thumbnails_per_sprite, rendered_width = rendered_width, sprite_height = sprite_height, sprite_urls = sprite_urls, sprite_width = sprite_width, thumbnail_duration = thumbnail_duration, thumbnail_height = thumbnail_height, thumbnail_width = thumbnail_width, thumbnails_per_row = thumbnails_per_row, video_length = video_length)
  
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseThumbnails]
  }
}

