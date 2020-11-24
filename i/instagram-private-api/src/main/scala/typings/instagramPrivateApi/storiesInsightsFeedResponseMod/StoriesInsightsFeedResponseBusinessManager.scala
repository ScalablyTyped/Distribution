package typings.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoriesInsightsFeedResponseBusinessManager extends js.Object {
  
  var stories_unit: StoriesInsightsFeedResponseStoriesUnit = js.native
}
object StoriesInsightsFeedResponseBusinessManager {
  
  @scala.inline
  def apply(stories_unit: StoriesInsightsFeedResponseStoriesUnit): StoriesInsightsFeedResponseBusinessManager = {
    val __obj = js.Dynamic.literal(stories_unit = stories_unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponseBusinessManager]
  }
  
  @scala.inline
  implicit class StoriesInsightsFeedResponseBusinessManagerOps[Self <: StoriesInsightsFeedResponseBusinessManager] (val x: Self) extends AnyVal {
    
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
    def setStories_unit(value: StoriesInsightsFeedResponseStoriesUnit): Self = this.set("stories_unit", value.asInstanceOf[js.Any])
  }
}
