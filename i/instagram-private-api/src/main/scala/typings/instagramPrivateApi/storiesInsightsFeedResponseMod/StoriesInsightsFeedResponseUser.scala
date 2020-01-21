package typings.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoriesInsightsFeedResponseUser extends js.Object {
  var business_manager: StoriesInsightsFeedResponseBusinessManager
  var id: String
}

object StoriesInsightsFeedResponseUser {
  @scala.inline
  def apply(business_manager: StoriesInsightsFeedResponseBusinessManager, id: String): StoriesInsightsFeedResponseUser = {
    val __obj = js.Dynamic.literal(business_manager = business_manager.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoriesInsightsFeedResponseUser]
  }
}

