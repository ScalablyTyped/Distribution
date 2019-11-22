package typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotPostDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponseImpressions extends js.Object {
  var surfaces: InsightsServicePostResponseSurfaces
  var value: Double
}

object InsightsServicePostResponseImpressions {
  @scala.inline
  def apply(surfaces: InsightsServicePostResponseSurfaces, value: Double): InsightsServicePostResponseImpressions = {
    val __obj = js.Dynamic.literal(surfaces = surfaces, value = value)
  
    __obj.asInstanceOf[InsightsServicePostResponseImpressions]
  }
}

