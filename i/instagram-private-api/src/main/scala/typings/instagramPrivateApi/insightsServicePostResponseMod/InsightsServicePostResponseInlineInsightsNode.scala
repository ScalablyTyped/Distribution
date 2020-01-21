package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponseInlineInsightsNode extends js.Object {
  var error: Null
  var metrics: InsightsServicePostResponseMetrics
  var state: String
}

object InsightsServicePostResponseInlineInsightsNode {
  @scala.inline
  def apply(error: Null, metrics: InsightsServicePostResponseMetrics, state: String): InsightsServicePostResponseInlineInsightsNode = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServicePostResponseInlineInsightsNode]
  }
}

