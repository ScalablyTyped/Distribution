package typings.instagramPrivateApi.liveSwitchCommentsResponseMod

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
    val __obj = js.Dynamic.literal(comment_muted = comment_muted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LiveSwitchCommentsResponseRootObject]
  }
}

