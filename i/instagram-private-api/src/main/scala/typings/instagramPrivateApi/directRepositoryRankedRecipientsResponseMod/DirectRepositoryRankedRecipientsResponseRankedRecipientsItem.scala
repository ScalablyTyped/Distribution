package typings.instagramPrivateApi.directRepositoryRankedRecipientsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectRepositoryRankedRecipientsResponseRankedRecipientsItem extends js.Object {
  var thread: js.UndefOr[DirectRepositoryRankedRecipientsResponseThread] = js.undefined
  var user: js.UndefOr[DirectRepositoryRankedRecipientsResponseUser] = js.undefined
}

object DirectRepositoryRankedRecipientsResponseRankedRecipientsItem {
  @scala.inline
  def apply(
    thread: DirectRepositoryRankedRecipientsResponseThread = null,
    user: DirectRepositoryRankedRecipientsResponseUser = null
  ): DirectRepositoryRankedRecipientsResponseRankedRecipientsItem = {
    val __obj = js.Dynamic.literal()
    if (thread != null) __obj.updateDynamic("thread")(thread.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectRepositoryRankedRecipientsResponseRankedRecipientsItem]
  }
}

