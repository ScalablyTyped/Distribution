package typings.instagramDashPrivateDashApi.distResponsesStoriesDashInsightsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoriesInsightsFeedResponseStories extends js.Object {
  var edges: js.Array[StoriesInsightsFeedResponseEdgesItem]
  var page_info: StoriesInsightsFeedResponsePage_info
}

object StoriesInsightsFeedResponseStories {
  @scala.inline
  def apply(
    edges: js.Array[StoriesInsightsFeedResponseEdgesItem],
    page_info: StoriesInsightsFeedResponsePage_info
  ): StoriesInsightsFeedResponseStories = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoriesInsightsFeedResponseStories]
  }
}

