package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineFeedResponseStoriesNetego extends StObject {
  
  var hide_unit_if_seen: String
  
  var id: Double
  
  var tracking_token: String
}
object TimelineFeedResponseStoriesNetego {
  
  inline def apply(hide_unit_if_seen: String, id: Double, tracking_token: String): TimelineFeedResponseStoriesNetego = {
    val __obj = js.Dynamic.literal(hide_unit_if_seen = hide_unit_if_seen.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tracking_token = tracking_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseStoriesNetego]
  }
  
  extension [Self <: TimelineFeedResponseStoriesNetego](x: Self) {
    
    inline def setHide_unit_if_seen(value: String): Self = StObject.set(x, "hide_unit_if_seen", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTracking_token(value: String): Self = StObject.set(x, "tracking_token", value.asInstanceOf[js.Any])
  }
}
