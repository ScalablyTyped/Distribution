package typings.instagramDashPrivateDashApi.distResponsesPostsDashInsightsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsInsightsFeedResponseTop_posts extends js.Object {
  var edges: js.Array[PostsInsightsFeedResponseEdgesItem]
  var page_info: PostsInsightsFeedResponsePage_info
}

object PostsInsightsFeedResponseTop_posts {
  @scala.inline
  def apply(edges: js.Array[PostsInsightsFeedResponseEdgesItem], page_info: PostsInsightsFeedResponsePage_info): PostsInsightsFeedResponseTop_posts = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostsInsightsFeedResponseTop_posts]
  }
}

