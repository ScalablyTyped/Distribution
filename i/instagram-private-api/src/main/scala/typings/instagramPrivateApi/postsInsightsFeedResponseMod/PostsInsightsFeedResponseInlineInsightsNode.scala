package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsInsightsFeedResponseInlineInsightsNode extends js.Object {
  var metrics: PostsInsightsFeedResponseMetrics
  var state: String
}

object PostsInsightsFeedResponseInlineInsightsNode {
  @scala.inline
  def apply(metrics: PostsInsightsFeedResponseMetrics, state: String): PostsInsightsFeedResponseInlineInsightsNode = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseInlineInsightsNode]
  }
}

