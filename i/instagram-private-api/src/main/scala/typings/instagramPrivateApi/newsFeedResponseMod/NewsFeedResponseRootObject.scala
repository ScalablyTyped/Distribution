package typings.instagramPrivateApi.newsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewsFeedResponseRootObject extends js.Object {
  
  var auto_load_more_enabled: Boolean = js.native
  
  var next_max_id: Double = js.native
  
  var status: String = js.native
  
  var stories: js.Array[NewsFeedResponseStoriesItem] = js.native
}
object NewsFeedResponseRootObject {
  
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    next_max_id: Double,
    status: String,
    stories: js.Array[NewsFeedResponseStoriesItem]
  ): NewsFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class NewsFeedResponseRootObjectOps[Self <: NewsFeedResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setAuto_load_more_enabled(value: Boolean): Self = this.set("auto_load_more_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: Double): Self = this.set("next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoriesVarargs(value: NewsFeedResponseStoriesItem*): Self = this.set("stories", js.Array(value :_*))
    
    @scala.inline
    def setStories(value: js.Array[NewsFeedResponseStoriesItem]): Self = this.set("stories", value.asInstanceOf[js.Any])
  }
}
