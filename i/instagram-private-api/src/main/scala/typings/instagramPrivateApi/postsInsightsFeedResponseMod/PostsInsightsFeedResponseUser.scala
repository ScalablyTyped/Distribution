package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsInsightsFeedResponseUser extends js.Object {
  var business_manager: PostsInsightsFeedResponseBusinessManager
  var id: String
}

object PostsInsightsFeedResponseUser {
  @scala.inline
  def apply(business_manager: PostsInsightsFeedResponseBusinessManager, id: String): PostsInsightsFeedResponseUser = {
    val __obj = js.Dynamic.literal(business_manager = business_manager.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostsInsightsFeedResponseUser]
  }
}

