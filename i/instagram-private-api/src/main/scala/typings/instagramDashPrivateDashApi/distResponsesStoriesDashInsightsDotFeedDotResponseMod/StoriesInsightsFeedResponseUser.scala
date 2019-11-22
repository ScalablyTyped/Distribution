package typings.instagramDashPrivateDashApi.distResponsesStoriesDashInsightsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoriesInsightsFeedResponseUser extends js.Object {
  var business_manager: StoriesInsightsFeedResponseBusiness_manager
  var id: String
}

object StoriesInsightsFeedResponseUser {
  @scala.inline
  def apply(business_manager: StoriesInsightsFeedResponseBusiness_manager, id: String): StoriesInsightsFeedResponseUser = {
    val __obj = js.Dynamic.literal(business_manager = business_manager, id = id)
  
    __obj.asInstanceOf[StoriesInsightsFeedResponseUser]
  }
}

