package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponseOrganic extends js.Object {
  var status: String
  var value: Double
}

object InsightsServicePostResponseOrganic {
  @scala.inline
  def apply(status: String, value: Double): InsightsServicePostResponseOrganic = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseOrganic]
  }
}

