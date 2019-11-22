package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryAttachedMedia extends StorySticker {
  var is_sticker: Boolean
  var media_id: String
}

object StoryAttachedMedia {
  @scala.inline
  def apply(
    height: Double,
    is_sticker: Boolean,
    media_id: String,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double
  ): StoryAttachedMedia = {
    val __obj = js.Dynamic.literal(height = height, is_sticker = is_sticker, media_id = media_id, rotation = rotation, width = width, x = x, y = y)
  
    __obj.asInstanceOf[StoryAttachedMedia]
  }
}

