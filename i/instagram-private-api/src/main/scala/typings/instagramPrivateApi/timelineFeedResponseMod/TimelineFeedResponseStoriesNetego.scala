package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFeedResponseStoriesNetego extends StObject {
  
  var hide_unit_if_seen: String = js.native
  
  var id: Double = js.native
  
  var tracking_token: String = js.native
}
object TimelineFeedResponseStoriesNetego {
  
  @scala.inline
  def apply(hide_unit_if_seen: String, id: Double, tracking_token: String): TimelineFeedResponseStoriesNetego = {
    val __obj = js.Dynamic.literal(hide_unit_if_seen = hide_unit_if_seen.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tracking_token = tracking_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseStoriesNetego]
  }
  
  @scala.inline
  implicit class TimelineFeedResponseStoriesNetegoMutableBuilder[Self <: TimelineFeedResponseStoriesNetego] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide_unit_if_seen(value: String): Self = StObject.set(x, "hide_unit_if_seen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracking_token(value: String): Self = StObject.set(x, "tracking_token", value.asInstanceOf[js.Any])
  }
}
