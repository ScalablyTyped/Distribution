package typings.instagramDashPrivateDashApi.distResponsesNewsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewsFeedResponseRootObject extends js.Object {
  var auto_load_more_enabled: Boolean
  var next_max_id: Double
  var status: String
  var stories: js.Array[NewsFeedResponseStoriesItem]
}

object NewsFeedResponseRootObject {
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    next_max_id: Double,
    status: String,
    stories: js.Array[NewsFeedResponseStoriesItem]
  ): NewsFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled, next_max_id = next_max_id, status = status, stories = stories)
  
    __obj.asInstanceOf[NewsFeedResponseRootObject]
  }
}

