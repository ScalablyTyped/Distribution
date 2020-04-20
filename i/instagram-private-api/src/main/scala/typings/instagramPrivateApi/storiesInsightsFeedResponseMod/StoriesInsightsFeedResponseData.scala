package typings.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoriesInsightsFeedResponseData extends js.Object {
  var user: StoriesInsightsFeedResponseUser
}

object StoriesInsightsFeedResponseData {
  @scala.inline
  def apply(user: StoriesInsightsFeedResponseUser): StoriesInsightsFeedResponseData = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponseData]
  }
}

