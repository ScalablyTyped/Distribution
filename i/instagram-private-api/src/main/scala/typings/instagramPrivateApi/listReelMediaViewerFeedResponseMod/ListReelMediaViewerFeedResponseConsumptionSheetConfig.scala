package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReelMediaViewerFeedResponseConsumptionSheetConfig extends StObject {
  
  var can_viewer_donate: Boolean = js.native
  
  var currency: String = js.native
  
  var donation_amount_config: ListReelMediaViewerFeedResponseDonationAmountConfig = js.native
  
  var donation_disabled_message: Null = js.native
  
  var donation_url: String = js.native
  
  var has_viewer_donated: Boolean = js.native
  
  var privacy_disclaimer: String = js.native
  
  var you_donated_message: Null = js.native
}
object ListReelMediaViewerFeedResponseConsumptionSheetConfig {
  
  @scala.inline
  def apply(
    can_viewer_donate: Boolean,
    currency: String,
    donation_amount_config: ListReelMediaViewerFeedResponseDonationAmountConfig,
    donation_disabled_message: Null,
    donation_url: String,
    has_viewer_donated: Boolean,
    privacy_disclaimer: String,
    you_donated_message: Null
  ): ListReelMediaViewerFeedResponseConsumptionSheetConfig = {
    val __obj = js.Dynamic.literal(can_viewer_donate = can_viewer_donate.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], donation_amount_config = donation_amount_config.asInstanceOf[js.Any], donation_disabled_message = donation_disabled_message.asInstanceOf[js.Any], donation_url = donation_url.asInstanceOf[js.Any], has_viewer_donated = has_viewer_donated.asInstanceOf[js.Any], privacy_disclaimer = privacy_disclaimer.asInstanceOf[js.Any], you_donated_message = you_donated_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseConsumptionSheetConfig]
  }
  
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseConsumptionSheetConfigMutableBuilder[Self <: ListReelMediaViewerFeedResponseConsumptionSheetConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCan_viewer_donate(value: Boolean): Self = StObject.set(x, "can_viewer_donate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonation_amount_config(value: ListReelMediaViewerFeedResponseDonationAmountConfig): Self = StObject.set(x, "donation_amount_config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonation_disabled_message(value: Null): Self = StObject.set(x, "donation_disabled_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonation_url(value: String): Self = StObject.set(x, "donation_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_viewer_donated(value: Boolean): Self = StObject.set(x, "has_viewer_donated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacy_disclaimer(value: String): Self = StObject.set(x, "privacy_disclaimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYou_donated_message(value: Null): Self = StObject.set(x, "you_donated_message", value.asInstanceOf[js.Any])
  }
}
