package typings.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotConfigureDashVideoDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRepositoryConfigureVideoResponseInItem extends js.Object {
  var duration_in_video_in_sec: Null
  var position: js.Array[Double]
  var start_time_in_video_in_sec: Null
  var user: MediaRepositoryConfigureVideoResponseUser
}

object MediaRepositoryConfigureVideoResponseInItem {
  @scala.inline
  def apply(
    duration_in_video_in_sec: Null,
    position: js.Array[Double],
    start_time_in_video_in_sec: Null,
    user: MediaRepositoryConfigureVideoResponseUser
  ): MediaRepositoryConfigureVideoResponseInItem = {
    val __obj = js.Dynamic.literal(duration_in_video_in_sec = duration_in_video_in_sec.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], start_time_in_video_in_sec = start_time_in_video_in_sec.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaRepositoryConfigureVideoResponseInItem]
  }
}

