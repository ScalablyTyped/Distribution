package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryCountdown extends StorySticker {
  
  var digit_card_color: String = js.native
  
  var digit_color: String = js.native
  
  var end_background_color: String = js.native
  
  var end_ts: Double = js.native
  
  var following_enabled: Boolean = js.native
  
  var is_sticker: `true` = js.native
  
  var start_background_color: String = js.native
  
  var text: String = js.native
  
  var text_color: String = js.native
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
    val __obj = js.Dynamic.literal(digit_card_color = digit_card_color.asInstanceOf[js.Any], digit_color = digit_color.asInstanceOf[js.Any], end_background_color = end_background_color.asInstanceOf[js.Any], end_ts = end_ts.asInstanceOf[js.Any], following_enabled = following_enabled.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], start_background_color = start_background_color.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryCountdown]
  }
  
  @scala.inline
  implicit class StoryCountdownMutableBuilder[Self <: StoryCountdown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigit_card_color(value: String): Self = StObject.set(x, "digit_card_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigit_color(value: String): Self = StObject.set(x, "digit_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_background_color(value: String): Self = StObject.set(x, "end_background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_ts(value: Double): Self = StObject.set(x, "end_ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing_enabled(value: Boolean): Self = StObject.set(x, "following_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_sticker(value: `true`): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_background_color(value: String): Self = StObject.set(x, "start_background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_color(value: String): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
  }
}
