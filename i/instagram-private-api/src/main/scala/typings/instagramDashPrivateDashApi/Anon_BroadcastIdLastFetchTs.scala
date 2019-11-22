package typings.instagramDashPrivateDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BroadcastIdLastFetchTs extends js.Object {
  var broadcastId: String
  var lastFetchTs: Double | String
  var lastSeenTs: Double | String
  var lastTotalCount: Double | String
}

object Anon_BroadcastIdLastFetchTs {
  @scala.inline
  def apply(
    broadcastId: String,
    lastFetchTs: Double | String,
    lastSeenTs: Double | String,
    lastTotalCount: Double | String
  ): Anon_BroadcastIdLastFetchTs = {
    val __obj = js.Dynamic.literal(broadcastId = broadcastId, lastFetchTs = lastFetchTs.asInstanceOf[js.Any], lastSeenTs = lastSeenTs.asInstanceOf[js.Any], lastTotalCount = lastTotalCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BroadcastIdLastFetchTs]
  }
}

