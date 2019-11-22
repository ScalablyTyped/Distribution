package typings.instagramDashPrivateDashApi.distResponsesDirectDotRepositoryDotRankedDashRecipientsDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectRepositoryRankedRecipientsResponseThread extends js.Object {
  var canonical: Boolean
  var named: Boolean
  var pending: Boolean
  var thread_id: String
  var thread_title: String
  var thread_type: String
  var users: js.Array[DirectRepositoryRankedRecipientsResponseUsersItem]
  var viewer_id: Double
}

object DirectRepositoryRankedRecipientsResponseThread {
  @scala.inline
  def apply(
    canonical: Boolean,
    named: Boolean,
    pending: Boolean,
    thread_id: String,
    thread_title: String,
    thread_type: String,
    users: js.Array[DirectRepositoryRankedRecipientsResponseUsersItem],
    viewer_id: Double
  ): DirectRepositoryRankedRecipientsResponseThread = {
    val __obj = js.Dynamic.literal(canonical = canonical, named = named, pending = pending, thread_id = thread_id, thread_title = thread_title, thread_type = thread_type, users = users, viewer_id = viewer_id)
  
    __obj.asInstanceOf[DirectRepositoryRankedRecipientsResponseThread]
  }
}

