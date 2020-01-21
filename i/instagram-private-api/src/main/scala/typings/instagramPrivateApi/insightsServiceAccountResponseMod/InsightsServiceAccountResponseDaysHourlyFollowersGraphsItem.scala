package typings.instagramPrivateApi.insightsServiceAccountResponseMod

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
    val __obj = js.Dynamic.literal(data_points = data_points.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServiceAccountResponseDaysHourlyFollowersGraphsItem]
  }
}

