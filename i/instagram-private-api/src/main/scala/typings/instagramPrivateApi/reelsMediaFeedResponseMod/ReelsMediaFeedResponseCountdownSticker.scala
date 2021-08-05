package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsMediaFeedResponseCountdownSticker extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: ReelsMediaFeedResponseCountdownSticker](x: Self) {
    
    inline def setAttribution(value: Null): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setCountdown_id(value: Double): Self = StObject.set(x, "countdown_id", value.asInstanceOf[js.Any])
    
    inline def setDigit_card_color(value: String): Self = StObject.set(x, "digit_card_color", value.asInstanceOf[js.Any])
    
    inline def setDigit_color(value: String): Self = StObject.set(x, "digit_color", value.asInstanceOf[js.Any])
    
    inline def setEnd_background_color(value: String): Self = StObject.set(x, "end_background_color", value.asInstanceOf[js.Any])
    
    inline def setEnd_ts(value: Double): Self = StObject.set(x, "end_ts", value.asInstanceOf[js.Any])
    
    inline def setFollowing_enabled(value: Boolean): Self = StObject.set(x, "following_enabled", value.asInstanceOf[js.Any])
    
    inline def setIs_owner(value: Boolean): Self = StObject.set(x, "is_owner", value.asInstanceOf[js.Any])
    
    inline def setStart_background_color(value: String): Self = StObject.set(x, "start_background_color", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setText_color(value: String): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
    
    inline def setViewer_is_following(value: Boolean): Self = StObject.set(x, "viewer_is_following", value.asInstanceOf[js.Any])
  }
}
