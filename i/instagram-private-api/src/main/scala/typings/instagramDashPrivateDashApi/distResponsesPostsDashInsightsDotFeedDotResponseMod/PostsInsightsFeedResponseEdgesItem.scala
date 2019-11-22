package typings.instagramDashPrivateDashApi.distResponsesPostsDashInsightsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsInsightsFeedResponseEdgesItem extends js.Object {
  var cursor: js.UndefOr[String] = js.undefined
  var node: PostsInsightsFeedResponseNode
}

object PostsInsightsFeedResponseEdgesItem {
  @scala.inline
  def apply(node: PostsInsightsFeedResponseNode, cursor: String = null): PostsInsightsFeedResponseEdgesItem = {
    val __obj = js.Dynamic.literal(node = node)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    __obj.asInstanceOf[PostsInsightsFeedResponseEdgesItem]
  }
}

