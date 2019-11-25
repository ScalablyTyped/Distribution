package typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseDonation_amount_config extends js.Object {
  var default_selected_donation_value: Double
  var donation_amount_selector_values: js.Array[Double]
  var maximum_donation_amount: Double
  var minimum_donation_amount: Double
  var user_currency: String
}

object ListReelMediaViewerFeedResponseDonation_amount_config {
  @scala.inline
  def apply(
    default_selected_donation_value: Double,
    donation_amount_selector_values: js.Array[Double],
    maximum_donation_amount: Double,
    minimum_donation_amount: Double,
    user_currency: String
  ): ListReelMediaViewerFeedResponseDonation_amount_config = {
    val __obj = js.Dynamic.literal(default_selected_donation_value = default_selected_donation_value.asInstanceOf[js.Any], donation_amount_selector_values = donation_amount_selector_values.asInstanceOf[js.Any], maximum_donation_amount = maximum_donation_amount.asInstanceOf[js.Any], minimum_donation_amount = minimum_donation_amount.asInstanceOf[js.Any], user_currency = user_currency.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseDonation_amount_config]
  }
}

