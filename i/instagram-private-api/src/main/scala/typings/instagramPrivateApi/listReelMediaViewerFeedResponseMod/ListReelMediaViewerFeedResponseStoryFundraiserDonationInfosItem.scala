package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem extends StObject {
  
  var amount_raised: String
  
  var charity: ListReelMediaViewerFeedResponseCharity
  
  var donations: ListReelMediaViewerFeedResponseDonations
  
  var fundraiser_id: String
}
object ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem {
  
  inline def apply(
    amount_raised: String,
    charity: ListReelMediaViewerFeedResponseCharity,
    donations: ListReelMediaViewerFeedResponseDonations,
    fundraiser_id: String
  ): ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem = {
    val __obj = js.Dynamic.literal(amount_raised = amount_raised.asInstanceOf[js.Any], charity = charity.asInstanceOf[js.Any], donations = donations.asInstanceOf[js.Any], fundraiser_id = fundraiser_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem]
  }
  
  extension [Self <: ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem](x: Self) {
    
    inline def setAmount_raised(value: String): Self = StObject.set(x, "amount_raised", value.asInstanceOf[js.Any])
    
    inline def setCharity(value: ListReelMediaViewerFeedResponseCharity): Self = StObject.set(x, "charity", value.asInstanceOf[js.Any])
    
    inline def setDonations(value: ListReelMediaViewerFeedResponseDonations): Self = StObject.set(x, "donations", value.asInstanceOf[js.Any])
    
    inline def setFundraiser_id(value: String): Self = StObject.set(x, "fundraiser_id", value.asInstanceOf[js.Any])
  }
}
