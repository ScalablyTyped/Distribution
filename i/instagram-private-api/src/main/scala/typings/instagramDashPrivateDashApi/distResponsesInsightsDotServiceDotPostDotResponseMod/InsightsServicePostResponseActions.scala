package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotPostDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponseActions extends js.Object {
  var nodes: js.Array[InsightsServicePostResponseNodesItem]
  var value: Double
}

object InsightsServicePostResponseActions {
  @scala.inline
  def apply(nodes: js.Array[InsightsServicePostResponseNodesItem], value: Double): InsightsServicePostResponseActions = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServicePostResponseActions]
  }
}

