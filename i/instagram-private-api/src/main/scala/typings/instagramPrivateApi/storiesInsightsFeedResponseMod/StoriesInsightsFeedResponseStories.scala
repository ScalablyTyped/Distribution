package typings.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoriesInsightsFeedResponseStories extends js.Object {
  var edges: js.Array[StoriesInsightsFeedResponseEdgesItem]
  var page_info: StoriesInsightsFeedResponsePageInfo
}

object StoriesInsightsFeedResponseStories {
  @scala.inline
  def apply(
    edges: js.Array[StoriesInsightsFeedResponseEdgesItem],
    page_info: StoriesInsightsFeedResponsePageInfo
  ): StoriesInsightsFeedResponseStories = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponseStories]
  }
}

