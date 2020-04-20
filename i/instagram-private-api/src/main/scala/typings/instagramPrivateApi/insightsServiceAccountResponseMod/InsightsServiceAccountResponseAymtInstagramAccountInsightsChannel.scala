package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel extends js.Object {
  var channel_id: String
  var id: String
  var tips: js.Array[_]
}

object InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel {
  @scala.inline
  def apply(channel_id: String, id: String, tips: js.Array[_]): InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel = {
    val __obj = js.Dynamic.literal(channel_id = channel_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel]
  }
}

