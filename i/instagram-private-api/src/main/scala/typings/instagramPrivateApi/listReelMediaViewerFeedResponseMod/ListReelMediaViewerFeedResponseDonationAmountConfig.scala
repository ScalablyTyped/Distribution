package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReelMediaViewerFeedResponseDonationAmountConfig extends StObject {
  
  var default_selected_donation_value: Double
  
  var donation_amount_selector_values: js.Array[Double]
  
  var maximum_donation_amount: Double
  
  var minimum_donation_amount: Double
  
  var user_currency: String
}
object ListReelMediaViewerFeedResponseDonationAmountConfig {
  
  @scala.inline
  def apply(
    default_selected_donation_value: Double,
    donation_amount_selector_values: js.Array[Double],
    maximum_donation_amount: Double,
    minimum_donation_amount: Double,
    user_currency: String
  ): ListReelMediaViewerFeedResponseDonationAmountConfig = {
    val __obj = js.Dynamic.literal(default_selected_donation_value = default_selected_donation_value.asInstanceOf[js.Any], donation_amount_selector_values = donation_amount_selector_values.asInstanceOf[js.Any], maximum_donation_amount = maximum_donation_amount.asInstanceOf[js.Any], minimum_donation_amount = minimum_donation_amount.asInstanceOf[js.Any], user_currency = user_currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseDonationAmountConfig]
  }
  
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseDonationAmountConfigMutableBuilder[Self <: ListReelMediaViewerFeedResponseDonationAmountConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault_selected_donation_value(value: Double): Self = StObject.set(x, "default_selected_donation_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonation_amount_selector_values(value: js.Array[Double]): Self = StObject.set(x, "donation_amount_selector_values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonation_amount_selector_valuesVarargs(value: Double*): Self = StObject.set(x, "donation_amount_selector_values", js.Array(value :_*))
    
    @scala.inline
    def setMaximum_donation_amount(value: Double): Self = StObject.set(x, "maximum_donation_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum_donation_amount(value: Double): Self = StObject.set(x, "minimum_donation_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_currency(value: String): Self = StObject.set(x, "user_currency", value.asInstanceOf[js.Any])
  }
}
