package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotAccountDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseTotal_count_graph extends js.Object {
  var data_points: js.Array[InsightsServiceAccountResponseDataPointsItem]
  var graph_name: String
}

object InsightsServiceAccountResponseTotal_count_graph {
  @scala.inline
  def apply(data_points: js.Array[InsightsServiceAccountResponseDataPointsItem], graph_name: String): InsightsServiceAccountResponseTotal_count_graph = {
    val __obj = js.Dynamic.literal(data_points = data_points.asInstanceOf[js.Any], graph_name = graph_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServiceAccountResponseTotal_count_graph]
  }
}

