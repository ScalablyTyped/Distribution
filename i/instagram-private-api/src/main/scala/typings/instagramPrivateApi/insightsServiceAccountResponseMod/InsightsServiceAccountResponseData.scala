package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseData extends js.Object {
  var user: InsightsServiceAccountResponseUser
}

object InsightsServiceAccountResponseData {
  @scala.inline
  def apply(user: InsightsServiceAccountResponseUser): InsightsServiceAccountResponseData = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServiceAccountResponseData]
  }
}

