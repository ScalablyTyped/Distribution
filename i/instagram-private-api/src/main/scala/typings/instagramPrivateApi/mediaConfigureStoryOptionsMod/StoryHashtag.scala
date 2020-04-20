package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], use_custom_title = use_custom_title.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryHashtag]
  }
}

