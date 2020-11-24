package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem extends js.Object {
  
  var amount_raised: String = js.native
  
  var charity: ListReelMediaViewerFeedResponseCharity = js.native
  
  var donations: ListReelMediaViewerFeedResponseDonations = js.native
  
  var fundraiser_id: String = js.native
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
  
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItemOps[Self <: ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount_raised(value: String): Self = this.set("amount_raised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharity(value: ListReelMediaViewerFeedResponseCharity): Self = this.set("charity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonations(value: ListReelMediaViewerFeedResponseDonations): Self = this.set("donations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFundraiser_id(value: String): Self = this.set("fundraiser_id", value.asInstanceOf[js.Any])
  }
}
