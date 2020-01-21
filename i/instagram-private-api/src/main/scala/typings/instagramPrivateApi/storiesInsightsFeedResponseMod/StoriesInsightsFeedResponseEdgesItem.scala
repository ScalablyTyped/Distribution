package typings.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoriesInsightsFeedResponseEdgesItem extends js.Object {
  var cursor: Null
  var node: StoriesInsightsFeedResponseNode
}

object StoriesInsightsFeedResponseEdgesItem {
  @scala.inline
  def apply(cursor: Null, node: StoriesInsightsFeedResponseNode): StoriesInsightsFeedResponseEdgesItem = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoriesInsightsFeedResponseEdgesItem]
  }
}

