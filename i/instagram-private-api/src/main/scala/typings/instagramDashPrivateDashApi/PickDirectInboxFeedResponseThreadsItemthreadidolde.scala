package typings.instagramDashPrivateDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<instagram-private-api.instagram-private-api/dist/responses.DirectInboxFeedResponseThreadsItem, 'thread_id' | 'oldest_cursor'> */
trait PickDirectInboxFeedResponseThreadsItemthreadidolde extends js.Object {
  var oldest_cursor: String
  var thread_id: String
}

object PickDirectInboxFeedResponseThreadsItemthreadidolde {
  @scala.inline
  def apply(oldest_cursor: String, thread_id: String): PickDirectInboxFeedResponseThreadsItemthreadidolde = {
    val __obj = js.Dynamic.literal(oldest_cursor = oldest_cursor.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickDirectInboxFeedResponseThreadsItemthreadidolde]
  }
}

