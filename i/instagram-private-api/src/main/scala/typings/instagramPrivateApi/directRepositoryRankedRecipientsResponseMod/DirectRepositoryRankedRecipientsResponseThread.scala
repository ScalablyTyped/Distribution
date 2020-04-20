package typings.instagramPrivateApi.directRepositoryRankedRecipientsResponseMod

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
    val __obj = js.Dynamic.literal(canonical = canonical.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], thread_title = thread_title.asInstanceOf[js.Any], thread_type = thread_type.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], viewer_id = viewer_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectRepositoryRankedRecipientsResponseThread]
  }
}

