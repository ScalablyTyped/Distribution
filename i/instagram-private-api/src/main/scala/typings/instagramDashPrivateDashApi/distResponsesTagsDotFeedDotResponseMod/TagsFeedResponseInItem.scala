package typings.instagramDashPrivateDashApi.distResponsesTagsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsFeedResponseInItem extends js.Object {
  var duration_in_video_in_sec: Null
  var position: js.Array[Double | String]
  var start_time_in_video_in_sec: Null
  var user: TagsFeedResponseUser
}

object TagsFeedResponseInItem {
  @scala.inline
  def apply(
    duration_in_video_in_sec: Null,
    position: js.Array[Double | String],
    start_time_in_video_in_sec: Null,
    user: TagsFeedResponseUser
  ): TagsFeedResponseInItem = {
    val __obj = js.Dynamic.literal(duration_in_video_in_sec = duration_in_video_in_sec, position = position, start_time_in_video_in_sec = start_time_in_video_in_sec, user = user)
  
    __obj.asInstanceOf[TagsFeedResponseInItem]
  }
}

