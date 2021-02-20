package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem extends StObject {
  
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
  implicit class ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItemMutableBuilder[Self <: ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount_raised(value: String): Self = StObject.set(x, "amount_raised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharity(value: ListReelMediaViewerFeedResponseCharity): Self = StObject.set(x, "charity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonations(value: ListReelMediaViewerFeedResponseDonations): Self = StObject.set(x, "donations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFundraiser_id(value: String): Self = StObject.set(x, "fundraiser_id", value.asInstanceOf[js.Any])
  }
}
