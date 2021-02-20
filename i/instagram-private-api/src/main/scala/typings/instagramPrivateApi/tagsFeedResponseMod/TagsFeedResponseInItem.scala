package typings.instagramPrivateApi.tagsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsFeedResponseInItem extends StObject {
  
  var duration_in_video_in_sec: Null = js.native
  
  var position: js.Array[Double | String] = js.native
  
  var start_time_in_video_in_sec: Null = js.native
  
  var user: TagsFeedResponseUser = js.native
}
object TagsFeedResponseInItem {
  
  @scala.inline
  def apply(
    duration_in_video_in_sec: Null,
    position: js.Array[Double | String],
    start_time_in_video_in_sec: Null,
    user: TagsFeedResponseUser
  ): TagsFeedResponseInItem = {
    val __obj = js.Dynamic.literal(duration_in_video_in_sec = duration_in_video_in_sec.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], start_time_in_video_in_sec = start_time_in_video_in_sec.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseInItem]
  }
  
  @scala.inline
  implicit class TagsFeedResponseInItemMutableBuilder[Self <: TagsFeedResponseInItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration_in_video_in_sec(value: Null): Self = StObject.set(x, "duration_in_video_in_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: js.Array[Double | String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionVarargs(value: (Double | String)*): Self = StObject.set(x, "position", js.Array(value :_*))
    
    @scala.inline
    def setStart_time_in_video_in_sec(value: Null): Self = StObject.set(x, "start_time_in_video_in_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: TagsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
