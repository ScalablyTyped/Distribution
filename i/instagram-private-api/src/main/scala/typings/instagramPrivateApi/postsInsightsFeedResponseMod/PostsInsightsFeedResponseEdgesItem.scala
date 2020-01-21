package typings.instagramPrivateApi.postsInsightsFeedResponseMod

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
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseEdgesItem]
  }
}

