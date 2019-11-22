package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotAccountDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseNodesItem extends js.Object {
  var __typename: js.UndefOr[String] = js.undefined
  var data_points: js.UndefOr[js.Array[InsightsServiceAccountResponseDataPointsItem]] = js.undefined
  var delta: js.UndefOr[Null] = js.undefined
  var graph_name: js.UndefOr[String] = js.undefined
  var organic: js.UndefOr[InsightsServiceAccountResponseOrganic] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object InsightsServiceAccountResponseNodesItem {
  @scala.inline
  def apply(
    __typename: String = null,
    data_points: js.Array[InsightsServiceAccountResponseDataPointsItem] = null,
    delta: Null = null,
    graph_name: String = null,
    organic: InsightsServiceAccountResponseOrganic = null,
    total: Int | Double = null
  ): InsightsServiceAccountResponseNodesItem = {
    val __obj = js.Dynamic.literal()
    if (__typename != null) __obj.updateDynamic("__typename")(__typename)
    if (data_points != null) __obj.updateDynamic("data_points")(data_points)
    if (delta != null) __obj.updateDynamic("delta")(delta)
    if (graph_name != null) __obj.updateDynamic("graph_name")(graph_name)
    if (organic != null) __obj.updateDynamic("organic")(organic)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseNodesItem]
  }
}

