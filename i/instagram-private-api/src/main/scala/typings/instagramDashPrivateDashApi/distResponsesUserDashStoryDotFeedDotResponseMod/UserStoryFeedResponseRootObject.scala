package typings.instagramDashPrivateDashApi.distResponsesUserDashStoryDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserStoryFeedResponseRootObject extends js.Object {
  var broadcast: Null
  var reel: UserStoryFeedResponseReel
  var status: String
}

object UserStoryFeedResponseRootObject {
  @scala.inline
  def apply(broadcast: Null, reel: UserStoryFeedResponseReel, status: String): UserStoryFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(broadcast = broadcast, reel = reel, status = status)
  
    __obj.asInstanceOf[UserStoryFeedResponseRootObject]
  }
}

