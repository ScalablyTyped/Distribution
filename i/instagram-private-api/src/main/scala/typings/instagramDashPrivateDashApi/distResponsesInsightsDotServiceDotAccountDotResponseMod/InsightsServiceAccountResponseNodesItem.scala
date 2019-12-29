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
    delta: js.UndefOr[scala.Nothing] = js.undefined,
    graph_name: String = null,
    organic: InsightsServiceAccountResponseOrganic = null,
    total: Int | Double = null
  ): InsightsServiceAccountResponseNodesItem = {
    val __obj = js.Dynamic.literal()
    if (__typename != null) __obj.updateDynamic("__typename")(__typename.asInstanceOf[js.Any])
    if (data_points != null) __obj.updateDynamic("data_points")(data_points.asInstanceOf[js.Any])
    if (!js.isUndefined(delta)) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (graph_name != null) __obj.updateDynamic("graph_name")(graph_name.asInstanceOf[js.Any])
    if (organic != null) __obj.updateDynamic("organic")(organic.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseNodesItem]
  }
}

