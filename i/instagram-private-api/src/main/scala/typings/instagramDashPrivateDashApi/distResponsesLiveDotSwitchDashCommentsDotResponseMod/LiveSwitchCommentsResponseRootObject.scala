package typings.instagramDashPrivateDashApi.distResponsesLiveDotSwitchDashCommentsDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveSwitchCommentsResponseRootObject extends js.Object {
  var comment_muted: Double
  var status: String
}

object LiveSwitchCommentsResponseRootObject {
  @scala.inline
  def apply(comment_muted: Double, status: String): LiveSwitchCommentsResponseRootObject = {
    val __obj = js.Dynamic.literal(comment_muted = comment_muted, status = status)
  
    __obj.asInstanceOf[LiveSwitchCommentsResponseRootObject]
  }
}

