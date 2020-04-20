package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsInsightsFeedResponseTopPosts extends js.Object {
  var edges: js.Array[PostsInsightsFeedResponseEdgesItem]
  var page_info: PostsInsightsFeedResponsePageInfo
}

object PostsInsightsFeedResponseTopPosts {
  @scala.inline
  def apply(edges: js.Array[PostsInsightsFeedResponseEdgesItem], page_info: PostsInsightsFeedResponsePageInfo): PostsInsightsFeedResponseTopPosts = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseTopPosts]
  }
}

