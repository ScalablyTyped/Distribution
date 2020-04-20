package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseDataPointsItem extends js.Object {
  var label: String
  var value: Double
}

object InsightsServiceAccountResponseDataPointsItem {
  @scala.inline
  def apply(label: String, value: Double): InsightsServiceAccountResponseDataPointsItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseDataPointsItem]
  }
}

