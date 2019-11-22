package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryHashtag extends StorySticker {
  var is_sticker: Boolean
  var tag_name: String
  var use_custom_title: Boolean
}

object StoryHashtag {
  @scala.inline
  def apply(
    height: Double,
    is_sticker: Boolean,
    rotation: Double,
    tag_name: String,
    use_custom_title: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): StoryHashtag = {
    val __obj = js.Dynamic.literal(height = height, is_sticker = is_sticker, rotation = rotation, tag_name = tag_name, use_custom_title = use_custom_title, width = width, x = x, y = y)
  
    __obj.asInstanceOf[StoryHashtag]
  }
}

