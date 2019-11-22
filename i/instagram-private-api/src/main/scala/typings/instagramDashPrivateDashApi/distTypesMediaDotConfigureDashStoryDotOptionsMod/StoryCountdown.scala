package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryCountdown extends StorySticker {
  var digit_card_color: String
  var digit_color: String
  var end_background_color: String
  var end_ts: Double
  var following_enabled: Boolean
  var is_sticker: `true`
  var start_background_color: String
  var text: String
  var text_color: String
}

object StoryCountdown {
  @scala.inline
  def apply(
    digit_card_color: String,
    digit_color: String,
    end_background_color: String,
    end_ts: Double,
    following_enabled: Boolean,
    height: Double,
    is_sticker: `true`,
    rotation: Double,
    start_background_color: String,
    text: String,
    text_color: String,
    width: Double,
    x: Double,
    y: Double
  ): StoryCountdown = {
    val __obj = js.Dynamic.literal(digit_card_color = digit_card_color, digit_color = digit_color, end_background_color = end_background_color, end_ts = end_ts, following_enabled = following_enabled, height = height, is_sticker = is_sticker, rotation = rotation, start_background_color = start_background_color, text = text, text_color = text_color, width = width, x = x, y = y)
  
    __obj.asInstanceOf[StoryCountdown]
  }
}

