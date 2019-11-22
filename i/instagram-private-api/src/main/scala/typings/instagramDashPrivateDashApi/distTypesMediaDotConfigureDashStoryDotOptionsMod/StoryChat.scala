package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`false`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryChat extends StorySticker {
  var end_background_color: String
  var has_started_chat: `false`
  var is_sticker: `true`
  var start_background_color: String
  var text: String
}

object StoryChat {
  @scala.inline
  def apply(
    end_background_color: String,
    has_started_chat: `false`,
    height: Double,
    is_sticker: `true`,
    rotation: Double,
    start_background_color: String,
    text: String,
    width: Double,
    x: Double,
    y: Double
  ): StoryChat = {
    val __obj = js.Dynamic.literal(end_background_color = end_background_color, has_started_chat = has_started_chat, height = height, is_sticker = is_sticker, rotation = rotation, start_background_color = start_background_color, text = text, width = width, x = x, y = y)
  
    __obj.asInstanceOf[StoryChat]
  }
}

