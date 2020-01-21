package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseHashtagsReach extends js.Object {
  var follow_status: InsightsServiceAccountResponseFollowStatus
  var name: String
}

object InsightsServiceAccountResponseHashtagsReach {
  @scala.inline
  def apply(follow_status: InsightsServiceAccountResponseFollowStatus, name: String): InsightsServiceAccountResponseHashtagsReach = {
    val __obj = js.Dynamic.literal(follow_status = follow_status.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServiceAccountResponseHashtagsReach]
  }
}

