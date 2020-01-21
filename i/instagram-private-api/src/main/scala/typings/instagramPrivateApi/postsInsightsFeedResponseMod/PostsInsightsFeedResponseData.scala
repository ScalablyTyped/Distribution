package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsInsightsFeedResponseData extends js.Object {
  var user: PostsInsightsFeedResponseUser
}

object PostsInsightsFeedResponseData {
  @scala.inline
  def apply(user: PostsInsightsFeedResponseUser): PostsInsightsFeedResponseData = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostsInsightsFeedResponseData]
  }
}

