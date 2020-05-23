package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastFetchTs extends js.Object {
  var broadcastId: String
  var lastFetchTs: Double | String
  var lastSeenTs: Double | String
  var lastTotalCount: Double | String
}

object LastFetchTs {
  @scala.inline
  def apply(
    broadcastId: String,
    lastFetchTs: Double | String,
    lastSeenTs: Double | String,
    lastTotalCount: Double | String
  ): LastFetchTs = {
    val __obj = js.Dynamic.literal(broadcastId = broadcastId.asInstanceOf[js.Any], lastFetchTs = lastFetchTs.asInstanceOf[js.Any], lastSeenTs = lastSeenTs.asInstanceOf[js.Any], lastTotalCount = lastTotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastFetchTs]
  }
}

