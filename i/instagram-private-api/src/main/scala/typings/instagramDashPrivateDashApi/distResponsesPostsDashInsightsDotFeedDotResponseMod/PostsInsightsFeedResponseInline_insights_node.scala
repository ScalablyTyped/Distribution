package typings.instagramDashPrivateDashApi.distResponsesPostsDashInsightsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsInsightsFeedResponseInline_insights_node extends js.Object {
  var metrics: PostsInsightsFeedResponseMetrics
  var state: String
}

object PostsInsightsFeedResponseInline_insights_node {
  @scala.inline
  def apply(metrics: PostsInsightsFeedResponseMetrics, state: String): PostsInsightsFeedResponseInline_insights_node = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostsInsightsFeedResponseInline_insights_node]
  }
}

