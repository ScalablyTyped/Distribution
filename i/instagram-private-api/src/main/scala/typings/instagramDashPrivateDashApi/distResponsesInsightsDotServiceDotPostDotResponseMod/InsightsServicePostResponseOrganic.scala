package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotPostDotResponseMod

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
    val __obj = js.Dynamic.literal(status = status, value = value)
  
    __obj.asInstanceOf[InsightsServicePostResponseOrganic]
  }
}

