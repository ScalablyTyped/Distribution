package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReelMediaViewerFeedResponseDonationAmountConfig extends js.Object {
  
  var default_selected_donation_value: Double = js.native
  
  var donation_amount_selector_values: js.Array[Double] = js.native
  
  var maximum_donation_amount: Double = js.native
  
  var minimum_donation_amount: Double = js.native
  
  var user_currency: String = js.native
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
  implicit class ListReelMediaViewerFeedResponseDonationAmountConfigOps[Self <: ListReelMediaViewerFeedResponseDonationAmountConfig] (val x: Self) extends AnyVal {
    
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
    def setDefault_selected_donation_value(value: Double): Self = this.set("default_selected_donation_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonation_amount_selector_valuesVarargs(value: Double*): Self = this.set("donation_amount_selector_values", js.Array(value :_*))
    
    @scala.inline
    def setDonation_amount_selector_values(value: js.Array[Double]): Self = this.set("donation_amount_selector_values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximum_donation_amount(value: Double): Self = this.set("maximum_donation_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum_donation_amount(value: Double): Self = this.set("minimum_donation_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_currency(value: String): Self = this.set("user_currency", value.asInstanceOf[js.Any])
  }
}
