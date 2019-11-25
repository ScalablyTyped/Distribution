package typings.instagramDashPrivateDashApi.distResponsesStoriesDashInsightsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoriesInsightsFeedResponsePage_info extends js.Object {
  var end_cursor: String
  var has_next_page: Boolean
}

object StoriesInsightsFeedResponsePage_info {
  @scala.inline
  def apply(end_cursor: String, has_next_page: Boolean): StoriesInsightsFeedResponsePage_info = {
    val __obj = js.Dynamic.literal(end_cursor = end_cursor.asInstanceOf[js.Any], has_next_page = has_next_page.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoriesInsightsFeedResponsePage_info]
  }
}

