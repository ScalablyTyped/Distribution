package typings.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationFeedResponseInItem extends StObject {
  
  var duration_in_video_in_sec: Null
  
  var position: js.Array[Double | String]
  
  var start_time_in_video_in_sec: Null
  
  var user: LocationFeedResponseUser
}
object LocationFeedResponseInItem {
  
  inline def apply(
    duration_in_video_in_sec: Null,
    position: js.Array[Double | String],
    start_time_in_video_in_sec: Null,
    user: LocationFeedResponseUser
  ): LocationFeedResponseInItem = {
    val __obj = js.Dynamic.literal(duration_in_video_in_sec = duration_in_video_in_sec.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], start_time_in_video_in_sec = start_time_in_video_in_sec.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseInItem]
  }
  
  extension [Self <: LocationFeedResponseInItem](x: Self) {
    
    inline def setDuration_in_video_in_sec(value: Null): Self = StObject.set(x, "duration_in_video_in_sec", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: js.Array[Double | String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionVarargs(value: (Double | String)*): Self = StObject.set(x, "position", js.Array(value :_*))
    
    inline def setStart_time_in_video_in_sec(value: Null): Self = StObject.set(x, "start_time_in_video_in_sec", value.asInstanceOf[js.Any])
    
    inline def setUser(value: LocationFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
