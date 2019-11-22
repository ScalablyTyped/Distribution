package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotPostDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponsePost extends js.Object {
  var nodes: js.Array[InsightsServicePostResponseNodesItem]
  var value: Double
}

object InsightsServicePostResponsePost {
  @scala.inline
  def apply(nodes: js.Array[InsightsServicePostResponseNodesItem], value: Double): InsightsServicePostResponsePost = {
    val __obj = js.Dynamic.literal(nodes = nodes, value = value)
  
    __obj.asInstanceOf[InsightsServicePostResponsePost]
  }
}

