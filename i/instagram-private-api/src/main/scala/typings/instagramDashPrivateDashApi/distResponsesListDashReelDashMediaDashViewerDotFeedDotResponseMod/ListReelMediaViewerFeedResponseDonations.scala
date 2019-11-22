package typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseDonations extends js.Object {
  var donations: js.Array[_]
  var max_id: Null
  var more_available: Boolean
}

object ListReelMediaViewerFeedResponseDonations {
  @scala.inline
  def apply(donations: js.Array[_], max_id: Null, more_available: Boolean): ListReelMediaViewerFeedResponseDonations = {
    val __obj = js.Dynamic.literal(donations = donations, max_id = max_id, more_available = more_available)
  
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseDonations]
  }
}

