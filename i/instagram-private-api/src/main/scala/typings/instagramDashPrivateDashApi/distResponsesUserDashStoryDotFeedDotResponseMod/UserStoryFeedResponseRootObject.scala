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
    val __obj = js.Dynamic.literal(broadcast = broadcast.asInstanceOf[js.Any], reel = reel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserStoryFeedResponseRootObject]
  }
}

