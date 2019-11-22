package typings.instagramDashPrivateDashApi.distResponsesDirectDashInboxDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectInboxFeedResponseInbox extends js.Object {
  var blended_inbox_enabled: Boolean
  var has_older: Boolean
  var oldest_cursor: String
  var threads: js.Array[DirectInboxFeedResponseThreadsItem]
  var unseen_count: Double
  var unseen_count_ts: String
}

object DirectInboxFeedResponseInbox {
  @scala.inline
  def apply(
    blended_inbox_enabled: Boolean,
    has_older: Boolean,
    oldest_cursor: String,
    threads: js.Array[DirectInboxFeedResponseThreadsItem],
    unseen_count: Double,
    unseen_count_ts: String
  ): DirectInboxFeedResponseInbox = {
    val __obj = js.Dynamic.literal(blended_inbox_enabled = blended_inbox_enabled, has_older = has_older, oldest_cursor = oldest_cursor, threads = threads, unseen_count = unseen_count, unseen_count_ts = unseen_count_ts)
  
    __obj.asInstanceOf[DirectInboxFeedResponseInbox]
  }
}

