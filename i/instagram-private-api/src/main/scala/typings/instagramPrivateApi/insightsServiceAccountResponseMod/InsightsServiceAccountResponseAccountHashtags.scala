package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseAccountHashtags extends js.Object {
  var count: Double
  var nodes: js.Array[_]
}

object InsightsServiceAccountResponseAccountHashtags {
  @scala.inline
  def apply(count: Double, nodes: js.Array[_]): InsightsServiceAccountResponseAccountHashtags = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServiceAccountResponseAccountHashtags]
  }
}

