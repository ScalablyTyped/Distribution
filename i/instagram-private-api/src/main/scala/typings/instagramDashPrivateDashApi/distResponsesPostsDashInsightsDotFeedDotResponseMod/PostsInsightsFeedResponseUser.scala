package typings.instagramDashPrivateDashApi.distResponsesPostsDashInsightsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostsInsightsFeedResponseUser extends js.Object {
  var business_manager: PostsInsightsFeedResponseBusiness_manager
  var id: String
}

object PostsInsightsFeedResponseUser {
  @scala.inline
  def apply(business_manager: PostsInsightsFeedResponseBusiness_manager, id: String): PostsInsightsFeedResponseUser = {
    val __obj = js.Dynamic.literal(business_manager = business_manager, id = id)
  
    __obj.asInstanceOf[PostsInsightsFeedResponseUser]
  }
}

