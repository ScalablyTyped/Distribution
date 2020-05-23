package typings.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponseHideReasonsV2Item extends js.Object {
  var reason: String | Null
  var text: String
}

object TimelineFeedResponseHideReasonsV2Item {
  @scala.inline
  def apply(text: String, reason: String = null): TimelineFeedResponseHideReasonsV2Item = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseHideReasonsV2Item]
  }
}

