package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseConsumptionSheetConfig extends js.Object {
  var can_viewer_donate: Boolean
  var currency: String
  var donation_amount_config: ListReelMediaViewerFeedResponseDonationAmountConfig
  var donation_disabled_message: Null
  var donation_url: String
  var has_viewer_donated: Boolean
  var privacy_disclaimer: String
  var you_donated_message: Null
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
}

