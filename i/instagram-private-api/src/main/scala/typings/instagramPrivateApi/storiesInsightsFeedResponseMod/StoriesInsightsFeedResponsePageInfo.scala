package typings.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoriesInsightsFeedResponsePageInfo extends js.Object {
  var end_cursor: String
  var has_next_page: Boolean
}

object StoriesInsightsFeedResponsePageInfo {
  @scala.inline
  def apply(end_cursor: String, has_next_page: Boolean): StoriesInsightsFeedResponsePageInfo = {
    val __obj = js.Dynamic.literal(end_cursor = end_cursor.asInstanceOf[js.Any], has_next_page = has_next_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponsePageInfo]
  }
}

