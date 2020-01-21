package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponseHashtags extends js.Object {
  var count: Double
  var nodes: js.Array[_]
}

object InsightsServicePostResponseHashtags {
  @scala.inline
  def apply(count: Double, nodes: js.Array[_]): InsightsServicePostResponseHashtags = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServicePostResponseHashtags]
  }
}

