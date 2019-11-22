package typings.instagramDashPrivateDashApi.distResponsesPostsDashInsightsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsInsightsFeedResponsePage_info extends js.Object {
  var end_cursor: String
  var has_next_page: Boolean
}

object PostsInsightsFeedResponsePage_info {
  @scala.inline
  def apply(end_cursor: String, has_next_page: Boolean): PostsInsightsFeedResponsePage_info = {
    val __obj = js.Dynamic.literal(end_cursor = end_cursor, has_next_page = has_next_page)
  
    __obj.asInstanceOf[PostsInsightsFeedResponsePage_info]
  }
}

