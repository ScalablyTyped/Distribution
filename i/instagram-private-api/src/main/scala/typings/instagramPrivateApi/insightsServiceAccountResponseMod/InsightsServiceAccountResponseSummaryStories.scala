package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseSummaryStories extends js.Object {
  var count: Double
  var edges: js.Array[_]
}

object InsightsServiceAccountResponseSummaryStories {
  @scala.inline
  def apply(count: Double, edges: js.Array[_]): InsightsServiceAccountResponseSummaryStories = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseSummaryStories]
  }
}

