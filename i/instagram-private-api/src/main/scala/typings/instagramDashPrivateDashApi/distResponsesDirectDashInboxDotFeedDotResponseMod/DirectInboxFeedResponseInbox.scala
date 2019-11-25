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
    val __obj = js.Dynamic.literal(blended_inbox_enabled = blended_inbox_enabled.asInstanceOf[js.Any], has_older = has_older.asInstanceOf[js.Any], oldest_cursor = oldest_cursor.asInstanceOf[js.Any], threads = threads.asInstanceOf[js.Any], unseen_count = unseen_count.asInstanceOf[js.Any], unseen_count_ts = unseen_count_ts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectInboxFeedResponseInbox]
  }
}

