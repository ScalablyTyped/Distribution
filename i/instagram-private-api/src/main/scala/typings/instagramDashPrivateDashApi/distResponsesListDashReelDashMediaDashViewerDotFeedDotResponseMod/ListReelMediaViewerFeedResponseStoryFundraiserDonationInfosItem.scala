package typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem extends js.Object {
  var amount_raised: String
  var charity: ListReelMediaViewerFeedResponseCharity
  var donations: ListReelMediaViewerFeedResponseDonations
  var fundraiser_id: String
}

object ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem {
  @scala.inline
  def apply(
    amount_raised: String,
    charity: ListReelMediaViewerFeedResponseCharity,
    donations: ListReelMediaViewerFeedResponseDonations,
    fundraiser_id: String
  ): ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem = {
    val __obj = js.Dynamic.literal(amount_raised = amount_raised.asInstanceOf[js.Any], charity = charity.asInstanceOf[js.Any], donations = donations.asInstanceOf[js.Any], fundraiser_id = fundraiser_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem]
  }
}

