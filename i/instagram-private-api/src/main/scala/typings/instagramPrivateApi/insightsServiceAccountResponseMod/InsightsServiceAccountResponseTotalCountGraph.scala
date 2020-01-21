package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseTotalCountGraph extends js.Object {
  var data_points: js.Array[InsightsServiceAccountResponseDataPointsItem]
  var graph_name: String
}

object InsightsServiceAccountResponseTotalCountGraph {
  @scala.inline
  def apply(data_points: js.Array[InsightsServiceAccountResponseDataPointsItem], graph_name: String): InsightsServiceAccountResponseTotalCountGraph = {
    val __obj = js.Dynamic.literal(data_points = data_points.asInstanceOf[js.Any], graph_name = graph_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServiceAccountResponseTotalCountGraph]
  }
}

