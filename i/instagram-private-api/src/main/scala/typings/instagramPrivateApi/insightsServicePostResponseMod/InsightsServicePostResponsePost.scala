package typings.instagramPrivateApi.insightsServicePostResponseMod

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
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServicePostResponsePost]
  }
}

