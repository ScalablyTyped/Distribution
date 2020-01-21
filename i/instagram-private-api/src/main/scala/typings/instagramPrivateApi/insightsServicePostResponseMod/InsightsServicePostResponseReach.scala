package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponseReach extends js.Object {
  var follow_status: InsightsServicePostResponseFollowStatus
  var value: Double
}

object InsightsServicePostResponseReach {
  @scala.inline
  def apply(follow_status: InsightsServicePostResponseFollowStatus, value: Double): InsightsServicePostResponseReach = {
    val __obj = js.Dynamic.literal(follow_status = follow_status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServicePostResponseReach]
  }
}

