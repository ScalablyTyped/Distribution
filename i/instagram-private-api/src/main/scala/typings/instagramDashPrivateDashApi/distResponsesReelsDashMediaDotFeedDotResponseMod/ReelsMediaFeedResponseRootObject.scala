package typings.instagramDashPrivateDashApi.distResponsesReelsDashMediaDotFeedDotResponseMod

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
    val __obj = js.Dynamic.literal(reels = reels, status = status)
  
    __obj.asInstanceOf[ReelsMediaFeedResponseRootObject]
  }
}

