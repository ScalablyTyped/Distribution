package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotAccountDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem extends js.Object {
  var data_points: js.Array[InsightsServiceAccountResponseDataPointsItem]
  var name: String
}

object InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem {
  @scala.inline
  def apply(data_points: js.Array[InsightsServiceAccountResponseDataPointsItem], name: String): InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem = {
    val __obj = js.Dynamic.literal(data_points = data_points, name = name)
  
    __obj.asInstanceOf[InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem]
  }
}

