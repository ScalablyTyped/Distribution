package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiBooleans.`false`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiBooleans.`true`
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
    val __obj = js.Dynamic.literal(end_background_color = end_background_color.asInstanceOf[js.Any], has_started_chat = has_started_chat.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], start_background_color = start_background_color.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryChat]
  }
}

