package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotPostDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponseInline_insights_node extends js.Object {
  var error: Null
  var metrics: InsightsServicePostResponseMetrics
  var state: String
}

object InsightsServicePostResponseInline_insights_node {
  @scala.inline
  def apply(error: Null, metrics: InsightsServicePostResponseMetrics, state: String): InsightsServicePostResponseInline_insights_node = {
    val __obj = js.Dynamic.literal(error = error, metrics = metrics, state = state)
  
    __obj.asInstanceOf[InsightsServicePostResponseInline_insights_node]
  }
}

