package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotPostDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponseReach extends js.Object {
  var follow_status: InsightsServicePostResponseFollow_status
  var value: Double
}

object InsightsServicePostResponseReach {
  @scala.inline
  def apply(follow_status: InsightsServicePostResponseFollow_status, value: Double): InsightsServicePostResponseReach = {
    val __obj = js.Dynamic.literal(follow_status = follow_status, value = value)
  
    __obj.asInstanceOf[InsightsServicePostResponseReach]
  }
}

