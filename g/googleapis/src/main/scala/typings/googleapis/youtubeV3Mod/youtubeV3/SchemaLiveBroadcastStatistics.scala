package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Statistics about the live broadcast. These represent a snapshot of the
  * values at the time of the request. Statistics are only returned for live
  * broadcasts.
  */
@js.native
trait SchemaLiveBroadcastStatistics extends js.Object {
  /**
    * The number of viewers currently watching the broadcast. The property and
    * its value will be present if the broadcast has current viewers and the
    * broadcast owner has not hidden the viewcount for the video. Note that
    * YouTube stops tracking the number of concurrent viewers for a broadcast
    * when the broadcast ends. So, this property would not identify the number
    * of viewers watching an archived video of a live broadcast that already
    * ended.
    */
  var concurrentViewers: js.UndefOr[String] = js.native
  /**
    * The total number of live chat messages currently on the broadcast. The
    * property and its value will be present if the broadcast is public, has
    * the live chat feature enabled, and has at least one message. Note that
    * this field will not be filled after the broadcast ends. So this property
    * would not identify the number of chat messages for an archived video of a
    * completed live broadcast.
    */
  var totalChatCount: js.UndefOr[String] = js.native
}

object SchemaLiveBroadcastStatistics {
  @scala.inline
  def apply(concurrentViewers: String = null, totalChatCount: String = null): SchemaLiveBroadcastStatistics = {
    val __obj = js.Dynamic.literal()
    if (concurrentViewers != null) __obj.updateDynamic("concurrentViewers")(concurrentViewers.asInstanceOf[js.Any])
    if (totalChatCount != null) __obj.updateDynamic("totalChatCount")(totalChatCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveBroadcastStatistics]
  }
}

