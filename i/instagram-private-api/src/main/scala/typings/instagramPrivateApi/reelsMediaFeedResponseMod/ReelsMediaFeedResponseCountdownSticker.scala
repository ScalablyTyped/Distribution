package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsMediaFeedResponseCountdownSticker extends js.Object {
  var attribution: Null
  var countdown_id: Double
  var digit_card_color: String
  var digit_color: String
  var end_background_color: String
  var end_ts: Double
  var following_enabled: Boolean
  var is_owner: Boolean
  var start_background_color: String
  var text: String
  var text_color: String
  var viewer_is_following: Boolean
}

object ReelsMediaFeedResponseCountdownSticker {
  @scala.inline
  def apply(
    attribution: Null,
    countdown_id: Double,
    digit_card_color: String,
    digit_color: String,
    end_background_color: String,
    end_ts: Double,
    following_enabled: Boolean,
    is_owner: Boolean,
    start_background_color: String,
    text: String,
    text_color: String,
    viewer_is_following: Boolean
  ): ReelsMediaFeedResponseCountdownSticker = {
    val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], countdown_id = countdown_id.asInstanceOf[js.Any], digit_card_color = digit_card_color.asInstanceOf[js.Any], digit_color = digit_color.asInstanceOf[js.Any], end_background_color = end_background_color.asInstanceOf[js.Any], end_ts = end_ts.asInstanceOf[js.Any], following_enabled = following_enabled.asInstanceOf[js.Any], is_owner = is_owner.asInstanceOf[js.Any], start_background_color = start_background_color.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_is_following = viewer_is_following.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReelsMediaFeedResponseCountdownSticker]
  }
}

