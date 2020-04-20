package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponseData extends js.Object {
  var media: InsightsServicePostResponseMedia
}

object InsightsServicePostResponseData {
  @scala.inline
  def apply(media: InsightsServicePostResponseMedia): InsightsServicePostResponseData = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseData]
  }
}

