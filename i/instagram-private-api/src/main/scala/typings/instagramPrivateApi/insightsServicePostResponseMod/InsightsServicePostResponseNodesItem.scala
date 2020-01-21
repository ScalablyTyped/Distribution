package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponseNodesItem extends js.Object {
  var __typename: String
  var name: js.UndefOr[String] = js.undefined
  var value: Double
}

object InsightsServicePostResponseNodesItem {
  @scala.inline
  def apply(__typename: String, value: Double, name: String = null): InsightsServicePostResponseNodesItem = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseNodesItem]
  }
}

