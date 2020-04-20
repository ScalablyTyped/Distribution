package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseOrganic extends js.Object {
  var status: String
  var value: Double
}

object InsightsServiceAccountResponseOrganic {
  @scala.inline
  def apply(status: String, value: Double): InsightsServiceAccountResponseOrganic = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseOrganic]
  }
}

