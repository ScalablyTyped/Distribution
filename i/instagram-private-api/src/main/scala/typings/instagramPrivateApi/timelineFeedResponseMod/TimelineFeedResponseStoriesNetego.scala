package typings.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFeedResponseStoriesNetego extends js.Object {
  
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
  implicit class TimelineFeedResponseStoriesNetegoOps[Self <: TimelineFeedResponseStoriesNetego] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHide_unit_if_seen(value: String): Self = this.set("hide_unit_if_seen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracking_token(value: String): Self = this.set("tracking_token", value.asInstanceOf[js.Any])
  }
}
