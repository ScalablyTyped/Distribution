package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsMediaFeedResponseRootObject extends js.Object {
  var reels: ReelsMediaFeedResponseReels
  var status: String
}

object ReelsMediaFeedResponseRootObject {
  @scala.inline
  def apply(reels: ReelsMediaFeedResponseReels, status: String): ReelsMediaFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(reels = reels.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseRootObject]
  }
}

