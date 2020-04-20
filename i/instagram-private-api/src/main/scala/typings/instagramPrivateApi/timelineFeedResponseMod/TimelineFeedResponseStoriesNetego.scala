package typings.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponseStoriesNetego extends js.Object {
  var hide_unit_if_seen: String
  var id: Double
  var tracking_token: String
}

object TimelineFeedResponseStoriesNetego {
  @scala.inline
  def apply(hide_unit_if_seen: String, id: Double, tracking_token: String): TimelineFeedResponseStoriesNetego = {
    val __obj = js.Dynamic.literal(hide_unit_if_seen = hide_unit_if_seen.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tracking_token = tracking_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseStoriesNetego]
  }
}

